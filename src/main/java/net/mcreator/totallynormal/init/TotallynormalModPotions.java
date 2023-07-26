
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TotallynormalMod.MODID);
	public static final RegistryObject<Potion> RADIOACTIVE_JUICE = REGISTRY.register("radioactive_juice", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, false, true),
			new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 1, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 2400, 1, false, true), new MobEffectInstance(MobEffects.DARKNESS, 1000, 1, false, true)));
}
