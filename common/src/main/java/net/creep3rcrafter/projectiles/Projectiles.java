package net.creep3rcrafter.projectiles;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.creep3rcrafter.projectiles.client.render.entity.*;
import net.creep3rcrafter.projectiles.register.*;

public class Projectiles {
    public static final String MOD_ID = "projectiles";

    public static void init() {
        ModItems.ITEMS.register();
        ModBlocks.BLOCKS.register();
        ModEntityTypes.ENTITY_TYPES.register();
        EntityRendererRegistry.register(ModEntityTypes.AMETHYST_ARROW::get, AmethystArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.COPPER_ARROW::get, CopperArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.DIAMOND_ARROW::get, DiamondArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.ECHO_ARROW::get, EchoArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.ENDER_ARROW::get, EnderArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.GOLD_ARROW::get, GoldArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.IRON_ARROW::get, IronArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.NETHERITE_ARROW::get, NetheriteArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.NETHER_QUARTZ_ARROW::get, NetherQuartzArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.OBSIDIAN_ARROW::get, ObsidianArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.PRISMARINE_ARROW::get, PrismarineArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.SLIME_ARROW::get, SlimeArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.TNT_ARROW::get, TNTArrowRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.WOOD_ARROW::get, WoodArrowRenderer::new);
    }
}
