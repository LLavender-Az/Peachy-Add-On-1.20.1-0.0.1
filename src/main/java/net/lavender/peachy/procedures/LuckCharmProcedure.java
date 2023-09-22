package net.lavender.peachy.procedures;

import net.lavender.peachy.common.ItemInit;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class LuckCharmProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemInit.LUCK_CHARM.get()) {
            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
                _entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 60, 1));
        }
    }
}
