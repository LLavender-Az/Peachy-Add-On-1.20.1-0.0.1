package net.lavender.peachy.common.item.custom;

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


public class CandyItem extends Item {
    public CandyItem(Properties properties) {
        super(properties);
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Perky 0:15").withStyle(ChatFormatting.GOLD));
        } else {
            components.add(Component.literal("Perky 0:15").withStyle(ChatFormatting.GOLD));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}