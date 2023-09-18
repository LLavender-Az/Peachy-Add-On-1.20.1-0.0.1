package net.lavender.peachy.datagen;

import net.lavender.peachy.Peachy;
import net.lavender.peachy.common.FoodInit;
import net.lavender.peachy.common.ItemInit;
import net.lavender.peachy.datagen.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.List;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Peachy.MOD_ID);
    }

    @Override
    protected void start() {

        add("peach_from_birch_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.BIRCH_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()}, FoodInit.PEACH.get()));

        add("poppy_seeds_from_poppy", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.POPPY).build(),
                LootItemRandomChanceCondition.randomChance(0.10f).build()}, FoodInit.POPPY_SEEDS.get()));

        add("large_amethyst_from_amethyst", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.AMETHYST_CLUSTER).build(),
                LootItemRandomChanceCondition.randomChance(0.08f).build()}, ItemInit.LARGE_AMETHYST_CHUNK.get()));

        add("peach_from_plains_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/plains_village")).build()}, FoodInit.PEACH.get()));

        add("poppy_seeds_from_plains_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/plains_village")).build()}, FoodInit.POPPY_SEEDS.get()));

        add("mint_from_plains_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/plains_village")).build()}, FoodInit.MINT.get()));

        add("mint_from_taiga_village", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/taiga_village")).build() }, FoodInit.MINT.get()));



    }
}