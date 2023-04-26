package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.SlimeArrow;
import net.creep3rcrafter.projectiles.projectile.TNTArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SlimeArrowItem extends ArrowItem {
    public SlimeArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        SlimeArrow arrow = new SlimeArrow(level, livingEntity);
        return arrow;
    }

}
