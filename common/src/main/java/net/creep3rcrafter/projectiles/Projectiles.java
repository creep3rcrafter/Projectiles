package net.creep3rcrafter.projectiles;
import dev.architectury.platform.Platform;
import net.creep3rcrafter.projectiles.register.*;
import net.fabricmc.api.EnvType;

public class Projectiles {
    public static final String MOD_ID = "projectiles";

    public static void init() {
        ModItems.ITEMS.register();
        ModEntityTypes.ENTITY_TYPES.register();
    }
    public static void postInit() {
        new ModLootTables();
        new ModDispenserBlockProjectiles();
        new ModVillagerTrades();
    }
    public static void clientInit() {
        if (Platform.getEnvironment().toPlatform() == EnvType.CLIENT) {
            new ModEntityRenderers();
        }
    }
}
