package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class GoldArrow extends Arrow {
    public GoldArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public GoldArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public GoldArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }
    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.COPPER_PLACE;
    }
}
