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

public class BambooArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.BAMBOO_ARROW.get());
    public BambooArrow(EntityType<? extends BambooArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public BambooArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.BAMBOO_ARROW.get(), x, y, z, level, itemStack);
    }

    public BambooArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.BAMBOO_ARROW.get(), livingEntity, level, itemStack);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.BAMBOO_BREAK;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}
