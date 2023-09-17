package net.lavender.peachy.effect;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class RadiantEffect extends ExtraEffect {
    public RadiantEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, 16284963);
    }
    @Override
    public void applyEffectTick(LivingEntity p_19467_, int p_19468_) {
        if (this == MobEffects.REGENERATION) {
            if (p_19467_.getHealth() < p_19467_.getMaxHealth()) {
                p_19467_.heal(1F);
            }

        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}

