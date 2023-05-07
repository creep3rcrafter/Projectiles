package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.AmethystArrow;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AmethystArrowItem extends CustomArrowItem {

    public AmethystArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
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
