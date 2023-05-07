package net.creep3rcrafter.projectiles.register;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTables {
    static {
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.ANCIENT_CITY.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.ECHO_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.AMETHYST_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(2))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 3));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.ABANDONED_MINESHAFT.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.IRON_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.GOLD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COPPER_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COBWEB_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.TNT_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WOOD_ARROW.get()).setWeight(2))
                        .add(LootItem.lootTableItem(ModItems.AMETHYST_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(2))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 6));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.BURIED_TREASURE.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.PRISMARINE_ARROW.get()).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 4));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.VILLAGE_FLETCHER.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.TNT_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SLIME_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COBWEB_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.IRON_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.GOLD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WOOD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.PRISMARINE_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WOOD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.OBSIDIAN_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.DIAMOND_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(4, 10));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.BASTION_TREASURE.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.NETHER_QUARTZ_ARROW.get()).setWeight(2))
                        .add(LootItem.lootTableItem(ModItems.GOLD_ARROW.get()).setWeight(2))
                        .add(LootItem.lootTableItem(ModItems.NETHERITE_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.SOUL_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(2))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 4));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.PILLAGER_OUTPOST.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.TNT_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.IRON_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 2));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.DESERT_PYRAMID.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.TNT_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.IRON_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.GOLD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.COBWEB_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 4));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.END_CITY_TREASURE.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.ENDER_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.CHORUS_ARROW.get()).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 2));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.RUINED_PORTAL.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.GOLD_ARROW.get()).setWeight(2))
                        .add(LootItem.lootTableItem(ModItems.SOUL_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(3))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 2));
                context.addPool(pool);
            }
        });
        LootEvent.MODIFY_LOOT_TABLE.register((lootTables, id, context, builtin) -> {
            if (builtin && BuiltInLootTables.WOODLAND_MANSION.equals(id)){
                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(ModItems.IRON_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.GOLD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.WOOD_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.TNT_ARROW.get()).setWeight(1))
                        .add(LootItem.lootTableItem(ModItems.BONE_ARROW.get()).setWeight(1))
                        .add(EmptyLootItem.emptyItem().setWeight(1))
                        .setRolls(UniformGenerator.between(0, 6));
                context.addPool(pool);
            }
        });
    }
}
