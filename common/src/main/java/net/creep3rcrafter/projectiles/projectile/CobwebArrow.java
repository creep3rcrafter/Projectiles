package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class CobwebArrow extends Arrow {

    public CobwebArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public CobwebArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public CobwebArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            ServerLevel serverLevel = this.level.getServer().getLevel(level.dimension());
            if (serverLevel.getBlockState(entityHitResult.getEntity().blockPosition()).getMaterial().isReplaceable()){
                serverLevel.setBlock(entityHitResult.getEntity().blockPosition(), Blocks.COBWEB.defaultBlockState(), 3);
            }
            this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            ServerLevel serverLevel = this.level.getServer().getLevel(level.dimension());
            if (serverLevel.getBlockState(this.blockPosition()).getMaterial().isReplaceable()){
                serverLevel.setBlock(this.blockPosition(), Blocks.COBWEB.defaultBlockState(), 3);
            }
            this.discard();
        }
    }


    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.WOOL_PLACE;
    }
}
