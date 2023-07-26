package net.mcreator.totallynormal.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class EmeraldCarrotPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity, String EmeraldPiggy) {
		if (entity == null || EmeraldPiggy == null)
			return;
		if ((entity.getDisplayName().getString()).equals(EmeraldPiggy)) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 60, 1));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 120, 1));
		}
	}
}
