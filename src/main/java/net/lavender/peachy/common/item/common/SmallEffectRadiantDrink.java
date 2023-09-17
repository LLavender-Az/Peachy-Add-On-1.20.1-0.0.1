package net.lavender.peachy.common.item.common;

import net.lavender.peachy.common.item.custom.DrinkItem;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;


public class SmallEffectRadiantDrink extends DrinkItem {
    public SmallEffectRadiantDrink(Properties properties) {
        super(properties);
    }


    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Radiant 0:30").withStyle(ChatFormatting.RED));
        } else {
            components.add(Component.literal("Radiant 0:30").withStyle(ChatFormatting.RED));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}