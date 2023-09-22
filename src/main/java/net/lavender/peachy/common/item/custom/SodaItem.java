package net.lavender.peachy.common.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;

import javax.annotation.Nullable;
import java.util.List;


public class SodaItem extends Item {
    public SodaItem(Properties properties) {
        super(properties);
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Vibrant 1:00").withStyle(ChatFormatting.GOLD));
        } else {
            components.add(Component.literal("Vibrant 1:00").withStyle(ChatFormatting.GOLD));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    public static final int MAX_STACK_SIZE = 16;


    public ItemStack finishUsingItem(ItemStack p_40684_, Level p_40685_, LivingEntity p_40686_) {
        ItemStack itemstack = super.finishUsingItem(p_40684_, p_40685_, p_40686_);
        return p_40686_ instanceof Player && ((Player) p_40686_)
                .getAbilities().instabuild ? itemstack : new ItemStack(Items.GLASS_BOTTLE);
    }
}