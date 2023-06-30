package net.creep3rcrafter.projectiles.projectile;

import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class AmethystArrow extends Arrow {
    public AmethystArrow(EntityType<? extends Arrow> entityType, Level level) {
        super(entityType, level);
    }

    public AmethystArrow(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    public AmethystArrow(Level level, LivingEntity livingEntity) {
        super(level, livingEntity);
    }

    @Override
    protected SoundEvent getDefaultHitGroundSoundEvent() {
        return SoundEvents.SMALL_AMETHYST_BUD_BREAK;
    }
}
