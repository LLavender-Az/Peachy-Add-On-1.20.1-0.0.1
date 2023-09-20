package net.lavender.peachy.advanced.effect;

import net.lavender.peachy.procedure.RadiantActiveTickConditionProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;


public class RadiantEffect extends MobEffect {
    public RadiantEffect() {
        super(MobEffectCategory.BENEFICIAL, -1803058);
    }

    @Override
    public String getDescriptionId() {
        return "effect.peachy.radiant";
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        RadiantActiveTickConditionProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
