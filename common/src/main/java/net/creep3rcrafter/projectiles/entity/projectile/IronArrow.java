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

public class IronArrow extends AbstractArrow {
    public IronArrow(EntityType<? extends IronArrow> entityType, Level level) {
        super(entityType, level);
    }

    public IronArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.IRON_ARROW.get(), x, y, z, level);
    }

    public IronArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.IRON_ARROW.get(), livingEntity, level);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.NETHERITE_BLOCK_HIT;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.IRON_ARROW.get());
    }
}
