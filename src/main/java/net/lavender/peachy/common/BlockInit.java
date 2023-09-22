package net.lavender.peachy.common;

import net.lavender.peachy.Peachy;
import net.lavender.peachy.advanced.effect.ModEffects;
import net.lavender.peachy.common.block.custom.CheeseWheelBlock;
import net.lavender.peachy.common.block.custom.ChurnBlock;
import net.lavender.peachy.common.block.custom.MintCrop;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Peachy.MOD_ID);

    // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

    public static final RegistryObject<Block> CARBONATED_ROCK_CRATE = registerBlock("carbonated_rock_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.WOOD).mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> CARBONATED_ROCK_ORE = registerBlock("carbonated_rock_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)
                    .requiresCorrectToolForDrops().sound(SoundType.BONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CHURN = registerBlock("churn",
            () -> new ChurnBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().sound(SoundType.WOOD).mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> CHEESE_WHEEL = registerBlock("cheese_wheel",
            () -> new CheeseWheelBlock(BlockBehaviour.Properties.copy(Blocks.CAKE).sound(SoundType.WOOL).destroyTime(40f).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> IRON_RICH_GRAVEL = registerBlock("iron_rich_gravel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.GRAVEL).mapColor(MapColor.RAW_IRON), UniformInt.of(2,4)));
    public static final RegistryObject<Block> LEMON_CRATE = registerBlock("lemon_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> MINT_SACK = registerBlock("mint_sack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> MINT_CROP = registerBlock("mint_crop",
            () -> new MintCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PEACH_CRATE = registerBlock("peach_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD).mapColor(MapColor.WOOD)));
    public static final RegistryObject<Block> PEACH_PIT_SACK = registerBlock("peach_pit_sack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> ROASTED_PEACH_PIT_SACK = registerBlock("roasted_peach_pit_sack",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> ROSE_FLOWER = registerBlock("rose_flower",
            () -> new FlowerBlock(ModEffects.RADIANT, 0, BlockBehaviour.Properties.copy(Blocks.POPPY).sound(SoundType.GRASS).noCollission().mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> WILD_MINT = registerBlock("wild_mint",
            () -> new FlowerBlock(ModEffects.STIMULATED, 0, BlockBehaviour.Properties.copy(Blocks.ALLIUM).sound(SoundType.GRASS).noCollission().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> POTTED_MINT = BLOCKS.register("potted_mint",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), BlockInit.WILD_MINT,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}