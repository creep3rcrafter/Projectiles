package net.creep3rcrafter.projectiles.projectile;

import net.creep3rcrafter.projectiles.utils.Utils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

public class SlimeArrow extends Arrow {
    public SlimeArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public SlimeArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public SlimeArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    public static final int BASE_KNOCKBACK = 4;

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
    public void setKnockback(int i) {
        super.setKnockback(i + BASE_KNOCKBACK);
    }

    @Override
    protected @NotNull SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SLIME_JUMP;
    }
}