package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.creep3rcrafter.projectiles.item.*;
import net.creep3rcrafter.projectiles.Projectiles;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.Comparator;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Projectiles.MOD_ID, Registry.ITEM_REGISTRY);
    //cobweb arrow - done
    //soul arrow - done floats forever
    //chorus fruit arrow - done
    //funny pufferfish arrow
    //luminescent arrow
    //dragon breath arrow
    //blaze arrow
    //smoke arrow
    //freezing arrow
    //dynamite
    //Packed Snowball
    //Dynamite Snowball
    //Stony Snowball
    //slingshot > shoots seeds and buttons
    //slime not compatible with punch bows - fixed
    //lead arrow
    //fletcher should give arrows
    public static final RegistrySupplier<WoodArrowItem> WOOD_ARROW = ITEMS.register("wood_arrow", () ->
            new WoodArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<BoneArrowItem> BONE_ARROW = ITEMS.register("bone_arrow", () ->
            new BoneArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<CopperArrowItem> COPPER_ARROW = ITEMS.register("copper_arrow", () ->
            new CopperArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<IronArrowItem> IRON_ARROW = ITEMS.register("iron_arrow", () ->
            new IronArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<GoldArrowItem> GOLD_ARROW = ITEMS.register("gold_arrow", () ->
            new GoldArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<DiamondArrowItem> DIAMOND_ARROW = ITEMS.register("diamond_arrow", () ->
            new DiamondArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<NetheriteArrowItem> NETHERITE_ARROW = ITEMS.register("netherite_arrow", () ->
            new NetheriteArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<ObsidianArrowItem> OBSIDIAN_ARROW = ITEMS.register("obsidian_arrow", () ->
            new ObsidianArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<NetherQuartzArrowItem> NETHER_QUARTZ_ARROW = ITEMS.register("nether_quartz_arrow", () ->
            new NetherQuartzArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<AmethystArrowItem> AMETHYST_ARROW = ITEMS.register("amethyst_arrow", () ->
            new AmethystArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<PrismarineArrowItem> PRISMARINE_ARROW = ITEMS.register("prismarine_arrow", () ->
            new PrismarineArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<SlimeArrowItem> SLIME_ARROW = ITEMS.register("slime_arrow", () ->
            new SlimeArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<CobwebArrowItem> COBWEB_ARROW = ITEMS.register("cobweb_arrow", () ->
            new CobwebArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<ChorusArrowItem> CHORUS_ARROW = ITEMS.register("chorus_arrow", () ->
            new ChorusArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<TNTArrowItem> TNT_ARROW = ITEMS.register("tnt_arrow", () ->
            new TNTArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<EnderArrowItem> ENDER_ARROW = ITEMS.register("ender_arrow", () ->
            new EnderArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<EchoArrowItem> ECHO_ARROW = ITEMS.register("echo_arrow", () ->
            new EchoArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistrySupplier<SoulArrowItem> SOUL_ARROW = ITEMS.register("soul_arrow", () ->
            new SoulArrowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
