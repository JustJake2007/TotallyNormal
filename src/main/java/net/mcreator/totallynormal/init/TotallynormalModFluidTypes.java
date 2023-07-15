
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.totallynormal.fluid.types.MudFluidType;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TotallynormalMod.MODID);
	public static final RegistryObject<FluidType> MUD_TYPE = REGISTRY.register("mud", () -> new MudFluidType());
}
