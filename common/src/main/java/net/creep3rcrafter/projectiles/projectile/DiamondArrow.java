package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;

public class DiamondArrow extends Arrow {
    public DiamondArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public DiamondArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public DiamondArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }
}
