
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TotallynormalMod.MODID);
	public static final RegistryObject<SoundEvent> FITNESS_GRAM_PACER_TEST = REGISTRY.register("fitness_gram_pacer_test", () -> new SoundEvent(new ResourceLocation("totallynormal", "fitness_gram_pacer_test")));
	public static final RegistryObject<SoundEvent> TECHNOCHASED = REGISTRY.register("technochased", () -> new SoundEvent(new ResourceLocation("totallynormal", "technochased")));
}
