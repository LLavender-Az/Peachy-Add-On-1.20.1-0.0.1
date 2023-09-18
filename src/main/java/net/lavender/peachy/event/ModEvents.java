package net.lavender.peachy.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.lavender.peachy.Peachy;
import net.lavender.peachy.common.FoodInit;
import net.lavender.peachy.common.ItemInit;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Peachy.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        //FARMER TRADES 1 EMERALD FOR 11 PEACHES
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(FoodInit.PEACH.get(), 11);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack, 25, 9, 0.45F));
        }
        //FARMER TRADES 9 PEACHES FOR 1 EMERALD
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 1);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(FoodInit.PEACH.get(), 9),
                    stack, 25, 9, 0.45F));
        }
        //FARMER TRADES 19 PEACHES FOR 2 EMERALDS
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.EMERALD, 2);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(FoodInit.PEACH.get(), 19),
                    stack, 25, 9, 0.45F));

        }
        //CLERIC TRADES 3 DIAMONDS FOR 1 LARGE AMETHYST CHUNK
        if (event.getType() == VillagerProfession.CLERIC) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ItemInit.LARGE_AMETHYST_CHUNK.get(), 1);
                int villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                        new ItemStack(Items.DIAMOND, 3),
                        stack, 5, 25, 0.25F));

            }
        //LEATHERWORKER TRADES 4 LEATHER FOR 9 TATTERED_LEATHER
        if (event.getType() == VillagerProfession.LEATHERWORKER) {
                    Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                    ItemStack stack = new ItemStack(ItemInit.TATTERED_LEATHER.get(), 9);
                    int villagerLevel = 1;

                    trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                            new ItemStack(Items.LEATHER, 4),
                            stack, 32, 16, 0.45F));

        }
    }
}