package net.creep3rcrafter.projectiles.projectile;

import net.creep3rcrafter.projectiles.utils.Utils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class EnderArrow extends Arrow {
    public EnderArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public EnderArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public EnderArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        if (!this.level.isClientSide) {
            if(this.getOwner()!= null){
                this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                this.getOwner().teleportTo(this.position().x, this.position().y, this.position().z);
            }
            this.discard();
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        if (!this.level.isClientSide) {
            if(this.getOwner()!= null){
                this.playSound(SoundEvents.ENDERMAN_TELEPORT);
                this.getOwner().teleportTo(this.position().x, this.position().y, this.position().z);
            }
            this.discard();
        }
    }
}
