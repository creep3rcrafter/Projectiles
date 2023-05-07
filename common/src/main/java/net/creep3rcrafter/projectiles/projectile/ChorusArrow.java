package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ChorusFruitItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class ChorusArrow extends Arrow {

    public ChorusArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public ChorusArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public ChorusArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            LivingEntity livingEntity = (LivingEntity) entityHitResult.getEntity();
            double d = livingEntity.getX();
            double e = livingEntity.getY();
            double f = livingEntity.getZ();

            for(int i = 0; i < 16; ++i) {
                double g = livingEntity.getX() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                double h = Mth.clamp(livingEntity.getY() + (double)(livingEntity.getRandom().nextInt(16) - 8), (double)level.getMinBuildHeight(), (double)(level.getMinBuildHeight() + ((ServerLevel)level).getLogicalHeight() - 1));
                double j = livingEntity.getZ() + (livingEntity.getRandom().nextDouble() - 0.5) * 16.0;
                if (livingEntity.isPassenger()) {
                    livingEntity.stopRiding();
                }

                Vec3 vec3 = livingEntity.position();
                if (livingEntity.randomTeleport(g, h, j, true)) {
                    level.gameEvent(GameEvent.TELEPORT, vec3, GameEvent.Context.of(livingEntity));
                    SoundEvent soundEvent = livingEntity instanceof Fox ? SoundEvents.FOX_TELEPORT : SoundEvents.CHORUS_FRUIT_TELEPORT;
                    level.playSound((Player)null, d, e, f, soundEvent, SoundSource.PLAYERS, 1.0F, 1.0F);
                    livingEntity.playSound(soundEvent, 1.0F, 1.0F);
                    break;
                }
            this.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT);
            this.discard();
            }
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            this.discard();
        }
    }

    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.CROP_PLANTED;
    }
}
