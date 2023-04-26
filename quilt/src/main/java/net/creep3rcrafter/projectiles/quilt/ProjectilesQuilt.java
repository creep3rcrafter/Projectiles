package net.creep3rcrafter.projectiles.quilt;

import net.creep3rcrafter.projectiles.fabriclike.ProjectilesFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ProjectilesQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        ProjectilesFabricLike.init();
    }
}