package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.creep3rcrafter.projectiles.utils.Utils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class TNTArrow extends AbstractArrow {

    public TNTArrow(EntityType<? extends TNTArrow> entityType, Level level) {
        super(entityType, level);
    }

    public TNTArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.TNT_ARROW.get(), x, y, z, level);
    }

    public TNTArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.TNT_ARROW.get(), livingEntity, level);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            Utils.explode(this.level, entityHitResult.getEntity().blockPosition(), 2f);
            discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            Utils.explode(this.level, blockHitResult.getBlockPos(), 2f);
            discard();
        }
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.CREEPER_PRIMED;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.TNT_ARROW.get());
    }
}
