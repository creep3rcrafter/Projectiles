package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.CopperArrow;
import net.creep3rcrafter.projectiles.projectile.GoldArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GoldArrowItem extends ArrowItem {
    public GoldArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        GoldArrow arrow = new GoldArrow(level, livingEntity);
        return arrow;
    }

}
