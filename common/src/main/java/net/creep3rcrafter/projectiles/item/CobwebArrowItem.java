package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.CobwebArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CobwebArrowItem extends CustomArrowItem {
    public CobwebArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        CobwebArrow arrow = new CobwebArrow(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
        arrow.setKnockback(0);
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }
    @Override
    public double getBaseDamage() {
        return 0.5D;
    }
}
