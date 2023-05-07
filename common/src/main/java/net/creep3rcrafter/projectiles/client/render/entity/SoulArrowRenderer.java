package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.projectile.SoulArrow;
import net.creep3rcrafter.projectiles.projectile.WoodArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class SoulArrowRenderer extends ArrowRenderer<SoulArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("textures/entity/projectiles/spectral_arrow.png");

    public SoulArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(SoulArrow arrow) {
        return ARROW_LOCATION;
    }

}
