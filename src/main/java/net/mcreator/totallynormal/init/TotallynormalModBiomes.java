
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.totallynormal.world.biome.DirtsBiome;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TotallynormalMod.MODID);
	public static final RegistryObject<Biome> DIRTS = REGISTRY.register("dirts", DirtsBiome::createBiome);
}
