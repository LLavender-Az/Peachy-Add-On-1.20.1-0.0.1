package net.lavender.peachy.common;

import net.lavender.peachy.Peachy;
import net.lavender.peachy.world.features.ores.CarbonatedRockOreFeature;
import net.lavender.peachy.world.features.ores.IronRichGravelFeature;
import net.lavender.peachy.world.features.plants.RoseFlowerFeature;
import net.lavender.peachy.world.features.plants.WildMintFeature;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class FeatureInit {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, Peachy.MOD_ID);
    public static final RegistryObject<Feature<?>> IRON_RICH_GRAVEL = REGISTRY.register("iron_rich_gravel", IronRichGravelFeature::new);
    public static final RegistryObject<Feature<?>> CARBONATED_ROCK_ORE = REGISTRY.register("carbonated_rock_ore", CarbonatedRockOreFeature::new);
    public static final RegistryObject<Feature<?>> WILD_MINT = REGISTRY.register("wild_mint", WildMintFeature::new);
    public static final RegistryObject<Feature<?>> ROSE_FLOWER = REGISTRY.register("rose_flower", RoseFlowerFeature::new);
}