package net.creep3rcrafter.projectiles;

import net.creep3rcrafter.projectiles.register.*;

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
        //new ModEntityRenderers();
    }

    
}
