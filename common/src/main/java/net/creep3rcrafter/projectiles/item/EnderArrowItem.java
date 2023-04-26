package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.EchoArrow;
import net.creep3rcrafter.projectiles.projectile.EnderArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnderArrowItem extends ArrowItem {
    public EnderArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        EnderArrow arrow = new EnderArrow(level, livingEntity);
        return arrow;
    }

}
