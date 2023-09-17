package net.lavender.peachy.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;

public class StimulatedEffect extends MobEffect {
    public StimulatedEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, 3402751);
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        if (this == MobEffects.DAMAGE_RESISTANCE) {
            int k = 25 >> p_19456_;
            if (k > 0) {
                return p_19455_ % k == 0;
            }
        }
        return true;
    }
}
