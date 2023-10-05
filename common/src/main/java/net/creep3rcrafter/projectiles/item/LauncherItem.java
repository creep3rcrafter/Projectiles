package net.creep3rcrafter.projectiles.item;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.CrossbowAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Predicate;

public class LauncherItem extends CrossbowItem {
    public static final Predicate<ItemStack> VALID_PROJECTILES = (itemStack) -> {
        return (itemStack.is(Items.ARROW) ||
                itemStack.is(Items.FIREWORK_ROCKET) ||
                itemStack.is(Items.FIRE_CHARGE) ||
                itemStack.is(Items.BLAZE_POWDER) ||
                itemStack.is(Items.SNOWBALL) ||
                itemStack.is(Items.EGG) ||
                itemStack.is(Items.ENDER_PEARL) ||
                itemStack.is(Items.EXPERIENCE_BOTTLE) ||
                itemStack.is(Items.SPLASH_POTION) ||
                itemStack.is(Items.LINGERING_POTION) ||
                itemStack.is(Items.TNT));
    };
    private static final float ARROW_POWER = 3.15F;
    private static final float FIREWORK_POWER = 1.6F;

    public LauncherItem(Properties properties) {
        super(properties);
    }

    private static void shootProjectile(Level level, LivingEntity livingEntity, InteractionHand interactionHand, ItemStack itemStack, ItemStack itemStack2, float f, boolean bl, float g, float h, float i) {
        if (!level.isClientSide) {
            boolean arrow = itemStack2.is(Items.ARROW);
            boolean firework = itemStack2.is(Items.FIREWORK_ROCKET);
            boolean fire_charge = itemStack2.is(Items.FIRE_CHARGE);
            boolean blaze_powder = itemStack2.is(Items.BLAZE_POWDER);
            boolean snowball = itemStack2.is(Items.SNOWBALL);
            boolean egg = itemStack2.is(Items.EGG);
            boolean ender_pearl = itemStack2.is(Items.ENDER_PEARL);
            boolean experience_bottle = itemStack2.is(Items.EXPERIENCE_BOTTLE);
            boolean splash_potion = itemStack2.is(Items.SPLASH_POTION);
            boolean lingering_potion = itemStack2.is(Items.LINGERING_POTION);
            boolean tnt = itemStack2.is(Items.TNT);
            Object projectile;
            if (firework) {
                System.out.println("firework");
                projectile = new FireworkRocketEntity(level, itemStack2, livingEntity, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ(), true);
            } else if (fire_charge) {
                System.out.println("fire_charge");
                projectile = new LargeFireball(level, livingEntity, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ(), 2);
            } else if (blaze_powder) {
                System.out.println("blaze_powder");
                projectile = new SmallFireball(level, livingEntity, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (snowball) {
                System.out.println("snowball");
                projectile = new Snowball(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (egg) {
                System.out.println("egg");
                projectile = new ThrownEgg(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (ender_pearl) {
                System.out.println("ender_pearl");
                projectile = new ThrownEnderpearl(level, livingEntity);
                ((ThrownEnderpearl) projectile).setItem(itemStack2);
            } else if (experience_bottle) {
                System.out.println("experience_bottle");
                projectile = new ThrownExperienceBottle(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
            } else if (splash_potion || lingering_potion) {
                System.out.println("potion");
                projectile = new ThrownPotion(level, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ());
                ((ThrownPotion) projectile).setItem(itemStack2);
            } else if (tnt) {
                System.out.println("tnt");
                projectile = new FireworkRocketEntity(level, itemStack2, livingEntity, livingEntity.getX(), livingEntity.getEyeY() - 0.15000000596046448, livingEntity.getZ(), true);
            } else {
                System.out.println("arrow");
                projectile = getArrow(level, livingEntity, itemStack, itemStack2);
                if (bl || i != 0.0F) {
                    ((AbstractArrow) projectile).pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                }
            }

            if (livingEntity instanceof CrossbowAttackMob crossbowAttackMob) {
                crossbowAttackMob.shootCrossbowProjectile(crossbowAttackMob.getTarget(), itemStack, (Projectile) projectile, i);
            } else {
                Vec3 vec3 = livingEntity.getUpVector(1.0F);
                Quaternion quaternion = new Quaternion(new Vector3f(vec3), i, true);
                Vec3 vec32 = livingEntity.getViewVector(1.0F);
                Vector3f vector3f = new Vector3f(vec32);
                vector3f.transform(quaternion);
                ((Projectile) projectile).shoot(vector3f.x(), vector3f.y(), vector3f.z(), g, h);
            }

            itemStack.hurtAndBreak(firework ? 3 : 1, livingEntity, (livingEntityx) -> {
                livingEntityx.broadcastBreakEvent(interactionHand);
            });
            level.addFreshEntity((Entity) projectile);
            level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), SoundEvents.CROSSBOW_SHOOT, SoundSource.PLAYERS, 1.0F, f);
        }
    }

    public static void performShooting(Level level, LivingEntity livingEntity, InteractionHand interactionHand, ItemStack itemStack, float f, float g) {
        List<ItemStack> list = getChargedProjectiles(itemStack);
        float[] fs = getShotPitches(livingEntity.getRandom());

        for (int i = 0; i < list.size(); ++i) {
            ItemStack itemStack2 = list.get(i);
            boolean bl = livingEntity instanceof Player && ((Player) livingEntity).getAbilities().instabuild;
            if (!itemStack2.isEmpty()) {
                if (i == 0) {
                    shootProjectile(level, livingEntity, interactionHand, itemStack, itemStack2, fs[i], bl, f, g, 0.0F);
                } else if (i == 1) {
                    shootProjectile(level, livingEntity, interactionHand, itemStack, itemStack2, fs[i], bl, f, g, -10.0F);
                } else if (i == 2) {
                    shootProjectile(level, livingEntity, interactionHand, itemStack, itemStack2, fs[i], bl, f, g, 10.0F);
                }
            }
        }

        onCrossbowShot(level, livingEntity, itemStack);
    }

    @Override
    public @NotNull Predicate<ItemStack> getSupportedHeldProjectiles() {
        return VALID_PROJECTILES;
    }

    @Override
    public @NotNull Predicate<ItemStack> getAllSupportedProjectiles() {
        return VALID_PROJECTILES;
    }

    @Override
    public int getDefaultProjectileRange() {
        return 20;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (isCharged(itemStack)) {
            performShooting(level, player, interactionHand, itemStack, getShootingPower(itemStack), 1.0F);
            setCharged(itemStack, false);
            return InteractionResultHolder.consume(itemStack);
        } else if (!player.getProjectile(itemStack).isEmpty()) {
            if (!isCharged(itemStack)) {
                this.startSoundPlayed = false;
                this.midLoadSoundPlayed = false;
                player.startUsingItem(interactionHand);
            }

            return InteractionResultHolder.consume(itemStack);
        } else {
            return InteractionResultHolder.fail(itemStack);
        }
    }
}
