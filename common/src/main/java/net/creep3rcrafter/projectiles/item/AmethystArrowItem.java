package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.entity.projectile.AmethystArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AmethystArrowItem extends BaseArrowItem {

    public AmethystArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        AmethystArrow arrow = new AmethystArrow(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }

    @Override
    public double getBaseDamage() {
        return 4D;
    }
}