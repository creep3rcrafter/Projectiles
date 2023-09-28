package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.entity.projectile.NetherQuartzArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class NetherQuartzArrowRenderer extends ArrowRenderer<NetherQuartzArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("projectiles", "textures/entity/projectiles/nether_quartz_arrow.png");

    public NetherQuartzArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(NetherQuartzArrow arrow) {
        return ARROW_LOCATION;
    }

}
