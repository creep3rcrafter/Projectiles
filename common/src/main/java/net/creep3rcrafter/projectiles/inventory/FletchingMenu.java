package net.creep3rcrafter.projectiles.inventory;

import net.creep3rcrafter.projectiles.item.ArrowFletching;
import net.creep3rcrafter.projectiles.register.ModMenus;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class FletchingMenu extends AbstractContainerMenu {
    public static final int RESULT_SLOT = 0;
    private static final int CRAFT_SLOT_START = 1;
    private static final int CRAFT_SLOT_END = 4;
    private static final int INV_SLOT_START = 4;
    private static final int INV_SLOT_END = 31;
    private static final int USE_ROW_SLOT_START = 31;
    private static final int USE_ROW_SLOT_END = 40;

    private final ContainerLevelAccess access;
    public final FletchingContainer container;
    private final Player player;

    public FletchingMenu(int i, Inventory inventory) {
        this(i, inventory, ContainerLevelAccess.NULL);
    }

    public FletchingMenu(int i, Inventory inventory, ContainerLevelAccess containerLevelAccess) {
        super(ModMenus.FLETCHING.get(), i);
        this.access = containerLevelAccess;
        this.player = inventory.player;
        this.container = new FletchingContainer(this, 4);
        this.addSlot(new Slot(container, 0, 80, 32));
        this.addSlot(new TipSlot(container, 1, 40, 18));
        this.addSlot(new RodSlot(container, 2, 40, 32));
        this.addSlot(new TailSlot(container, 3, 40, 50));
        int j;
        int k;
        for (j = 0; j < 3; ++j) {
            for (k = 0; k < 9; ++k) {
                this.addSlot(new Slot(inventory, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
            }
        }

        for (j = 0; j < 9; ++j) {
            this.addSlot(new Slot(inventory, j, 8 + j * 18, 142));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        ItemStack quickMovedStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(i);
        if (slot != null && slot.hasItem()) {
            ItemStack rawStack = slot.getItem();
            quickMovedStack = rawStack.copy();//quick itemstack
            if (i <= 0) {
                if (!this.moveItemStackTo(rawStack, 4, 40, true)) {
                    System.out.print("oops1");
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(rawStack, quickMovedStack);
            } else if (i >= 4 && i < 41) {
                if (!this.moveItemStackTo(rawStack, 1, 4, false)) {
                    if (i > 31) {
                        if (!this.moveItemStackTo(rawStack, 31, 40, false)) {
                            System.out.print("oops2");
                            return ItemStack.EMPTY;
                        }
                    }
                } else if (!this.moveItemStackTo(rawStack, 4, 31, false)) {
                    System.out.print("oops3");
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(rawStack, 4, 40, false)) {
                System.out.print("oops4");
                return ItemStack.EMPTY;
            }
            if (rawStack.isEmpty()) {
                System.out.print("oops5");
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
            if (rawStack.getCount() == quickMovedStack.getCount()) {
                System.out.print("oops6");
                return ItemStack.EMPTY;
            }
            slot.onTake(player, rawStack);
        }

        System.out.print("moved");
        return quickMovedStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.access, player, Blocks.FLETCHING_TABLE);
    }

    public static class TipSlot extends Slot {
        public TipSlot(Container container, int i, int j, int k) {
            super(container, i, j, k);
        }

        public boolean mayPlace(ItemStack itemStack) {
            return mayPlaceItem(itemStack);
        }

        public static boolean mayPlaceItem(ItemStack itemStack) {
            return ArrowFletching.isTip(itemStack);
        }

        public int getMaxStackSize() {
            return 64;
        }
    }

    public static class RodSlot extends Slot {
        public RodSlot(Container container, int i, int j, int k) {
            super(container, i, j, k);
        }

        public boolean mayPlace(ItemStack itemStack) {
            return mayPlaceItem(itemStack);
        }

        public static boolean mayPlaceItem(ItemStack itemStack) {
            return ArrowFletching.isRod(itemStack);
        }

        public int getMaxStackSize() {
            return 64;
        }
    }

    public static class TailSlot extends Slot {
        public TailSlot(Container container, int i, int j, int k) {
            super(container, i, j, k);
        }

        public boolean mayPlace(ItemStack itemStack) {
            return mayPlaceItem(itemStack);
        }

        public static boolean mayPlaceItem(ItemStack itemStack) {
            return ArrowFletching.isTail(itemStack);
        }

        public int getMaxStackSize() {
            return 64;
        }
    }
}
