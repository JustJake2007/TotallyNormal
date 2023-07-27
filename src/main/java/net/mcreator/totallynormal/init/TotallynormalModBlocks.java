
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

import net.mcreator.totallynormal.block.WeirdGrassBlock;
import net.mcreator.totallynormal.block.WastelandPortalBlock;
import net.mcreator.totallynormal.block.RubyOreBlock;
import net.mcreator.totallynormal.block.RubyBlockBlock;
import net.mcreator.totallynormal.block.Royal_SteelOreBlock;
import net.mcreator.totallynormal.block.Royal_SteelBlockBlock;
import net.mcreator.totallynormal.block.RadiumOreBlock;
import net.mcreator.totallynormal.block.RadiumBlockBlock;
import net.mcreator.totallynormal.block.MudBlock;
import net.mcreator.totallynormal.block.MoonshadowWoodBlock;
import net.mcreator.totallynormal.block.MoonshadowStairsBlock;
import net.mcreator.totallynormal.block.MoonshadowSlabBlock;
import net.mcreator.totallynormal.block.MoonshadowPressurePlateBlock;
import net.mcreator.totallynormal.block.MoonshadowPlanksBlock;
import net.mcreator.totallynormal.block.MoonshadowLogBlock;
import net.mcreator.totallynormal.block.MoonshadowLeavesBlock;
import net.mcreator.totallynormal.block.MoonshadowFenceGateBlock;
import net.mcreator.totallynormal.block.MoonshadowFenceBlock;
import net.mcreator.totallynormal.block.MoonshadowButtonBlock;
import net.mcreator.totallynormal.block.LuminaraBlock;
import net.mcreator.totallynormal.block.Dirt_OreOreBlock;
import net.mcreator.totallynormal.block.Dirt_OreBlockBlock;
import net.mcreator.totallynormal.block.DirtPortalBlock;
import net.mcreator.totallynormal.block.DirtAppleBlockBlock;
import net.mcreator.totallynormal.block.ChaosOreBlock;
import net.mcreator.totallynormal.block.ChaosHeartBlockBlock;
import net.mcreator.totallynormal.block.ChaosBlockBlock;
import net.mcreator.totallynormal.block.AshBlock;
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
	public static final RegistryObject<Block> CHAOS_ORE = REGISTRY.register("chaos_ore", () -> new ChaosOreBlock());
	public static final RegistryObject<Block> CHAOS_BLOCK = REGISTRY.register("chaos_block", () -> new ChaosBlockBlock());
	public static final RegistryObject<Block> WEIRD_GRASS = REGISTRY.register("weird_grass", () -> new WeirdGrassBlock());
	public static final RegistryObject<Block> LUMINARA = REGISTRY.register("luminara", () -> new LuminaraBlock());
	public static final RegistryObject<Block> MOONSHADOW_WOOD = REGISTRY.register("moonshadow_wood", () -> new MoonshadowWoodBlock());
	public static final RegistryObject<Block> MOONSHADOW_LOG = REGISTRY.register("moonshadow_log", () -> new MoonshadowLogBlock());
	public static final RegistryObject<Block> MOONSHADOW_PLANKS = REGISTRY.register("moonshadow_planks", () -> new MoonshadowPlanksBlock());
	public static final RegistryObject<Block> MOONSHADOW_LEAVES = REGISTRY.register("moonshadow_leaves", () -> new MoonshadowLeavesBlock());
	public static final RegistryObject<Block> MOONSHADOW_STAIRS = REGISTRY.register("moonshadow_stairs", () -> new MoonshadowStairsBlock());
	public static final RegistryObject<Block> MOONSHADOW_SLAB = REGISTRY.register("moonshadow_slab", () -> new MoonshadowSlabBlock());
	public static final RegistryObject<Block> MOONSHADOW_FENCE = REGISTRY.register("moonshadow_fence", () -> new MoonshadowFenceBlock());
	public static final RegistryObject<Block> MOONSHADOW_FENCE_GATE = REGISTRY.register("moonshadow_fence_gate", () -> new MoonshadowFenceGateBlock());
	public static final RegistryObject<Block> MOONSHADOW_PRESSURE_PLATE = REGISTRY.register("moonshadow_pressure_plate", () -> new MoonshadowPressurePlateBlock());
	public static final RegistryObject<Block> MOONSHADOW_BUTTON = REGISTRY.register("moonshadow_button", () -> new MoonshadowButtonBlock());
	public static final RegistryObject<Block> ROYAL_STEEL_ORE = REGISTRY.register("royal_steel_ore", () -> new Royal_SteelOreBlock());
	public static final RegistryObject<Block> ROYAL_STEEL_BLOCK = REGISTRY.register("royal_steel_block", () -> new Royal_SteelBlockBlock());
	public static final RegistryObject<Block> CHAOS_HEART_BLOCK = REGISTRY.register("chaos_heart_block", () -> new ChaosHeartBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			DirtAppleBlockBlock.blockColorLoad(event);
			WeirdGrassBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			DirtAppleBlockBlock.itemColorLoad(event);
			WeirdGrassBlock.itemColorLoad(event);
		}
	}
}
