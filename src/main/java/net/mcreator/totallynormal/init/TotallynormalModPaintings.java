
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TotallynormalMod.MODID);
	public static final RegistryObject<PaintingVariant> RICK_ASTLEY = REGISTRY.register("rick_astley", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> EMERALD_AMONG_US = REGISTRY.register("emerald_among_us", () -> new PaintingVariant(16, 16));
}
