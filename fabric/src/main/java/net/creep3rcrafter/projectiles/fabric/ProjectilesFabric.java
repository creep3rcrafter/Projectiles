package net.creep3rcrafter.projectiles.fabric;

import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.register.ModEntityRenderers;
import net.fabricmc.api.ModInitializer;

public class ProjectilesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Projectiles.init();
        new ModEntityRenderers();
        Projectiles.clientInit();
        Projectiles.postInit();
    }
}
