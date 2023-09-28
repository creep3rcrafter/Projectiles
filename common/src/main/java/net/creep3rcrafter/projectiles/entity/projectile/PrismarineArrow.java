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

public class PrismarineArrow extends AbstractArrow {
    public PrismarineArrow(EntityType<? extends PrismarineArrow> entityType, Level level) {
        super(entityType, level);
    }

    public PrismarineArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.PRISMARINE_ARROW.get(), x, y, z, level);
    }

    public PrismarineArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.PRISMARINE_ARROW.get(), livingEntity, level);
    }

    @Override
    protected float getWaterInertia() {
        return 1F;
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    public void tick() {
        super.tick();
        clearFire();
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.TRIDENT_HIT_GROUND;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.PRISMARINE_ARROW.get());
    }
}
