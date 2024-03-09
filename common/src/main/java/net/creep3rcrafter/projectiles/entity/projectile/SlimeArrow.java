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

public class SlimeArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.SLIME_ARROW.get());
    public static final int BASE_KNOCKBACK = 4;

    public SlimeArrow(EntityType<? extends SlimeArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public SlimeArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.SLIME_ARROW.get(), x, y, z, level, itemStack);
    }

    public SlimeArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.SLIME_ARROW.get(), livingEntity, level, itemStack);
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

    @Override
    public void setKnockback(int i) {
        super.setKnockback(i + BASE_KNOCKBACK);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SLIME_JUMP;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}