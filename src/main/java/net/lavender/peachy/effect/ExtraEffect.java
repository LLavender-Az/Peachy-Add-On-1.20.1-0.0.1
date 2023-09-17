package net.lavender.peachy.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class ExtraEffect extends MobEffect {
    public ExtraEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity p_19467_, int p_19468_) {
        if (this == MobEffects.LUCK && p_19467_ instanceof Player) {
            if (!p_19467_.level().isClientSide) {
                ((Player)p_19467_).getFoodData().eat(p_19468_ + 1, 0.10F);
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}

