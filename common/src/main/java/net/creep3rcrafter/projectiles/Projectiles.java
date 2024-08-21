package net.creep3rcrafter.projectiles;

import net.creep3rcrafter.projectiles.item.ArrowFletching;
import net.creep3rcrafter.projectiles.register.*;
import net.minecraft.client.gui.screens.inventory.BrewingStandScreen;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.world.inventory.BrewingStandMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BrewingStandBlock;
import net.minecraft.world.level.block.FletchingTableBlock;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;

public class Projectiles {
    public static final String MOD_ID = "projectiles";

    public static void init() {
        //BrewingStandBlock;
        //BrewingStandBlockEntity;
        //BrewingStandMenu;
        //BrewingStandScreen;
        //FletchingTableBlock;
        ModItems.ITEMS.register();
        ModMenus.MENUS.register();
        ModEntityTypes.ENTITY_TYPES.register();
        new ArrowFletching();
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
