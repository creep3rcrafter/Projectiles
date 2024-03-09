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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class SoulArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.SOUL_ARROW.get());

    public SoulArrow(EntityType<? extends SoulArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public SoulArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.SOUL_ARROW.get(), x, y, z, level, itemStack);
    }

    public SoulArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.SOUL_ARROW.get(), livingEntity, level, itemStack);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level().isClientSide) {
            discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level().isClientSide) {
            discard();
        }
    }

    /*
    @Override
    public void tick() {
        super.tick();
        tickDespawn();
    }

    @Override
    public void tickDespawn() {
        ++this.life;
        if (this.life >= 600) {
            this.discard();
        }
    }
    */

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SOUL_ESCAPE;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}
