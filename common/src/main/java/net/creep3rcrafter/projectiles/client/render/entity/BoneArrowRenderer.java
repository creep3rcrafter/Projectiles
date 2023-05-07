package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.projectile.BoneArrow;
import net.creep3rcrafter.projectiles.projectile.EchoArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BoneArrowRenderer extends ArrowRenderer<BoneArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public BoneArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(BoneArrow arrow) {
        return ARROW_LOCATION;
    }

}
