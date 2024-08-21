package net.creep3rcrafter.projectiles.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.creep3rcrafter.projectiles.entity.projectile.CustomArrow;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.CreeperPowerLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class CustomArrowRenderer extends ArrowRenderer<CustomArrow>{
    public static final ResourceLocation ARROW_LOCATION1 =
            new ResourceLocation("projectiles", "textures/entity/projectiles/wood_arrow.png");
    public static final ResourceLocation ARROW_LOCATION2 =
            new ResourceLocation("projectiles", "textures/entity/projectiles/copper_arrow.png");
    public static final ResourceLocation ARROW_LOCATION3 =
            new ResourceLocation("projectiles", "textures/entity/projectiles/prismarine_arrow.png");

    public CustomArrowRenderer(EntityRendererProvider.Context context) {
        super(context);

    }

    @Override
    public void render(CustomArrow abstractArrow, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        super.render(abstractArrow, f, g, poseStack, multiBufferSource, i);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(CustomArrow arrow) {
        if (arrow.getTip() == 0.15f){
            return ARROW_LOCATION2;
        } else if (arrow.getTip() == 0.55f) {
            return ARROW_LOCATION3;
        }else{
            return ARROW_LOCATION1;
        }
    }

}
