package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.entity.projectile.AmethystArrow;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.world.item.DyeColor;
import org.jetbrains.annotations.NotNull;

public class AmethystArrowRenderer extends ArrowRenderer<AmethystArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("projectiles", "textures/entity/projectiles/amethyst_arrow.png");

    public AmethystArrowRenderer(EntityRendererProvider.Context context) {
        //BakedModel
        //PreparableReloadListener
        //ItemRenderer
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(AmethystArrow arrow) {
        return ARROW_LOCATION;
    }

}
