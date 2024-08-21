package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.inventory.FletchingMenu;
import net.minecraft.core.Registry;
import net.minecraft.world.inventory.MenuType;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Projectiles.MOD_ID, Registry.MENU_REGISTRY);
    public static final RegistrySupplier<MenuType<FletchingMenu>> FLETCHING = MENUS.register("fletching", () -> new MenuType<FletchingMenu>(FletchingMenu::new));
    //public static final RegistrySupplier<MenuType<FletchingMenu>> FLETCHING2 = MenuRegistry.of(FletchingMenu::new);
}
