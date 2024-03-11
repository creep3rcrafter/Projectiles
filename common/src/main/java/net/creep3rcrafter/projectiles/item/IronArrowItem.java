package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.entity.projectile.IronArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class IronArrowItem extends BaseArrowItem {
    public IronArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        IronArrow arrow = new IronArrow(level, livingEntity);
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }

    @Override
    public double getBaseDamage() {
        return 4D;
    }

}
