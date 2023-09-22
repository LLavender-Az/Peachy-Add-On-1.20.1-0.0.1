package net.lavender.peachy.advanced.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

@SuppressWarnings("unused")
public class RadiantEffect extends MobEffect {
    public RadiantEffect() {
        super(MobEffectCategory.BENEFICIAL, -1803058);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.hasEffect(MobEffects.REGENERATION)) {
            return;
        }
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1.0F);
        }
    }
}