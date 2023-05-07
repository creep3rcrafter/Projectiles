package net.creep3rcrafter.projectiles.projectile;

import net.creep3rcrafter.projectiles.utils.Utils;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class SoulArrow extends Arrow {

    public SoulArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public SoulArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public SoulArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            discard();
        }
    }

    @Override
    public void tick() {
        super.tick();
        tickDespawn();
    }

    @Override
    protected void tickDespawn() {
        ++this.life;
        if (this.life >= 600) {
            this.discard();
        }
    }

    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SOUL_ESCAPE;
    }
}
