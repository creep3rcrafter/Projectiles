package net.creep3rcrafter.projectiles.projectile;

import net.creep3rcrafter.projectiles.utils.Utils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class TNTArrow extends Arrow {

    public TNTArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public TNTArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public TNTArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
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
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.CREEPER_PRIMED;
    }
}
