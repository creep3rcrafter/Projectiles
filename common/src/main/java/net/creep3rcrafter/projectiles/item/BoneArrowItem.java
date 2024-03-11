package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.entity.projectile.BoneArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BoneArrowItem extends BaseArrowItem {
    public BoneArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        BoneArrow arrow = new BoneArrow(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        arrow.setBaseDamage(getBaseDamage());
        return arrow;
    }

    @Override
    public double getBaseDamage() {
        return 1.75D;
    }

}
