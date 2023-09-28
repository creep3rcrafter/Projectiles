package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.creep3rcrafter.projectiles.Projectiles;
import net.creep3rcrafter.projectiles.entity.projectile.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Projectiles.MOD_ID, Registry.ENTITY_TYPE_REGISTRY);

    public static final RegistrySupplier<EntityType<AmethystArrow>> AMETHYST_ARROW = ENTITY_TYPES.register("amethyst_arrow", () ->
            EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "amethyst_arrow").toString()));
    public static final RegistrySupplier<EntityType<BambooArrow>> BAMBOO_ARROW = ENTITY_TYPES.register("bamboo_arrow", () ->
            EntityType.Builder.<BambooArrow>of(BambooArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "bamboo_arrow").toString()));
    public static final RegistrySupplier<EntityType<CopperArrow>> COPPER_ARROW = ENTITY_TYPES.register("copper_arrow", () ->
            EntityType.Builder.<CopperArrow>of(CopperArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "copper_arrow").toString()));
    public static final RegistrySupplier<EntityType<DiamondArrow>> DIAMOND_ARROW = ENTITY_TYPES.register("diamond_arrow", () ->
            EntityType.Builder.<DiamondArrow>of(DiamondArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "diamond_arrow").toString()));
    public static final RegistrySupplier<EntityType<EchoArrow>> ECHO_ARROW = ENTITY_TYPES.register("echo_arrow", () ->
            EntityType.Builder.<EchoArrow>of(EchoArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "echo_arrow").toString()));
    public static final RegistrySupplier<EntityType<EnderArrow>> ENDER_ARROW = ENTITY_TYPES.register("ender_arrow", () ->
            EntityType.Builder.<EnderArrow>of(EnderArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "ender_arrow").toString()));
    public static final RegistrySupplier<EntityType<GoldArrow>> GOLD_ARROW = ENTITY_TYPES.register("gold_arrow", () ->
            EntityType.Builder.<GoldArrow>of(GoldArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "gold_arrow").toString()));
    public static final RegistrySupplier<EntityType<IronArrow>> IRON_ARROW = ENTITY_TYPES.register("iron_arrow", () ->
            EntityType.Builder.<IronArrow>of(IronArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "gold_arrow").toString()));
    public static final RegistrySupplier<EntityType<NetheriteArrow>> NETHERITE_ARROW = ENTITY_TYPES.register("netherite_arrow", () ->
            EntityType.Builder.<NetheriteArrow>of(NetheriteArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "netherite_arrow").toString()));
    public static final RegistrySupplier<EntityType<NetherQuartzArrow>> NETHER_QUARTZ_ARROW = ENTITY_TYPES.register("nether_quartz_arrow", () ->
            EntityType.Builder.<NetherQuartzArrow>of(NetherQuartzArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "nether_quartz_arrow").toString()));
    public static final RegistrySupplier<EntityType<ObsidianArrow>> OBSIDIAN_ARROW = ENTITY_TYPES.register("obsidian_arrow", () ->
            EntityType.Builder.<ObsidianArrow>of(ObsidianArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "obsidian_arrow").toString()));
    public static final RegistrySupplier<EntityType<PrismarineArrow>> PRISMARINE_ARROW = ENTITY_TYPES.register("prismarine_arrow", () ->
            EntityType.Builder.<PrismarineArrow>of(PrismarineArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "prismarine_arrow").toString()));
    public static final RegistrySupplier<EntityType<SlimeArrow>> SLIME_ARROW = ENTITY_TYPES.register("slime_arrow", () ->
            EntityType.Builder.<SlimeArrow>of(SlimeArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "slime_arrow").toString()));
    public static final RegistrySupplier<EntityType<TNTArrow>> TNT_ARROW = ENTITY_TYPES.register("tnt_arrow", () ->
            EntityType.Builder.<TNTArrow>of(TNTArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "tnt_arrow").toString()));
    public static final RegistrySupplier<EntityType<WoodArrow>> WOOD_ARROW = ENTITY_TYPES.register("wood_arrow", () ->
            EntityType.Builder.<WoodArrow>of(WoodArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "wood_arrow").toString()));
    public static final RegistrySupplier<EntityType<BoneArrow>> BONE_ARROW = ENTITY_TYPES.register("bone_arrow", () ->
            EntityType.Builder.<BoneArrow>of(BoneArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "bone_arrow").toString()));
    public static final RegistrySupplier<EntityType<SoulArrow>> SOUL_ARROW = ENTITY_TYPES.register("soul_arrow", () ->
            EntityType.Builder.<SoulArrow>of(SoulArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "soul_arrow").toString()));
    public static final RegistrySupplier<EntityType<CobwebArrow>> COBWEB_ARROW = ENTITY_TYPES.register("cobweb_arrow", () ->
            EntityType.Builder.<CobwebArrow>of(CobwebArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "cobweb_arrow").toString()));
    public static final RegistrySupplier<EntityType<ChorusArrow>> CHORUS_ARROW = ENTITY_TYPES.register("chorus_arrow", () ->
            EntityType.Builder.<ChorusArrow>of(ChorusArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "chorus_arrow").toString()));
    public static final RegistrySupplier<EntityType<Dynamite>> DYNAMITE = ENTITY_TYPES.register("dynamite", () ->
            EntityType.Builder.<Dynamite>of(Dynamite::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                    new ResourceLocation(Projectiles.MOD_ID, "dynamite").toString()));
    /*
    public static final RegistrySupplier<EntityType<Lasso>> LASSO = ENTITY_TYPES.register("lasso", () ->
            EntityType.Builder.<Lasso>of(Lasso::new, MobCategory.MISC).sized(0.25F, 0.25F).clientTrackingRange(4).updateInterval(10).build(
                    new ResourceLocation(Projectiles.MOD_ID, "lasso").toString()));

     */
}
