package net.creep3rcrafter.projectiles.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

public class Utils {
    public static void explode(Level level, BlockPos blockPos) {
        explode(level, blockPos, 4f);
    }

    public static void explode(Level level, BlockPos blockPos, float radius) {
        explode(level, blockPos, radius, false);
    }

    public static void explode(Level level, BlockPos blockPos, float radius, boolean fire) {
        level.explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), radius, fire, Explosion.BlockInteraction.BREAK);
    }

    public static void explode(ServerLevel level, BlockPos blockPos) {
        explode(level, blockPos, 4f);
    }

    public static void explode(ServerLevel level, BlockPos blockPos, float radius) {
        explode(level, blockPos, radius, false);
    }

    public static void explode(ServerLevel level, BlockPos blockPos, float radius, boolean fire) {
        level.explode(null, blockPos.getX(), blockPos.getY(), blockPos.getZ(), radius, fire, Explosion.BlockInteraction.BREAK);
    }
}
