package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class CopperArrow extends Arrow {
    public CopperArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public CopperArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public CopperArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide){
            ServerLevel serverLevel = this.level.getServer().getLevel(this.level.dimension());
            RandomSource random = serverLevel.getRandom();
            if (random.nextFloat() <= 0.5F) {
                if (serverLevel.isThundering()){
                    LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                    lightningBolt.moveTo(Vec3.atBottomCenterOf(entityHitResult.getEntity().getOnPos()));
                    lightningBolt.setCause(getOwner() instanceof ServerPlayer ? (ServerPlayer) getOwner() : null);
                    serverLevel.addFreshEntity(lightningBolt);
                    discard();
                }
            }
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide){
            ServerLevel serverLevel = this.level.getServer().getLevel(this.level.dimension());
            RandomSource random = serverLevel.getRandom();
            if (random.nextFloat() <= 0.5F) {
                if (serverLevel.isThundering()){
                    LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                    lightningBolt.moveTo(Vec3.atBottomCenterOf(blockHitResult.getBlockPos()));
                    lightningBolt.setCause(getOwner() instanceof ServerPlayer ? (ServerPlayer) getOwner() : null);
                    serverLevel.addFreshEntity(lightningBolt);
                    discard();
                }
            }
        }
    }


    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.COPPER_HIT;
    }
}
