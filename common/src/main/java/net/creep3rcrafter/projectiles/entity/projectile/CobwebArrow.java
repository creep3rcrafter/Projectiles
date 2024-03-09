package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class CobwebArrow extends AbstractArrow {
    public static final ItemStack ARROW_ITEMSTACK = new ItemStack(ModItems.COBWEB_ARROW.get());

    public CobwebArrow(EntityType<? extends CobwebArrow> entityType, Level level) {
        super(entityType, level, ARROW_ITEMSTACK);
    }

    public CobwebArrow(Level level, double x, double y, double z, ItemStack itemStack) {
        super(ModEntityTypes.COBWEB_ARROW.get(), x, y, z, level, itemStack);
    }

    public CobwebArrow(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(ModEntityTypes.COBWEB_ARROW.get(), livingEntity, level, itemStack);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level().isClientSide) {
            ServerLevel serverLevel = this.level().getServer().getLevel(level().dimension());
            if (serverLevel.getBlockState(entityHitResult.getEntity().blockPosition()).canBeReplaced()) {
                serverLevel.setBlock(entityHitResult.getEntity().blockPosition(), Blocks.COBWEB.defaultBlockState(), 3);
            }
            this.discard();
        }
    }

    @Override

    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level().isClientSide) {
            ServerLevel serverLevel = this.level().getServer().getLevel(level().dimension());
            if (serverLevel.getBlockState(this.blockPosition()).canBeReplaced()) {
                serverLevel.setBlock(this.blockPosition(), Blocks.COBWEB.defaultBlockState(), 3);
            }
            this.discard();
        }
    }


    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.WOOL_PLACE;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ARROW_ITEMSTACK;
    }
}
