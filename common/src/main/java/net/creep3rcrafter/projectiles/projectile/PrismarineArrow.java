package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;

public class PrismarineArrow extends Arrow {
    public PrismarineArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public PrismarineArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public PrismarineArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }
    @Override
    protected float getWaterInertia() {
        return 1F;
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    public void tick() {
        super.tick();
        clearFire();
    }

    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.TRIDENT_HIT_GROUND;
    }
}
