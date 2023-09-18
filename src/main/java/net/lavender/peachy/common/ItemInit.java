package net.lavender.peachy.common;

import net.lavender.peachy.Peachy;
import net.lavender.peachy.common.item.custom.CarbonatedRockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Peachy.MOD_ID);

// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

    public static final RegistryObject<Item> CARBONATED_ROCK = ITEMS.register("carbonated_rock", () -> new CarbonatedRockItem(props()));
    public static final RegistryObject<Item> PEACH_PIT = ITEMS.register("peach_pit", () -> new Item(props()));
    public static final RegistryObject<Item> ROASTED_PEACH_PIT = ITEMS.register("roasted_peach_pit", () -> new Item(props()));
    public static final RegistryObject<Item> ROOTED_MINT = ITEMS.register("rooted_mint", () -> new ItemNameBlockItem(BlockInit.MINT_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> TATTERED_LEATHER = ITEMS.register("tattered_leather", () -> new Item(props()));
    public static final RegistryObject<Item> LARGE_AMETHYST_CHUNK = ITEMS.register("large_amethyst_chunk", () -> new Item(props()));

    private static Item.Properties props() {
        return new Item.Properties();

    }
}
