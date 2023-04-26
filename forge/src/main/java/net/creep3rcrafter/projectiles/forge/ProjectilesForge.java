package net.creep3rcrafter.projectiles.forge;

import dev.architectury.platform.forge.EventBuses;
import net.creep3rcrafter.projectiles.Projectiles;
import net.minecraft.core.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static net.creep3rcrafter.projectiles.Projectiles.MOD_ID;

@Mod(MOD_ID)
public class ProjectilesForge {
    public ProjectilesForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MOD_ID, eventBus);
        Projectiles.init();
        eventBus.addListener(this::commonSetupEvent);
    }

    private void commonSetupEvent(FMLCommonSetupEvent event){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //eventBus.register(new BrewingRecipes()); //Example
    }
    private void clientSetupEvent(FMLClientSetupEvent event){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }
}
