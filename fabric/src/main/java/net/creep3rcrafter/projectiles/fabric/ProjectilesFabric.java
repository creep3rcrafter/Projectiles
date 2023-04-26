package net.creep3rcrafter.projectiles.fabric;

import net.creep3rcrafter.projectiles.fabriclike.ProjectilesFabricLike;
import net.fabricmc.api.ModInitializer;

public class ProjectilesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ProjectilesFabricLike.init();
    }
}
