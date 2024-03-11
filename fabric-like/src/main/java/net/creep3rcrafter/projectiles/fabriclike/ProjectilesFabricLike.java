package net.creep3rcrafter.projectiles.fabriclike;

import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.register.ModEntityRenderers;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.fabricmc.fabric.api.client.model.BakedModelManagerHelper;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.resources.ResourceLocation;

public class ProjectilesFabricLike {
    public static void init() {
        Projectiles.init();
        new ModEntityRenderers();
        Projectiles.clientInit();
        Projectiles.postInit();

        ItemProperties.register(ModItems.CUSTOM_ARROW.get(), new ResourceLocation(Projectiles.MOD_ID, "tip"), (itemStack, level, livingEntity, i)->{
            if (itemStack.getTag() != null){
                if (itemStack.getTag().contains("tip")){
                    return itemStack.getTag().getInt("tip");
                }
            }
            return 0;
        });
        ItemProperties.register(ModItems.CUSTOM_ARROW.get(), new ResourceLocation(Projectiles.MOD_ID, "rod"), (itemStack, level, livingEntity, i)->{
            if (itemStack.getTag() != null){
                if (itemStack.getTag().contains("rod")){
                    return itemStack.getTag().getInt("rod");
                }
            }
            return 0;
        });
        ItemProperties.register(ModItems.CUSTOM_ARROW.get(), new ResourceLocation(Projectiles.MOD_ID, "tail"), (itemStack, level, livingEntity, i)->{
            if (itemStack.getTag() != null) {
                if (itemStack.getTag().contains("tail")){
                    return itemStack.getTag().getInt("tail");
                }
            }
            return 0;
        });
    }
}
