package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.projectile.EchoArrow;
import net.creep3rcrafter.projectiles.projectile.NetherQuartzArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class NetherQuartzArrowRenderer extends ArrowRenderer<NetherQuartzArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public NetherQuartzArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(NetherQuartzArrow arrow) {
        return ARROW_LOCATION;
    }

}
