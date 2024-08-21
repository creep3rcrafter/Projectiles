package net.creep3rcrafter.projectiles.item;

import net.creep3rcrafter.projectiles.entity.projectile.CopperArrow;
import net.creep3rcrafter.projectiles.entity.projectile.CustomArrow;
import net.creep3rcrafter.projectiles.entity.projectile.EchoArrow;
import net.creep3rcrafter.projectiles.entity.projectile.SlimeArrow;
import net.minecraft.ChatFormatting;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class CustomArrowItem extends BaseArrowItem {
    public CustomArrowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity livingEntity) {
        CustomArrow arrow = new CustomArrow(level, livingEntity);
        arrow.pickup = AbstractArrow.Pickup.ALLOWED;
        arrow.setBaseDamage(getBaseDamage());
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        if (compoundTag.contains("tip")){
            arrow.setTip(compoundTag.getFloat("tip"));
        }
        if (compoundTag.contains("rod")){
            arrow.setRod(compoundTag.getFloat("rod"));
        }
        if (compoundTag.contains("tail")){
            arrow.setTail(compoundTag.getFloat("tail"));
        }
        return arrow;
    }

    @Override
    public void onCraftedBy(ItemStack itemStack, Level level, Player player) {
        super.onCraftedBy(itemStack, level, player);
    }


    @Override
    public double getBaseDamage(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        double damage = 0;
        if (compoundTag.contains("tip")) {
            if (compoundTag.getFloat("tip") == 0.0f) {
                damage += 0;
            } else if (compoundTag.getFloat("tip") == 0.05f) {
                damage += 1;
            } else if (compoundTag.getFloat("tip") == 0.1f) {
                damage += 1;
            } else if (compoundTag.getFloat("tip") == 0.15f) {
                damage += 2;
            } else if (compoundTag.getFloat("tip") == 0.2f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.25f) {
                damage += 4;
            } else if (compoundTag.getFloat("tip") == 0.3f) {
                damage += 5;
            } else if (compoundTag.getFloat("tip") == 0.35f) {
                damage += 6;
            } else if (compoundTag.getFloat("tip") == 0.4f) {
                damage += 4;
            } else if (compoundTag.getFloat("tip") == 0.45f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.5f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.55f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.6f) {
                damage -= 0.5;
            } else if (compoundTag.getFloat("tip") == 0.65f) {
                damage -= 0.5;
            } else if (compoundTag.getFloat("tip") == 0.7f) {
                damage -= 0.25;
            } else if (compoundTag.getFloat("tip") == 0.75f) {
                damage += 0.5;
            } else if (compoundTag.getFloat("tip") == 0.8f) {
                damage += 0.5;
            } else if (compoundTag.getFloat("tip") == 0.85f) {
                damage += 3;
            } else if (compoundTag.getFloat("tip") == 0.9f) {
                damage += 2;
            }
        }

        if (compoundTag.contains("rod")) {
            if (compoundTag.getFloat("rod") == 0.0f) {
                damage += 0.5;
            } else if (compoundTag.getFloat("rod") == 0.05f) {
                damage += 1.5;
            } else if (compoundTag.getFloat("rod") == 0.1f) {
                damage += 3;
            }
        }

        if (compoundTag.contains("tail")) {
            if (compoundTag.getFloat("tail") == 0.0f) {
                if (compoundTag.contains("rod") && compoundTag.getFloat("rod") == 0.1f) {
                    damage -= 0.5;
                } else {
                    damage += 0.5;
                }
            } else if (compoundTag.getFloat("tail") == 0.05f) {
                damage += 1;
            }
        }
        return damage;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, @NotNull List<Component> list, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, list, tooltipFlag);
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        if (compoundTag.contains("tip")) {
            if (compoundTag.getFloat("tip") == 0.0f) {
            } else if (compoundTag.getFloat("tip") == 0.05f) {
            } else if (compoundTag.getFloat("tip") == 0.1f) {
            } else if (compoundTag.getFloat("tip") == 0.15f) {
            } else if (compoundTag.getFloat("tip") == 0.2f) {
            } else if (compoundTag.getFloat("tip") == 0.25f) {
            } else if (compoundTag.getFloat("tip") == 0.3f) {
            } else if (compoundTag.getFloat("tip") == 0.35f) {
            } else if (compoundTag.getFloat("tip") == 0.4f) {
            } else if (compoundTag.getFloat("tip") == 0.45f) {
            } else if (compoundTag.getFloat("tip") == 0.5f) {
            } else if (compoundTag.getFloat("tip") == 0.55f) {
                list.add(Component.translatable("projectiles.prismarine_tip.desc").withStyle(ChatFormatting.BLUE));
            } else if (compoundTag.getFloat("tip") == 0.6f) {
                list.add(Component.literal(String.valueOf(SlimeArrow.BASE_KNOCKBACK)).withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable("projectiles.slime_tip.desc").withStyle(ChatFormatting.GREEN)));
            } else if (compoundTag.getFloat("tip") == 0.65f) {
                list.add(Component.translatable("projectiles.cobweb_tip.desc").withStyle(ChatFormatting.GRAY));
            } else if (compoundTag.getFloat("tip") == 0.7f) {
                list.add(Component.translatable("projectiles.chorus_tip.desc").withStyle(ChatFormatting.LIGHT_PURPLE));
            } else if (compoundTag.getFloat("tip") == 0.75f) {
                list.add(Component.translatable("projectiles.dynamite_tip.desc").withStyle(ChatFormatting.RED));
            } else if (compoundTag.getFloat("tip") == 0.8f) {
                list.add(Component.translatable("projectiles.ender_tip.desc").withStyle(ChatFormatting.DARK_BLUE));
            } else if (compoundTag.getFloat("tip") == 0.85f) {
                list.add(Component.literal(String.valueOf(EchoArrow.SONIC_DAMAGE)).withStyle(ChatFormatting.AQUA)
                        .append(Component.translatable("projectiles.echo_tip.desc").withStyle(ChatFormatting.AQUA)));
            } else if (compoundTag.getFloat("tip") == 0.9f) {
                list.add(Component.translatable("projectiles.soul_tip.desc").withStyle(ChatFormatting.AQUA));
            }
        }

        if (compoundTag.contains("rod")) {
            if (compoundTag.getFloat("rod") == 0.0f) {
            } else if (compoundTag.getFloat("rod") == 0.05f) {
                list.add(Component.translatable("projectiles.bamboo_rod.desc").withStyle(ChatFormatting.GRAY));
            } else if (compoundTag.getFloat("rod") == 0.1f) {
                list.add(Component.translatable("projectiles.blaze_rod.desc.1").withStyle(ChatFormatting.GOLD));
                list.add(Component.translatable("projectiles.blaze_rod.desc.2").withStyle(ChatFormatting.YELLOW));
            }
        }

        if (compoundTag.contains("tail")) {
            if (compoundTag.getFloat("tail") == 0.0f) {
                if (compoundTag.contains("rod") && compoundTag.getFloat("rod") == 0.1f) {
                    list.add(Component.translatable("projectiles.burnt_feather_tail.desc").withStyle(ChatFormatting.RED));
                } else {
                }
            } else if (compoundTag.getFloat("tail") == 0.05f) {
                list.add(Component.translatable("projectiles.ghast_scale_tail.desc").withStyle(ChatFormatting.GREEN));
            }
        }
    }

    @Override
    public void fillItemCategory(CreativeModeTab creativeModeTab, NonNullList<ItemStack> nonNullList) {
        //super.fillItemCategory(creativeModeTab, nonNullList);
        if (creativeModeTab == CreativeModeTab.TAB_COMBAT) {
            for (int rod = 0; rod < 3; rod++) {
                for (int tip = 0; tip < 19; tip++) {
                    for (int tail = 0; tail < 2; tail++) {
                        if (rod == 0 && tail == 0 && tip == 1) {

                        } else {
                            ItemStack itemStack = new ItemStack(this);
                            CompoundTag compoundTag = itemStack.getOrCreateTag();
                            compoundTag.putFloat("tip", new BigDecimal(Float.toString(tip * 0.05f)).setScale(2, RoundingMode.HALF_UP).floatValue());
                            compoundTag.putFloat("rod", new BigDecimal(Float.toString(rod * 0.05f)).setScale(2, RoundingMode.HALF_UP).floatValue());
                            compoundTag.putFloat("tail", new BigDecimal(Float.toString(tail * 0.05f)).setScale(2, RoundingMode.HALF_UP).floatValue());
                            itemStack.save(compoundTag);
                            nonNullList.add(itemStack);
                        }
                    }
                }
            }
        }
    }

    @Override
    public Component getName(ItemStack itemStack) {
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        String tip = "";
        String rod = "";
        String tail = "";
        if (compoundTag.contains("tip")) {
            if (compoundTag.getFloat("tip") == 0.0f) {

            } else if (compoundTag.getFloat("tip") == 0.05f) {
                tip = "projectiles.flint_tip";
            } else if (compoundTag.getFloat("tip") == 0.1f) {
                tip = "projectiles.bone_tip";
            } else if (compoundTag.getFloat("tip") == 0.15f) {
                tip = "projectiles.copper_tip";
            } else if (compoundTag.getFloat("tip") == 0.2f) {
                tip = "projectiles.iron_tip";
            } else if (compoundTag.getFloat("tip") == 0.25f) {
                tip = "projectiles.gold_tip";
            } else if (compoundTag.getFloat("tip") == 0.3f) {
                tip = "projectiles.diamond_tip";
            } else if (compoundTag.getFloat("tip") == 0.35f) {
                tip = "projectiles.netherite_tip";
            } else if (compoundTag.getFloat("tip") == 0.4f) {
                tip = "projectiles.obsidian_tip";
            } else if (compoundTag.getFloat("tip") == 0.45f) {
                tip = "projectiles.nether_quartz_tip";
            } else if (compoundTag.getFloat("tip") == 0.5f) {
                tip = "projectiles.amethyst_tip";
            } else if (compoundTag.getFloat("tip") == 0.55f) {
                tip = "projectiles.prismarine_tip";
            } else if (compoundTag.getFloat("tip") == 0.6f) {
                tip = "projectiles.slime_tip";
            } else if (compoundTag.getFloat("tip") == 0.65f) {
                tip = "projectiles.cobweb_tip";
            } else if (compoundTag.getFloat("tip") == 0.7f) {
                tip = "projectiles.chorus_tip";
            } else if (compoundTag.getFloat("tip") == 0.75f) {
                tip = "projectiles.dynamite_tip";
            } else if (compoundTag.getFloat("tip") == 0.8f) {
                tip = "projectiles.ender_tip";
            } else if (compoundTag.getFloat("tip") == 0.85f) {
                tip = "projectiles.echo_tip";
            } else if (compoundTag.getFloat("tip") == 0.9f) {
                tip = "projectiles.soul_tip";
            }
        }

        if (compoundTag.contains("rod")) {
            if (compoundTag.getFloat("rod") == 0.0f) {
                rod = "projectiles.wood_rod";
            } else if (compoundTag.getFloat("rod") == 0.05f) {
                rod = "projectiles.bamboo_rod";
            } else if (compoundTag.getFloat("rod") == 0.1f) {
                rod = "projectiles.blaze_rod";
            }
        }

        if (compoundTag.contains("tail")) {
            if (compoundTag.getFloat("tail") == 0.0f) {
                if (compoundTag.contains("rod") && compoundTag.getFloat("rod") == 0.1f) {
                    tail = "projectiles.burnt_feather_tail";
                } else {
                    tail = "projectiles.feather_tail";
                }
            } else if (compoundTag.getFloat("tail") == 0.05f) {
                tail = "projectiles.ghast_scale_tail";
            }
        }

        return Component.translatable(tip).append(Component.translatable(rod).append(Component.translatable(tail).append(Component.translatable(this.getDescriptionId()))));
    }
}
