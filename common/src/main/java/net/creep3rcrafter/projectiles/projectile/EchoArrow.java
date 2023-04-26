package net.creep3rcrafter.projectiles.projectile;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;

public class EchoArrow extends Arrow {
    public EchoArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public EchoArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public EchoArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);if (!this.level.isClientSide) {
            float range = 20;
            if (level.getServer().getLevel(level.dimension()) != null) {
                if (this.getOwner()!= null) {
                    ServerLevel serverLevel = level.getServer().getLevel(level.dimension());
                    LivingEntity livingEntity;
                    if (serverLevel.getNearestPlayer(this, range) != null && serverLevel.getNearestPlayer(this, range) != this.getOwner()) {
                        livingEntity = serverLevel.getNearestPlayer(this, range);
                    }else if(serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range,range,range)) !=null &&
                            serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range,range,range))!=this.getOwner()) {
                        livingEntity = serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range,range,range));
                    }else{
                        livingEntity = null;
                    }

                    if (livingEntity != null) {
                        Vec3 vec32 = livingEntity.getEyePosition().subtract(this.position());
                        Vec3 vec33 = vec32.normalize();
                        for(int i = 1; i < Mth.floor(vec32.length()) + 7; ++i) {
                            Vec3 vec34 = this.position().add(vec33.scale((double)i));
                            serverLevel.sendParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                        }

                        this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                        livingEntity.hurt(DamageSource.sonicBoom(this.getOwner()), 10.0F);
                        double d = 0.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        double e = 2.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                    }else{
                        this.playSound(SoundEvents.GLASS_BREAK, 1.0F, 1.0F);
                    }
                }
            }
            this.remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        float range = 20;
        if (!this.level.isClientSide) {
            if (level.getServer().getLevel(level.dimension()) != null) {
                if (this.getOwner()!= null) {
                    ServerLevel serverLevel = level.getServer().getLevel(level.dimension());
                    LivingEntity livingEntity;
                    if (serverLevel.getNearestPlayer(this, range) != null && serverLevel.getNearestPlayer(this, range) != this.getOwner()) {
                        livingEntity = serverLevel.getNearestPlayer(this, range);
                    }else if(serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range,range,range)) !=null &&
                            serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range,range,range))!=this.getOwner()) {
                        livingEntity = serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range,range,range));
                    }else{
                        livingEntity = null;
                    }

                    if (livingEntity != null) {
                        Vec3 vec32 = livingEntity.getEyePosition().subtract(this.position());
                        Vec3 vec33 = vec32.normalize();
                        for(int i = 1; i < Mth.floor(vec32.length()) + 7; ++i) {
                            Vec3 vec34 = this.position().add(vec33.scale((double)i));
                            serverLevel.sendParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                        }

                        this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                        livingEntity.hurt(DamageSource.sonicBoom(this.getOwner()), 10.0F);
                        double d = 0.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        double e = 2.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                    }else{
                        this.playSound(SoundEvents.GLASS_BREAK, 1.0F, 1.0F);
                    }
                }
            }
            this.remove(RemovalReason.DISCARDED);
        }
    }
}
