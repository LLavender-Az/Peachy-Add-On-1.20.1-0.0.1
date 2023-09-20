package net.lavender.peachy.datagen;


import net.lavender.peachy.Peachy;
import net.lavender.peachy.common.BlockInit;
import net.lavender.peachy.advanced.PeachyTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PeachyBlockTagsGenerator extends BlockTagsProvider {
    public PeachyBlockTagsGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Peachy.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PeachyTags.Blocks.CHEESE)
                .add(BlockInit.CHEESE_WHEEL.get());



    }
}