package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.projectile.SlimeArrow;
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

public class SlimeArrowItem extends CustomArrowItem {
    public SlimeArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        SlimeArrow arrow = new SlimeArrow(level, livingEntity);
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }
    @Override
    public double getBaseDamage() {
        return 1D;
    }
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        list.add(Component.translatable("Base Knockback: 5").withStyle(ChatFormatting.GREEN));
        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }

}
