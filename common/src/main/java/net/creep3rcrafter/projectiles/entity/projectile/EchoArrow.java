package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class EchoArrow extends AbstractArrow {
    public static final float SONIC_DAMAGE = 4;
    private int tick;

    public EchoArrow(EntityType<? extends EchoArrow> entityType, Level level) {
        super(entityType, level);
    }

    public EchoArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.ECHO_ARROW.get(), x, y, z, level);
    }

    public EchoArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.ECHO_ARROW.get(), livingEntity, level);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level().isClientSide) {
            float range = 20;
            if (level().getServer().getLevel(level().dimension()) != null) {
                ServerLevel serverLevel = level().getServer().getLevel(level().dimension());
                LivingEntity livingEntity;
                if (serverLevel.getNearestPlayer(this, range) != null && serverLevel.getNearestPlayer(this, range) != this.getOwner()) {
                    livingEntity = serverLevel.getNearestPlayer(this, range);
                } else if (serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != null &&
                        serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != this.getOwner()) {
                    livingEntity = serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range));
                } else {
                    livingEntity = null;
                }

                if (livingEntity != null) {
                    Vec3 vec32 = livingEntity.getEyePosition().subtract(this.position());
                    Vec3 vec33 = vec32.normalize();
                    for (int i = 1; i < Mth.floor(vec32.length()) + 7; ++i) {
                        Vec3 vec34 = this.position().add(vec33.scale(i));
                        serverLevel.sendParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                    }

                    this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                    livingEntity.hurt(serverLevel.damageSources().sonicBoom(this.getOwner()), 5.0F);
                    double d = 0.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                    double e = 2.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                    livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                } else {
                    this.playSound(SoundEvents.GLASS_BREAK, 1.0F, 1.0F);
                }
            }
            this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        float range = 20;
        if (!this.level().isClientSide) {
            if (level().getServer().getLevel(level().dimension()) != null) {
                if (this.getOwner() != null) {
                    ServerLevel serverLevel = level().getServer().getLevel(level().dimension());
                    LivingEntity livingEntity;
                    if (serverLevel.getNearestPlayer(this, range) != null && serverLevel.getNearestPlayer(this, range) != this.getOwner()) {
                        livingEntity = serverLevel.getNearestPlayer(this, range);
                    } else if (serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != null &&
                            serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range)) != this.getOwner()) {
                        livingEntity = serverLevel.getNearestEntity(LivingEntity.class, TargetingConditions.forCombat(), null, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(range, range, range));
                    } else {
                        livingEntity = null;
                    }

                    if (livingEntity != null) {
                        Vec3 vec32 = livingEntity.getEyePosition().subtract(this.position());
                        Vec3 vec33 = vec32.normalize();
                        for (int i = 1; i < Mth.floor(vec32.length()) + 7; ++i) {
                            Vec3 vec34 = this.position().add(vec33.scale(i));
                            serverLevel.sendParticles(ParticleTypes.SONIC_BOOM, vec34.x, vec34.y, vec34.z, 1, 0.0, 0.0, 0.0, 0.0);
                        }

                        this.playSound(SoundEvents.WARDEN_SONIC_BOOM, 3.0F, 1.0F);
                        livingEntity.hurt(serverLevel.damageSources().sonicBoom(this.getOwner()), SONIC_DAMAGE);
                        double d = 0.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        double e = 2.5 * (1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                        livingEntity.push(vec33.x() * e, vec33.y() * d, vec33.z() * e);
                    } else {
                        this.playSound(SoundEvents.SMALL_AMETHYST_BUD_BREAK, 1.0F, 1.0F);
                    }
                }
            }
            this.discard();
        }
    }

    @Override
    public void tick() {
        tick++;
        if (tick == 1) {
            this.playSound(SoundEvents.WARDEN_SONIC_CHARGE, 0.5F, 40.0F);
        }
        super.tick();
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return new ItemStack(ModItems.ECHO_ARROW.get());
    }
}
