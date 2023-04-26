package net.creep3rcrafter.projectiles.projectile;

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
}
