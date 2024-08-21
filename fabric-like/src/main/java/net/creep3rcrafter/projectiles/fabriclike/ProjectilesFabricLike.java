package net.creep3rcrafter.projectiles.fabriclike;

import dev.architectury.registry.menu.MenuRegistry;
import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.client.screens.inventory.FletchingScreen;
import net.creep3rcrafter.projectiles.register.ModEntityRenderers;
import net.creep3rcrafter.projectiles.register.ModItems;
import net.creep3rcrafter.projectiles.register.ModMenus;
import net.fabricmc.fabric.api.client.model.BakedModelManagerHelper;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.resources.ResourceLocation;

public class ProjectilesFabricLike {
    public static void init() {
        Projectiles.init();
        new ModEntityRenderers();
        MenuRegistry.registerScreenFactory(ModMenus.FLETCHING.get(), FletchingScreen::new);
        Projectiles.clientInit();
        Projectiles.postInit();

        ItemProperties.register(ModItems.CUSTOM_ARROW.get(), new ResourceLocation(Projectiles.MOD_ID, "tip"), (itemStack, level, livingEntity, i)->{
            if (itemStack.getTag() != null){
                if (itemStack.getTag().contains("tip")){
                    return itemStack.getTag().getFloat("tip");
                }
            }
            return 0.0f;
        });
        ItemProperties.register(ModItems.CUSTOM_ARROW.get(), new ResourceLocation(Projectiles.MOD_ID, "rod"), (itemStack, level, livingEntity, i)->{
            if (itemStack.getTag() != null){
                if (itemStack.getTag().contains("rod")){
                    return itemStack.getTag().getFloat("rod");
                }
            }
            return 0.0f;
        });
        ItemProperties.register(ModItems.CUSTOM_ARROW.get(), new ResourceLocation(Projectiles.MOD_ID, "tail"), (itemStack, level, livingEntity, i)->{
            if (itemStack.getTag() != null) {
                if (itemStack.getTag().contains("tail")){
                    return itemStack.getTag().getFloat("tail");
                }
            }
            return 0.0f;
        });
    }
}
