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

public class ObsidianArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.OBSIDIAN_ARROW.get());
    public ObsidianArrow(EntityType<? extends ObsidianArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public ObsidianArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.OBSIDIAN_ARROW.get(), x, y, z, level, itemStack);
    }

    public ObsidianArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.OBSIDIAN_ARROW.get(), livingEntity, level, itemStack);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.AMETHYST_BLOCK_BREAK;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}
