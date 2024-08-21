package net.creep3rcrafter.projectiles.mixin;

import net.creep3rcrafter.projectiles.inventory.FletchingMenu;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.FletchingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FletchingTableBlock.class)
public class FletchingTableBlockMixin extends CraftingTableBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.fletching");
    public FletchingTableBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "use", at = @At("RETURN"), cancellable = true)
    public void inject1(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult, CallbackInfoReturnable<InteractionResult> cir) {
        if (level.isClientSide) {
            cir.setReturnValue(InteractionResult.SUCCESS);
        } else {
            player.openMenu(blockState.getMenuProvider(level, blockPos));
            player.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
            cir.setReturnValue(InteractionResult.CONSUME);
        }
    }
    public MenuProvider getMenuProvider(BlockState blockState, Level level, BlockPos blockPos) {
        return new SimpleMenuProvider((i, inventory, player) -> {
            return new FletchingMenu(i, inventory, ContainerLevelAccess.create(level, blockPos));}, CONTAINER_TITLE);
    }
}
