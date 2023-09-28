package net.creep3rcrafter.projectiles.client.render.entity;

import net.creep3rcrafter.projectiles.entity.projectile.NetheriteArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class NetheriteArrowRenderer extends ArrowRenderer<NetheriteArrow> {
    public static final ResourceLocation ARROW_LOCATION =
            new ResourceLocation("projectiles", "textures/entity/projectiles/netherite_arrow.png");

    public NetheriteArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(NetheriteArrow arrow) {
        return ARROW_LOCATION;
    }

}
