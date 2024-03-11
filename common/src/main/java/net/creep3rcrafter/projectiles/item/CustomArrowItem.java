package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.entity.projectile.CopperArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomArrowItem extends BaseArrowItem {
    public CustomArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        CopperArrow arrow = new CopperArrow(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }

    @Override
    public void onCraftedBy(ItemStack itemStack, Level level, Player player) {
        super.onCraftedBy(itemStack, level, player);
    }


    @Override
    public double getBaseDamage() {
        return 3D;
    }
}
