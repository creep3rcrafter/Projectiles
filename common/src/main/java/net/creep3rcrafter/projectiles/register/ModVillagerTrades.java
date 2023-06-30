package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;

public class ModVillagerTrades {
    static {
        TradeRegistry.registerVillagerTrade(VillagerProfession.FLETCHER, 1,
                new VillagerTrades.ItemsForEmeralds(ModItems.WOOD_ARROW.get(), 1, 16, 1),
                new VillagerTrades.ItemsForEmeralds(ModItems.BONE_ARROW.get(), 1, 8, 1),
                new VillagerTrades.ItemsForEmeralds(ModItems.COPPER_ARROW.get(), 1, 4, 1));

        TradeRegistry.registerVillagerTrade(VillagerProfession.FLETCHER, 2,
                new VillagerTrades.ItemsForEmeralds(ModItems.IRON_ARROW.get(), 1, 1, 1),
                new VillagerTrades.ItemsForEmeralds(ModItems.GOLD_ARROW.get(), 2, 1, 1),
                new VillagerTrades.ItemsForEmeralds(ModItems.BAMBOO_ARROW.get(), 1, 16, 1));

        TradeRegistry.registerVillagerTrade(VillagerProfession.FLETCHER, 3,
                new VillagerTrades.ItemsForEmeralds(ModItems.PRISMARINE_ARROW.get(), 2, 4, 1));

        TradeRegistry.registerVillagerTrade(VillagerProfession.FLETCHER, 4,
                new VillagerTrades.ItemsForEmeralds(ModItems.OBSIDIAN_ARROW.get(), 1, 1, 1),
                new VillagerTrades.ItemsForEmeralds(ModItems.COBWEB_ARROW.get(), 3, 1, 1));

        TradeRegistry.registerVillagerTrade(VillagerProfession.FLETCHER, 5,
                new VillagerTrades.ItemsForEmeralds(ModItems.DIAMOND_ARROW.get(), 2, 1, 3),
                new VillagerTrades.ItemsForEmeralds(ModItems.SLIME_ARROW.get(), 3, 1, 1),
                new VillagerTrades.ItemsForEmeralds(ModItems.TNT_ARROW.get(), 3, 1, 1));
    }
}
