package net.lavender.peachy.common.item.custom;

import net.lavender.peachy.procedures.LuckCharmItemRightclickedProcedure;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import javax.annotation.Nullable;
import java.util.List;

public class LuckCharmItem extends Item {
    public LuckCharmItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 20;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemstack = ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        LuckCharmItemRightclickedProcedure.execute(entity, itemstack);
        return ar;
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.literal("Luck 0:10").withStyle(ChatFormatting.GREEN));
        } else {
            components.add(Component.literal("Luck 0:10").withStyle(ChatFormatting.GREEN));
        }

        super.appendHoverText(stack, level, components, flag);
    }
}
