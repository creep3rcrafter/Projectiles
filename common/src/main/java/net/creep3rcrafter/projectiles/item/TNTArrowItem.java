package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.EchoArrow;
import net.creep3rcrafter.projectiles.projectile.TNTArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TNTArrowItem extends ArrowItem {
    public TNTArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        TNTArrow arrow = new TNTArrow(level, livingEntity);
        return arrow;
    }

}
