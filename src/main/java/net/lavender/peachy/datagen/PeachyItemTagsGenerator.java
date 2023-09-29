package net.lavender.peachy.datagen;

import net.lavender.peachy.Peachy;
import net.lavender.peachy.common.FoodInit;
import net.lavender.peachy.common.ItemInit;
import net.lavender.peachy.advanced.PeachyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PeachyItemTagsGenerator extends ItemTagsProvider {
    public PeachyItemTagsGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                                   CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Peachy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(PeachyTags.Items.FRUITS)
                .add(Items.APPLE)
                .add(Items.MELON_SLICE)
                .add(Items.SWEET_BERRIES)
                .add(FoodInit.LEMON.get())
                .add(FoodInit.PEACH.get());

        this.tag(PeachyTags.Items.TEA_LEAVES)
                .add(ItemInit.ROSE.get())
                .add(ItemInit.ROASTED_PEACH_PIT.get());








    }
}