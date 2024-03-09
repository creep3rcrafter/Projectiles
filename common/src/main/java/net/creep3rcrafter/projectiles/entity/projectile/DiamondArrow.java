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

public class DiamondArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.DIAMOND_ARROW.get());
    public DiamondArrow(EntityType<? extends DiamondArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public DiamondArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.DIAMOND_ARROW.get(), x, y, z, level, itemStack);
    }

    public DiamondArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.DIAMOND_ARROW.get(), livingEntity, level, itemStack);
    }


    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}
