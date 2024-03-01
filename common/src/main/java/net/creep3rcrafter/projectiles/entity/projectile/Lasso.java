package net.creep3rcrafter.projectiles.entity.projectile;

import net.creep3rcrafter.projectiles.register.ModEntityTypes;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.LeadItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Lasso extends ThrowableItemProjectile {
    public Lasso(EntityType<? extends Lasso> entityType, Level level) {
        super(entityType, level);
    }

    public Lasso(Level level, LivingEntity livingEntity) {
        super(ModEntityTypes.DYNAMITE.get(), livingEntity, level);
    }

    public Lasso(Level level, double d, double e, double f) {
        super(ModEntityTypes.DYNAMITE.get(), d, e, f, level);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return ModItems.DYNAMITE.get();
    }

    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Player player = (Player) getOwner();
        BlockPos blockPos = entityHitResult.getEntity().blockPosition();
        if (!level.isClientSide && player != null) {
            LeadItem.bindPlayerMobs(player, entityHitResult.getEntity().getLevel(), blockPos);
            level.gameEvent(GameEvent.BLOCK_ATTACH, blockPos, GameEvent.Context.of(player));
            this.discard();
        }
    }

    public void tick() {
        Entity entity = this.getOwner();
        if (entity instanceof Player && !entity.isAlive()) {
            this.discard();
        } else {
            super.tick();
        }

    }

    @Nullable
    public Entity changeDimension(ServerLevel serverLevel) {
        Entity entity = this.getOwner();
        if (entity != null && entity.level.dimension() != serverLevel.dimension()) {
            this.setOwner(null);
        }

        return super.changeDimension(serverLevel);
    }
}
