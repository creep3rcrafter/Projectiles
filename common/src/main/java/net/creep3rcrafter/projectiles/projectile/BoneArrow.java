package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;

public class BoneArrow extends Arrow {
    public BoneArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public BoneArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public BoneArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }


    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.BONE_BLOCK_BREAK;
    }
}
