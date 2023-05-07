package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.projectile.ChorusArrow;
import net.creep3rcrafter.projectiles.projectile.CobwebArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ChorusArrowRenderer extends ArrowRenderer<ChorusArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public ChorusArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(ChorusArrow arrow) {
        return ARROW_LOCATION;
    }

}
