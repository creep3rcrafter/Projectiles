package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.creep3rcrafter.projectiles.item.EchoArrowItem;
import net.creep3rcrafter.projectiles.Projectiles;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Projectiles.MOD_ID, Registry.ITEM_REGISTRY);
    //wood arrow
    public static final RegistrySupplier<Item> WOOD_ARROW = ITEMS.register("wood_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> COPPER_ARROW = ITEMS.register("copper_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> IRON_ARROW = ITEMS.register("iron_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> GOLD_ARROW = ITEMS.register("gold_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> DIAMOND_ARROW = ITEMS.register("diamond_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> NETHERITE_ARROW = ITEMS.register("netherite_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> OBSIDIAN_ARROW = ITEMS.register("obsidian_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> NETHER_QUARTZ_ARROW = ITEMS.register("nether_quartz_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> AMETHYST_ARROW = ITEMS.register("amethyst_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> PRISMARINE_ARROW = ITEMS.register("prismarine_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> SLIME_ARROW = ITEMS.register("slime_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> TNT_ARROW = ITEMS.register("tnt_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<Item> ECHO_ARROW = ITEMS.register("echo_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
