package net.lavender.peachy.effect;

import net.lavender.peachy.Peachy;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Peachy.MOD_ID);

    public static final RegistryObject<MobEffect> RADIANT = MOB_EFFECTS.register("radiant", () -> new RadiantEffect(MobEffectCategory.BENEFICIAL, 16284963));

    public static final RegistryObject<MobEffect> STIMULATED = MOB_EFFECTS.register("stimulated", () -> new StimulatedEffect(MobEffectCategory.BENEFICIAL, 3402751));





    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}