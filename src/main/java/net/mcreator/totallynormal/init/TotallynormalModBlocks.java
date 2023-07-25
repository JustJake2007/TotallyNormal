
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

import net.mcreator.totallynormal.block.RubyOreBlock;
import net.mcreator.totallynormal.block.RubyBlockBlock;
import net.mcreator.totallynormal.block.MudBlock;
import net.mcreator.totallynormal.block.Dirt_OreOreBlock;
import net.mcreator.totallynormal.block.Dirt_OreBlockBlock;
import net.mcreator.totallynormal.block.DirtPortalBlock;
import net.mcreator.totallynormal.block.DirtAppleBlockBlock;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TotallynormalMod.MODID);
	public static final RegistryObject<Block> DIRT_PORTAL = REGISTRY.register("dirt_portal", () -> new DirtPortalBlock());
	public static final RegistryObject<Block> DIRT_APPLE_BLOCK = REGISTRY.register("dirt_apple_block", () -> new DirtAppleBlockBlock());
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());
	public static final RegistryObject<Block> DIRT_ORE_ORE = REGISTRY.register("dirt_ore_ore", () -> new Dirt_OreOreBlock());
	public static final RegistryObject<Block> DIRT_ORE_BLOCK = REGISTRY.register("dirt_ore_block", () -> new Dirt_OreBlockBlock());
	public static final RegistryObject<Block> ASH = REGISTRY.register("ash", () -> new AshBlock());
	public static final RegistryObject<Block> WASTELAND_PORTAL = REGISTRY.register("wasteland_portal", () -> new WastelandPortalBlock());
	public static final RegistryObject<Block> RADIUM_ORE = REGISTRY.register("radium_ore", () -> new RadiumOreBlock());
	public static final RegistryObject<Block> RADIUM_BLOCK = REGISTRY.register("radium_block", () -> new RadiumBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());

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
