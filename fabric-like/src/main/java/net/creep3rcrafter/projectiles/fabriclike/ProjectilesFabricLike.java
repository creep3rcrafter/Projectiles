package net.creep3rcrafter.projectiles.fabriclike;

import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.register.ModDispenserBlockProjectiles;

public class ProjectilesFabricLike {
    public static void init() {
        Projectiles.init();
        Projectiles.clientInit();
        Projectiles.postInit();
    }
}
