package net.lavender.peachy.advanced.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

@SuppressWarnings("unused")
public class ExtraEffect extends MobEffect {
    public ExtraEffect() {
        super(MobEffectCategory.BENEFICIAL, -1803058);
    }



    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (this == MobEffects.REGENERATION) {
            if (pLivingEntity.getHealth() < pLivingEntity.getMaxHealth()) {
                pLivingEntity.heal(.2F);
            }
        }
    }
}