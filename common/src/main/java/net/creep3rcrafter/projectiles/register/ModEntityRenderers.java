package net.creep3rcrafter.projectiles.register;

import dev.architectury.platform.Platform;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.utils.Env;
import net.creep3rcrafter.projectiles.client.render.entity.*;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class ModEntityRenderers {
    static {
        if (Platform.getEnvironment() == Env.CLIENT) {
            EntityRendererRegistry.register(ModEntityTypes.AMETHYST_ARROW, AmethystArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.COPPER_ARROW, CopperArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.DIAMOND_ARROW, DiamondArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.ECHO_ARROW, EchoArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.ENDER_ARROW, EnderArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.GOLD_ARROW, GoldArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.IRON_ARROW, IronArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.NETHERITE_ARROW, NetheriteArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.NETHER_QUARTZ_ARROW, NetherQuartzArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.OBSIDIAN_ARROW, ObsidianArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.PRISMARINE_ARROW, PrismarineArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.SLIME_ARROW, SlimeArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.TNT_ARROW, TNTArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.WOOD_ARROW, WoodArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.BONE_ARROW, BoneArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.SOUL_ARROW, SoulArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.COBWEB_ARROW, CobwebArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.CHORUS_ARROW, ChorusArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.BAMBOO_ARROW, BambooArrowRenderer::new);
            EntityRendererRegistry.register(ModEntityTypes.DYNAMITE, ThrownItemRenderer::new);
            //EntityRendererRegistry.register(ModEntityTypes.LASSO, ThrownItemRenderer::new);
        }
    }
}
