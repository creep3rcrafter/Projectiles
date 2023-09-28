package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.entity.projectile.CopperArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class CopperArrowRenderer extends ArrowRenderer<CopperArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("projectiles", "textures/entity/projectiles/copper_arrow.png");

    public CopperArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(CopperArrow arrow) {
        return ARROW_LOCATION;
    }

}
