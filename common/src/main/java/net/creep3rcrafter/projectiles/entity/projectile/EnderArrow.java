package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class EnderArrow extends AbstractArrow {
    public EnderArrow(EntityType<? extends EnderArrow> entityType, Level level) {
        super(entityType, level);
    }

    public EnderArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.ENDER_ARROW.get(), x, y, z, level);
    }

    public EnderArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.ENDER_ARROW.get(), livingEntity, level);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            if (this.getOwner() != null) {
                this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                this.getOwner().teleportTo(this.position().x, this.position().y, this.position().z);
            }
            this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            if (this.getOwner() != null) {
                this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                this.getOwner().teleportTo(this.position().x, this.position().y, this.position().z);
            }
            this.discard();
        }
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.ENDER_ARROW.get());
    }
}
