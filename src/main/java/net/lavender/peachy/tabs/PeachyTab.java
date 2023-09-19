package net.lavender.peachy.tabs;


import net.lavender.peachy.Peachy;
import net.lavender.peachy.common.BlockInit;
import net.lavender.peachy.common.FoodInit;
import net.lavender.peachy.common.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PeachyTab {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
                Peachy.MOD_ID);

        public static RegistryObject<CreativeModeTab> PEACHY_TAB = CREATIVE_MODE_TABS.register("peachy_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockInit.PEACH_CRATE.get()))
                        .title(Component.literal("Peachy!"))
                        .displayItems((pParameters, pOutput) -> {

                            //blocks
                            pOutput.accept(BlockInit.PEACH_CRATE.get());
                            pOutput.accept(BlockInit.PEACH_PIT_SACK.get());
                            pOutput.accept(BlockInit.ROASTED_PEACH_PIT_SACK.get());
                            pOutput.accept(BlockInit.CARBONATED_ROCK_CRATE.get());
                            pOutput.accept(BlockInit.LEMON_CRATE.get());
                            pOutput.accept(BlockInit.MINT_SACK.get());
                            pOutput.accept(BlockInit.CARBONATED_ROCK_ORE.get());
                            pOutput.accept(BlockInit.IRON_RICH_GRAVEL.get());
                            pOutput.accept(BlockInit.WILD_MINT.get());
                            pOutput.accept(BlockInit.CHURN.get());
                            pOutput.accept(BlockInit.CHEESE_WHEEL.get());

                            //peach
                            pOutput.accept(FoodInit.PEACH.get());
                            pOutput.accept(FoodInit.PEACH_SLICE.get());
                            pOutput.accept(FoodInit.BAKED_PEACH.get());
                            pOutput.accept(FoodInit.CANDIED_PEACH.get());
                            pOutput.accept(ItemInit.PEACH_PIT.get());
                            pOutput.accept(ItemInit.ROASTED_PEACH_PIT.get());
                            pOutput.accept(ItemInit.CARBONATED_ROCK.get());
                            pOutput.accept(FoodInit.POPPY_SEEDS.get());


                            pOutput.accept(FoodInit.MINT.get());
                            pOutput.accept(ItemInit.ROOTED_MINT.get());
                            pOutput.accept(FoodInit.PEACH_CANDY.get());
                            pOutput.accept(FoodInit.PEACH_COOKIE_CRUMBLE.get());
                            pOutput.accept(FoodInit.PEACHES_N_CREAM.get());
                            pOutput.accept(FoodInit.BREAD_SLICE.get());

                            pOutput.accept(FoodInit.CHEESE.get());
                            pOutput.accept(FoodInit.PEACH_TOAST.get());
                            pOutput.accept(FoodInit.POPPY_SEED_MUFFIN.get());
                            pOutput.accept(FoodInit.GRILLED_CHEESE.get());
                            pOutput.accept(FoodInit.MELON_TANGHULU.get());
                            pOutput.accept(FoodInit.PEACH_ICE_CREAM.get());
                            pOutput.accept(FoodInit.MINT_ICE_CREAM.get());
                            pOutput.accept(FoodInit.PEACH_MOCHI.get());
                            pOutput.accept(FoodInit.MINT_CHOCOLATE_MOCHI.get());

                            pOutput.accept(FoodInit.MINT_CHOCOLATE.get());
                            pOutput.accept(FoodInit.MINT_CHOCOLATE_COOKIE.get());
                            pOutput.accept(FoodInit.PEPPERMINT_PATTIE.get());

                            pOutput.accept(FoodInit.LEMON.get());
                            pOutput.accept(FoodInit.LEMON_SLICE.get());
                            pOutput.accept(FoodInit.LEMON_CANDY.get());

                            //drinks
                            pOutput.accept(FoodInit.LEMONADE.get());
                            pOutput.accept(FoodInit.GLOWBERRY_JUICE.get());
                            pOutput.accept(FoodInit.SWEET_BERRY_JUICE.get());
                            pOutput.accept(FoodInit.PEACH_JUICE.get());
                            pOutput.accept(FoodInit.PEACH_TEA.get());
                            pOutput.accept(FoodInit.MINT_TEA.get());
                            pOutput.accept(FoodInit.HONEY_MINT_TEA.get());
                            pOutput.accept(FoodInit.PEACH_SODA.get());
                            pOutput.accept(FoodInit.CARBONATED_WATER.get());
                            pOutput.accept(FoodInit.PEACH_SYRUP.get());
                            pOutput.accept(FoodInit.MINT_EXTRACT.get());
                            pOutput.accept(FoodInit.LEMON_JUICE.get());





                        })
                        .build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }
    }
