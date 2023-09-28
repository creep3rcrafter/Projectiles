package net.creep3rcrafter.projectiles.register;

import net.creep3rcrafter.projectiles.entity.projectile.*;
import net.creep3rcrafter.projectiles.item.CustomArrowItem;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

public class ModDispenserBlockProjectiles {
    static {
        DispenserBlock.registerBehavior(ModItems.WOOD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                WoodArrow arrow = new WoodArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.WOOD_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.BONE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                BoneArrow arrow = new BoneArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.BONE_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.COPPER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                CopperArrow arrow = new CopperArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.COPPER_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.IRON_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                IronArrow arrow = new IronArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.IRON_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.GOLD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                GoldArrow arrow = new GoldArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.GOLD_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.DIAMOND_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                DiamondArrow arrow = new DiamondArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.DIAMOND_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.NETHERITE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                NetheriteArrow arrow = new NetheriteArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.NETHERITE_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.OBSIDIAN_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                ObsidianArrow arrow = new ObsidianArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.OBSIDIAN_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.NETHER_QUARTZ_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                NetherQuartzArrow arrow = new NetherQuartzArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.NETHER_QUARTZ_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.AMETHYST_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                AmethystArrow arrow = new AmethystArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.AMETHYST_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.PRISMARINE_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                PrismarineArrow arrow = new PrismarineArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.PRISMARINE_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.SLIME_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                SlimeArrow arrow = new SlimeArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                //arrow.setBaseDamage(ModItems.SLIME_ARROW.get().getBaseDamage());
                arrow.setKnockback(0);
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.COBWEB_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                CobwebArrow arrow = new CobwebArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                arrow.setKnockback(0);
                //arrow.setBaseDamage(ModItems.COBWEB_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.CHORUS_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                ChorusArrow arrow = new ChorusArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                //arrow.setBaseDamage(ModItems.CHORUS_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.TNT_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                TNTArrow arrow = new TNTArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                //arrow.setBaseDamage(ModItems.TNT_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.ENDER_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                EnderArrow arrow = new EnderArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                //arrow.setBaseDamage(ModItems.ENDER_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.ECHO_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                EchoArrow arrow = new EchoArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                //arrow.setBaseDamage(ModItems.ECHO_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.SOUL_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                SoulArrow arrow = new SoulArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                arrow.setNoGravity(true);
                //arrow.setBaseDamage(ModItems.SOUL_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.BAMBOO_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                BambooArrow arrow = new BambooArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                //arrow.setBaseDamage(ModItems.BAMBOO_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
        DispenserBlock.registerBehavior(ModItems.DYNAMITE.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                return new Dynamite(level, position.x(), position.y(), position.z());
            }
        });
    }

    public static void registerBasicArrow(ItemLike item, AbstractArrow arrow) {
        DispenserBlock.registerBehavior(item, new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                arrow.setBaseDamage(((CustomArrowItem) item).getBaseDamage());
                return arrow;
            }
        });
    }
}
