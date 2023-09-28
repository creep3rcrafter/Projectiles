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

public class AmethystArrow extends AbstractArrow {
    public AmethystArrow(EntityType<? extends AmethystArrow> entityType, Level level) {
        super(entityType, level);
    }

    public AmethystArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.AMETHYST_ARROW.get(), x, y, z, level);
    }

    public AmethystArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.AMETHYST_ARROW.get(), livingEntity, level);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.AMETHYST_ARROW.get());
    }
}
