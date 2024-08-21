package net.creep3rcrafter.projectiles.inventory;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.StackedContentsCompatible;
import net.minecraft.world.item.ItemStack;

import java.util.Iterator;

public class FletchingContainer implements Container, StackedContentsCompatible {
    private final NonNullList<ItemStack> items;
    private final AbstractContainerMenu menu;

    public FletchingContainer(AbstractContainerMenu abstractContainerMenu, int i){
        this.items = NonNullList.withSize(i, ItemStack.EMPTY);
        this.menu = abstractContainerMenu;
    }
    @Override
    public int getContainerSize() {
        return this.items.size();
    }

    @Override
    public boolean isEmpty() {
        Iterator var1 = this.items.iterator();

        ItemStack itemStack;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            itemStack = (ItemStack)var1.next();
        } while(itemStack.isEmpty());

        return false;
    }

    @Override
    public ItemStack getItem(int i) {
        return i >= this.getContainerSize() ? ItemStack.EMPTY : (ItemStack)this.items.get(i);
    }

    @Override
    public ItemStack removeItem(int i, int j) {
        ItemStack itemStack = ContainerHelper.removeItem(this.items, i, j);
        if (!itemStack.isEmpty()) {
            this.menu.slotsChanged(this);
        }

        return itemStack;
    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        return ContainerHelper.takeItem(this.items, i);
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {
        this.items.set(i, itemStack);
        this.menu.slotsChanged(this);
    }

    @Override
    public void setChanged() {

    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public void clearContent() {
        this.items.clear();
    }

    @Override
    public void fillStackedContents(StackedContents stackedContents) {
        Iterator var2 = this.items.iterator();

        while(var2.hasNext()) {
            ItemStack itemStack = (ItemStack)var2.next();
            stackedContents.accountSimpleStack(itemStack);
        }
    }
}
