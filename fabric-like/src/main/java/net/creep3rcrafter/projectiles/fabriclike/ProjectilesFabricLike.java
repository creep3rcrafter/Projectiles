package net.creep3rcrafter.projectiles.fabriclike;

import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.register.ModEntityRenderers;

public class ProjectilesFabricLike {
    public static void init() {
        Projectiles.init();
        new ModEntityRenderers();
        Projectiles.clientInit();
        Projectiles.postInit();
    }
}
