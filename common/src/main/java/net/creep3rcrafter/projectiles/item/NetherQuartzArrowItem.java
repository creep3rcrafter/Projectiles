package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.NetherQuartzArrow;
import net.creep3rcrafter.projectiles.projectile.NetheriteArrow;
import net.creep3rcrafter.projectiles.projectile.ObsidianArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NetherQuartzArrowItem extends ArrowItem {
    public NetherQuartzArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        NetherQuartzArrow arrow = new NetherQuartzArrow(level, livingEntity);
        return arrow;
    }

}
