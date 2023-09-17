package net.lavender.peachy.common.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class CarbonatedRockItem extends Item {
    public CarbonatedRockItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Dissolves in Water..").withStyle(ChatFormatting.DARK_GRAY));
        } else {
            components.add(Component.literal("Dissolves in Water..").withStyle(ChatFormatting.DARK_GRAY));
        }


        super.appendHoverText(stack, level, components, flag);
    }
}