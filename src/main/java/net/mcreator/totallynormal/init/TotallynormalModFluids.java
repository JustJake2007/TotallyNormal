
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.totallynormal.fluid.MudFluid;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TotallynormalMod.MODID);
	public static final RegistryObject<FlowingFluid> MUD = REGISTRY.register("mud", () -> new MudFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MUD = REGISTRY.register("flowing_mud", () -> new MudFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MUD.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MUD.get(), RenderType.translucent());
		}
	}
}
