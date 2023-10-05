package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.creep3rcrafter.projectiles.utils.Utils;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class Dynamite extends ThrowableItemProjectile {
    public Dynamite(EntityType<? extends Dynamite> entityType, Level level) {
        super(entityType, level);
    }

    public Dynamite(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.DYNAMITE.get(), livingEntity, level);
    }

    public Dynamite(Level level, double x, double y, double z) {
        super(ModEntityTypes.DYNAMITE.get(), x, y, z, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return ModItems.DYNAMITE.get();
    }

    private ParticleOptions getParticle() {
        ItemStack itemStack = this.getItemRaw();
        return itemStack.isEmpty() ? ParticleTypes.ASH : new ItemParticleOption(ParticleTypes.ITEM, itemStack);
    }

    public void handleEntityEvent(byte b) {
        if (b == 3) {
            ParticleOptions particleOptions = this.getParticle();

            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(particleOptions, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }

    }

    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), (float) 1);
        Utils.explode(this.level(), entityHitResult.getEntity().blockPosition(), 2f);
        discard();
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level().isClientSide) {
            Utils.explode(this.level(), blockHitResult.getBlockPos(), 2f);
            discard();
        }
    }
}
