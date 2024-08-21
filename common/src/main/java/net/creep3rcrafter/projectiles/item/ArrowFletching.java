package net.creep3rcrafter.projectiles.item;

import com.google.common.collect.Lists;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.List;

public class ArrowFletching {
    public static final List<Item> TIPS = Lists.newArrayList();
    public static final List<Item> RODS = Lists.newArrayList();
    public static final List<Item> TAILS = Lists.newArrayList();
    public static void addTip(Item item){
        TIPS.add(item);
    }
    public static void addRod(Item item){
        RODS.add(item);
    }
    public static void addTail(Item item){
        TAILS.add(item);
    }
    static {
        addTip(Items.FLINT);
        addRod(Items.STICK);
        addTail(Items.FEATHER);
    }
    public static boolean isTip(ItemStack itemStack){
        return TIPS.contains(itemStack.getItem());
    }
    public static boolean isRod(ItemStack itemStack){
        return RODS.contains(itemStack.getItem());
    }
    public static boolean isTail(ItemStack itemStack){
        return TAILS.contains(itemStack.getItem());
    }
}
