package net.lavender.peachy.advanced.effect;

import net.lavender.peachy.Peachy;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class ModEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Peachy.MOD_ID);
    public static final RegistryObject<MobEffect> RADIANT = REGISTRY.register("radiant", () -> new RadiantEffect());
    public static final RegistryObject<MobEffect> STIMULATED = REGISTRY.register("stimulated", () -> new StimulatedEffect());
}
