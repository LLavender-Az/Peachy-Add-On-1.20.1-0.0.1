package net.lavender.peachy.advanced.effect.items;

import net.lavender.peachy.common.item.common.BowlItem;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class StrongEffectStimulatedSnack extends BowlItem {
    public StrongEffectStimulatedSnack(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Stimulated 5:00").withStyle(ChatFormatting.RED));
        } else {
            components.add(Component.literal("Stimulated 5:00").withStyle(ChatFormatting.RED));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}