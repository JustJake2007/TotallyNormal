
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.totallynormal.block.MudBlock;
import net.mcreator.totallynormal.block.DirtPortalBlock;
import net.mcreator.totallynormal.block.DirtAppleBlockBlock;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TotallynormalMod.MODID);
	public static final RegistryObject<Block> DIRT_PORTAL = REGISTRY.register("dirt_portal", () -> new DirtPortalBlock());
	public static final RegistryObject<Block> DIRT_APPLE_BLOCK = REGISTRY.register("dirt_apple_block", () -> new DirtAppleBlockBlock());
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			DirtAppleBlockBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			DirtAppleBlockBlock.itemColorLoad(event);
		}
	}
}
