package net.creep3rcrafter.projectiles.neoforge;

import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.register.ModEntityRenderers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import static net.creep3rcrafter.projectiles.Projectiles.MOD_ID;

@Mod(MOD_ID)
public class ProjectilesNeoForge {
    public ProjectilesNeoForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        NeoForge.EVENT_BUS.register(this);
        Projectiles.init();
        //eventBus.register(new ModEntityRenderers());
        new ModEntityRenderers();
        eventBus.addListener(this::commonSetupEvent);
        eventBus.addListener(this::clientSetupEvent);
    }
    @SubscribeEvent
    private void commonSetupEvent(FMLCommonSetupEvent event) {
        //IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //new BrewingRecipes();
        Projectiles.postInit();
    }
    @SubscribeEvent
    private void clientSetupEvent(FMLClientSetupEvent event) {
        Projectiles.clientInit();
    }
}
