package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;

public class ModVillagerTrades {
    static {
        TradeRegistry.registerVillagerTrade(VillagerProfession.FLETCHER, 2, new VillagerTrades.ItemsForEmeralds(ModItems.AMETHYST_ARROW.get(), 1, 4, 1));
    }
}
