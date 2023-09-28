package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.entity.projectile.BoneArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class BoneArrowRenderer extends ArrowRenderer<BoneArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("projectiles", "textures/entity/projectiles/bone_arrow.png");

    public BoneArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(BoneArrow arrow) {
        return ARROW_LOCATION;
    }

}
