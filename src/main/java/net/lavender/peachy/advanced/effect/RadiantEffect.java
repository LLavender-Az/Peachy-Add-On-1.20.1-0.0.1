package net.lavender.peachy.advanced.effect;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

@SuppressWarnings("unused")
public class RadiantEffect extends ExtraEffect {
    public RadiantEffect() {
    }


    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.hasEffect(MobEffects.REGENERATION)) {
            return;
        }
        if (entity instanceof Player player) {
            if (player.getFoodData().getSaturationLevel() > 0.0) {
                return;
            }
        }
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(1.0F);
        }
    }


    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 80 == 0;
    }
}