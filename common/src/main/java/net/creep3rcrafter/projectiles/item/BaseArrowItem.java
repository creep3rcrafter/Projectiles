package net.creep3rcrafter.projectiles.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class BaseArrowItem extends ArrowItem {
    public BaseArrowItem(Properties properties) {
        super(properties);
    }

    public double getBaseDamage() {
        return 0;
    }

    @Override
    public AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
        return super.createArrow(level, itemStack, livingEntity);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        list.add(Component.translatable(getBaseDamage() + " Base Damage").withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }
}
