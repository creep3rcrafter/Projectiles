package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.DiamondArrow;
import net.creep3rcrafter.projectiles.projectile.IronArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DiamondArrowItem extends ArrowItem {
    public DiamondArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        DiamondArrow arrow = new DiamondArrow(level, livingEntity);
        return arrow;
    }

}
