package net.lavender.peachy.advanced;

import net.lavender.peachy.Peachy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PeachyTags {
    public static class Blocks {
        public static final TagKey<Block> CHEESE_BLOCKS = tag("cheese_blocks");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Peachy.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CHEESE = tag("cheese");
        public static final TagKey<Item> FRUITS = tag("fruits");
        public static final TagKey<Item> TEA_LEAVES = tag("tea_leaves");
        public static final TagKey<Item> KNIVES = tag("knives");





        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Peachy.MOD_ID, name));
        }
    }
}