package net.creep3rcrafter.projectiles.mixin;

import net.creep3rcrafter.projectiles.register.ModItems;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Item.class)
public abstract class ItemMixin {

    /*
    @Inject(method = "fillItemCategory", at = @At("HEAD"), cancellable = true)
    public void inject2(CreativeModeTab creativeModeTab, NonNullList<ItemStack> nonNullList, CallbackInfo ci) {
        if ((Item) (Object) this instanceof ArrowItem && (Item) (Object) this == Items.ARROW){
            if (creativeModeTab == CreativeModeTab.TAB_COMBAT) {
                for (int rod = 0; rod < 3; rod++) {
                    for (int tail = 0; tail < 2; tail++) {
                        for (int tip = 0; tip < 20; tip++) {
                            if(rod == 0 && tail == 0 && tip == 1){
                                nonNullList.add(new ItemStack((Item) (Object) this));
                            }else{
                                ItemStack itemStack = new ItemStack(ModItems.CUSTOM_ARROW.get());
                                CompoundTag compoundTag = itemStack.getOrCreateTag();
                                compoundTag.putDouble("tip", tip * 0.05f);
                                compoundTag.putDouble("rod", rod * 0.05f);
                                compoundTag.putDouble("tail", tail * 0.05f);
                                itemStack.save(compoundTag);
                                nonNullList.add(itemStack);
                            }
                        }
                    }
                }
            }
        }
    }

     */
}
