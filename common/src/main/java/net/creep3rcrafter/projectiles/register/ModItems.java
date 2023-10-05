package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Projectiles.MOD_ID, Registries.ITEM);
    //cobweb arrow - done
    //soul arrow - done floats forever
    //chorus fruit arrow - done
    //funny pufferfish arrow
    //luminescent arrow
    //dragon breath arrow
    //blaze arrow
    //smoke arrow
    //freezing arrow
    //bamboo arrow
    //dynamite
    //Packed Snowball
    //Dynamite Snowball
    //Stony Snowball
    //slingshot > shoots seeds and buttons
    //slime not compatible with punch bows - fixed
    //lead arrow
    //ender arrow text, chorus text, cobweb text, copper text
    //diamond arrow and gold arrow do same damage

    public static final RegistrySupplier<ArrowItem> WOOD_ARROW = ITEMS.register("wood_arrow", () ->
            new WoodArrowItem(new Item.Properties()));
    public static final RegistrySupplier<ArrowItem> BAMBOO_ARROW = ITEMS.register("bamboo_arrow", () ->
            new BambooArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> BONE_ARROW = ITEMS.register("bone_arrow", () ->
            new BoneArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> COPPER_ARROW = ITEMS.register("copper_arrow", () ->
            new CopperArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> IRON_ARROW = ITEMS.register("iron_arrow", () ->
            new IronArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> GOLD_ARROW = ITEMS.register("gold_arrow", () ->
            new GoldArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> DIAMOND_ARROW = ITEMS.register("diamond_arrow", () ->
            new DiamondArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> NETHERITE_ARROW = ITEMS.register("netherite_arrow", () ->
            new NetheriteArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> OBSIDIAN_ARROW = ITEMS.register("obsidian_arrow", () ->
            new ObsidianArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> NETHER_QUARTZ_ARROW = ITEMS.register("nether_quartz_arrow", () ->
            new NetherQuartzArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> AMETHYST_ARROW = ITEMS.register("amethyst_arrow", () ->
            new AmethystArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> PRISMARINE_ARROW = ITEMS.register("prismarine_arrow", () ->
            new PrismarineArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> SLIME_ARROW = ITEMS.register("slime_arrow", () ->
            new SlimeArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> COBWEB_ARROW = ITEMS.register("cobweb_arrow", () ->
            new CobwebArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> CHORUS_ARROW = ITEMS.register("chorus_arrow", () ->
            new ChorusArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> TNT_ARROW = ITEMS.register("tnt_arrow", () ->
            new TNTArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> ENDER_ARROW = ITEMS.register("ender_arrow", () ->
            new EnderArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> ECHO_ARROW = ITEMS.register("echo_arrow", () ->
            new EchoArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<ArrowItem> SOUL_ARROW = ITEMS.register("soul_arrow", () ->
            new SoulArrowItem(new Item.Properties().arch$tab(CreativeModeTabs.COMBAT)));
    public static final RegistrySupplier<Item> DYNAMITE = ITEMS.register("dynamite", () ->
            new DynamiteItem(new Item.Properties().stacksTo(16).arch$tab(CreativeModeTabs.COMBAT)));
    /*
    public static final RegistrySupplier<Item> LAUNCHER = ITEMS.register("launcher", () ->
            new LauncherItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_COMBAT).durability(465)));
    public static final RegistrySupplier<Item> LASSO = ITEMS.register("lasso", () ->
            new LassoItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
     */
}
