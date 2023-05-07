package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.ChorusArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChorusArrowItem extends CustomArrowItem {
    public ChorusArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        ChorusArrow arrow = new ChorusArrow(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }
    @Override
    public double getBaseDamage() {
        return 0.5D;
    }

}
