package net.lavender.peachy;

import com.mojang.logging.LogUtils;
import net.lavender.peachy.common.BlockInit;
import net.lavender.peachy.common.FoodInit;
import net.lavender.peachy.common.ItemInit;
import net.lavender.peachy.effect.ModEffects;
import net.lavender.peachy.datagen.loot.ModLootModifiers;
import net.lavender.peachy.tabs.PeachyTab;
import net.lavender.peachy.util.PeachyTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Peachy.MOD_ID)
public class Peachy {
    public static final String MOD_ID = "peachy";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Peachy() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        BlockInit.BLOCKS.register(modEventBus);
        FoodInit.FOODS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        ModEffects.MOB_EFFECTS.register(modEventBus);
        PeachyTab.CREATIVE_MODE_TABS.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(FoodInit.CHOCOLATE_ICE_CREAM.get());
            event.accept(FoodInit.DARK_CHOCOLATE.get());
            event.accept(FoodInit.MILK_CHOCOLATE.get());
            if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
                event.accept(ItemInit.TATTERED_LEATHER.get());
                event.accept(ItemInit.LARGE_AMETHYST_CHUNK.get());

            }
        }
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
