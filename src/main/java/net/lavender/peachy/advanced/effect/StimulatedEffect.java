package net.lavender.peachy.advanced.effect;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class StimulatedEffect extends MobEffect {
    public StimulatedEffect() {
        super(MobEffectCategory.BENEFICIAL, -3342388);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.hasEffect(MobEffects.DAMAGE_RESISTANCE)) {
        }
    }
}