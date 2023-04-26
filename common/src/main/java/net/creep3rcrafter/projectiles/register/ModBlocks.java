package net.creep3rcrafter.projectiles.register;

import dev.architectury.registry.registries.DeferredRegister;
import net.creep3rcrafter.projectiles.Projectiles;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Projectiles.MOD_ID, Registry.BLOCK_REGISTRY);
}
