package net.creep3rcrafter.projectiles.mixin;

import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Predicate;

@Mixin(BowItem.class)
public abstract class BowItemMixin {
    private static final Predicate<ItemStack> ARROW_ONLY = (itemStack) -> {
        return itemStack.is(ItemTags.ARROWS)
                || itemStack.is(ModItems.WOOD_ARROW.get())
                || itemStack.is(ModItems.COPPER_ARROW.get())
                || itemStack.is(ModItems.IRON_ARROW.get())
                || itemStack.is(ModItems.GOLD_ARROW.get())
                || itemStack.is(ModItems.DIAMOND_ARROW.get())
                || itemStack.is(ModItems.NETHERITE_ARROW.get())
                || itemStack.is(ModItems.OBSIDIAN_ARROW.get())
                || itemStack.is(ModItems.NETHER_QUARTZ_ARROW.get())
                || itemStack.is(ModItems.AMETHYST_ARROW.get())
                || itemStack.is(ModItems.PRISMARINE_ARROW.get())
                || itemStack.is(ModItems.SLIME_ARROW.get())
                || itemStack.is(ModItems.TNT_ARROW.get())
                || itemStack.is(ModItems.ECHO_ARROW.get());
    };
    @Inject(method = "getAllSupportedProjectiles", at = @At("HEAD"), cancellable = true)
    public void inject(CallbackInfoReturnable<Predicate<ItemStack>> cir) {
        cir.setReturnValue(ARROW_ONLY);
    }
}
