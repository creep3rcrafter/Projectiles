package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class WoodArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.WOOD_ARROW.get());

    public WoodArrow(EntityType<? extends WoodArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public WoodArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.WOOD_ARROW.get(), x, y, z, level, itemStack);
    }

    public WoodArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.WOOD_ARROW.get(), livingEntity, level, itemStack);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.WOODEN_BUTTON_CLICK_OFF;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}
