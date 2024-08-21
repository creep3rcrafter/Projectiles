package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class CustomArrow extends AbstractArrow {

    private static final EntityDataAccessor<Float> TIP;
    private static final EntityDataAccessor<Float> ROD;
    private static final EntityDataAccessor<Float> TAIL;
    //public float tail;
    //public float rod;

    public CustomArrow(EntityType<? extends CustomArrow> entityType, Level level) {
        super(entityType, level);
        //this.tip = 0;
        //this.rod = 0;
        //this.tail = 0;
    }

    public CustomArrow(Level level, double x, double y, double z) {
        super(ModEntityTypes.CUSTOM_ARROW.get(), x, y, z, level);
    }

    public CustomArrow(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.CUSTOM_ARROW.get(), livingEntity, level);
    }
    static {
        TIP = SynchedEntityData.defineId(CustomArrow.class, EntityDataSerializers.FLOAT);
        ROD = SynchedEntityData.defineId(CustomArrow.class, EntityDataSerializers.FLOAT);
        TAIL = SynchedEntityData.defineId(CustomArrow.class, EntityDataSerializers.FLOAT);
    }
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(TIP, 0.0f);
        this.entityData.define(ROD, 0.0f);
        this.entityData.define(TAIL, 0.0f);
    }


    @Override
    protected float getWaterInertia() {
        if (getTip() == 0.55f){
            return 1f;
        }else {
            return super.getWaterInertia();
        }
    }

    @Override
    public boolean fireImmune() {
        if (getTip() == 0.55f){
            return true;
        }else {
            return super.fireImmune();
        }
    }
    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            if (getTip() == 0.15f) {
                ServerLevel serverLevel = this.level.getServer().getLevel(this.level.dimension());
                RandomSource random = serverLevel.getRandom();
                if (random.nextFloat() <= 0.5F) {
                    if (serverLevel.isThundering()) {
                        LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                        lightningBolt.moveTo(Vec3.atBottomCenterOf(entityHitResult.getEntity().getOnPos()));
                        lightningBolt.setCause(getOwner() instanceof ServerPlayer ? (ServerPlayer) getOwner() : null);
                        serverLevel.addFreshEntity(lightningBolt);
                        discard();
                    }
                }
            }
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            if (getTip() == 0.15f) {
                ServerLevel serverLevel = this.level.getServer().getLevel(this.level.dimension());
                RandomSource random = serverLevel.getRandom();
                if (random.nextFloat() <= 0.5F) {
                    if (serverLevel.isThundering()) {
                        LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
                        lightningBolt.moveTo(Vec3.atBottomCenterOf(blockHitResult.getBlockPos()));
                        lightningBolt.setCause(getOwner() instanceof ServerPlayer ? (ServerPlayer) getOwner() : null);
                        serverLevel.addFreshEntity(lightningBolt);
                        discard();
                    }
                }
            }
        }
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.WOODEN_BUTTON_CLICK_OFF;
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        ItemStack itemStack = new ItemStack(ModItems.CUSTOM_ARROW.get());
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        compoundTag.putFloat("tip", getTip());
        compoundTag.putFloat("rod", getRod());
        compoundTag.putFloat("tail", getTail());
        return itemStack.copy();
        //return new ItemStack(ModItems.WOOD_ARROW.get());
    }

    public float getTip() {
        return this.entityData.get(TIP);
    }

    public void setTip(float tip) {
        this.entityData.set(TIP, tip);
    }

    public float getRod() {
        return this.entityData.get(ROD);
    }

    public void setRod(float rod) {
        this.entityData.set(ROD, rod);
    }

    public float getTail() {
        return this.entityData.get(TAIL);
    }

    public void setTail(float tail) {
        this.entityData.set(TAIL, tail);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        //compoundTag.putFloat("tip", tip);
        //compoundTag.putFloat("rod", rod);
        //compoundTag.putFloat("tail", tail);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        /*
        if (compoundTag.contains("tip")){
            setTip(compoundTag.getFloat("tip"));
        }
        if (compoundTag.contains("rod")){
            setRod(compoundTag.getFloat("rod"));
        }
        if (compoundTag.contains("tail")){
            setTail(compoundTag.getFloat("tail"));
        }
         */
    }
}
