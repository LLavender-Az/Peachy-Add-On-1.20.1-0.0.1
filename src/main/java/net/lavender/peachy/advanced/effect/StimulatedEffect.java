package net.lavender.peachy.advanced.effect;

import net.lavender.peachy.procedure.StimulatedActiveTickConditionProcedure;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.LivingEntity;

public class StimulatedEffect extends MobEffect {
    public StimulatedEffect() {
        super(MobEffectCategory.BENEFICIAL, -3342388);
    }

    @Override
    public String getDescriptionId() {
        return "effect.peachy.stimulated";
    }
    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        StimulatedActiveTickConditionProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
