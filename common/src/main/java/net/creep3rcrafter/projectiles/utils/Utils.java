package net.creep3rcrafter.projectiles.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.core.RegistryAccess;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Utils {
    public static void lightning(LivingEntity livingEntity, ServerLevel serverLevel, int amplifier) {
        lightning(livingEntity, serverLevel);
        for (int i = 0; i < amplifier; i++) {
            Random random = new Random();
            BlockPos entityPos = livingEntity.blockPosition();
            BlockPos blockPos = entityPos.offset(random.nextInt(amplifier) - (amplifier / 2), random.nextInt(amplifier) - (amplifier / 2), random.nextInt(amplifier) - (amplifier / 2));
            LightningBolt lightningbolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
            lightningbolt.moveTo(Vec3.atBottomCenterOf(blockPos));
            lightningbolt.setCause(livingEntity instanceof ServerPlayer ? (ServerPlayer) livingEntity : null);
            serverLevel.addFreshEntity(lightningbolt);
        }
    }

    public static void lightning(LivingEntity livingEntity, ServerLevel serverLevel) {
        BlockPos entityPos = livingEntity.blockPosition();
        LightningBolt LightningBolt = EntityType.LIGHTNING_BOLT.create(serverLevel);
        LightningBolt.moveTo(Vec3.atBottomCenterOf(entityPos));
        LightningBolt.setCause(livingEntity instanceof ServerPlayer ? (ServerPlayer) livingEntity : null);
        serverLevel.addFreshEntity(LightningBolt);
    }

    public static void explode(Level level, BlockPos blockPos) {
        explode(level, blockPos, 4f);
    }

    public static void explode(Level level, BlockPos blockPos, float radius) {
        explode(level, blockPos, radius, false);
    }

    public static void explode(Level level, BlockPos blockPos, float radius, boolean fire) {
        level.explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), radius, fire, Level.ExplosionInteraction.MOB);
    }

    public static void explode(ServerLevel level, BlockPos blockPos) {
        explode(level, blockPos, 4f);
    }

    public static void explode(ServerLevel level, BlockPos blockPos, float radius) {
        explode(level, blockPos, radius, false);
    }

    public static void explode(ServerLevel level, BlockPos blockPos, float radius, boolean fire) {
        level.explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), radius, fire, Level.ExplosionInteraction.MOB);
    }

    public static int cropAgeToIndex(int age) {
        if (age > 6) {
            return 3;
        } else if (age > 3) {
            return 2;
        } else if (age > 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void dropXP(ServerLevel level, BlockPos blockPos) {
        int i = 3 + level.random.nextInt(5) + level.random.nextInt(5);
        while (i > 0) {
            int j = ExperienceOrb.getExperienceValue(i);
            i -= j;
            level.addFreshEntity(new ExperienceOrb(level, blockPos.getX(), blockPos.getY(), blockPos.getZ(), j));
        }
    }

    public static void damageItem(LivingEntity livingEntity, EquipmentSlot equipmentSlot, int damage) {
        if (livingEntity.getItemBySlot(equipmentSlot).isDamageableItem()) {
            livingEntity.getItemBySlot(equipmentSlot).hurtAndBreak(damage, livingEntity, source -> {
                source.broadcastBreakEvent(equipmentSlot);
            });
        }
    }

    public static void damageItem(LivingEntity livingEntity, ItemStack itemStack, int damage) {
        if (itemStack.isDamageableItem()) {
            itemStack.hurtAndBreak(damage, livingEntity, source -> {
                source.broadcastBreakEvent(EquipmentSlot.CHEST);
            });
        }
    }

    public static <C extends Container, T extends Recipe<C>> List<Item> recipesContainsItems(MinecraftServer server, RecipeType<T> recipeType, List<Item> containsList) {
        List<Item> results = new ArrayList<Item>();
        server.getRecipeManager().getAllRecipesFor(recipeType).forEach(recipe -> {
            recipe.getIngredients().forEach(ingredient -> {
                for (Item item : containsList) {
                    if (ingredient.test(new ItemStack(item))) {
                        results.add(recipe.getResultItem(RegistryAccess.EMPTY).getItem());
                    }
                }
            });
        });
        return new ArrayList<Item>(new HashSet<>(results));
    }

    public int getDistanceToEntity(LivingEntity livingEntity, BlockPos pos) {
        double deltaX = livingEntity.getX() - pos.getX();
        double deltaY = livingEntity.getY() - pos.getY();
        double deltaZ = livingEntity.getZ() - pos.getZ();
        return (int) Math.sqrt((deltaX * deltaX) + (deltaY * deltaY) + (deltaZ * deltaZ));
    }

    public List<BlockPos> getNearbyBlocks(LivingEntity livingEntity, int radius) {
        List<BlockPos> blockPositions = new ArrayList<BlockPos>();
        for (int x = livingEntity.blockPosition().getX() - radius; x <= livingEntity.blockPosition().getX() + radius; x++) {
            for (int y = livingEntity.blockPosition().getY() - radius; y <= livingEntity.blockPosition().getY() + radius; y++) {
                for (int z = livingEntity.blockPosition().getZ() - radius; z <= livingEntity.blockPosition().getZ() + radius; z++) {
                    blockPositions.add(new BlockPos(x, y, z));
                }
            }
        }
        return blockPositions;
    }
}
