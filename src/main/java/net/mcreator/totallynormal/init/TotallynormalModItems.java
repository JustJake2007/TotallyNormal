
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.totallynormal.item.MudItem;
import net.mcreator.totallynormal.item.DirtItem;
import net.mcreator.totallynormal.item.DirtAppleItem;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TotallynormalMod.MODID);
	public static final RegistryObject<Item> DIRT_APPLE = REGISTRY.register("dirt_apple", () -> new DirtAppleItem());
	public static final RegistryObject<Item> DIRT = REGISTRY.register("dirt", () -> new DirtItem());
	public static final RegistryObject<Item> DIRT_APPLE_BLOCK = block(TotallynormalModBlocks.DIRT_APPLE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LIVING_DIRT_BLOCK = REGISTRY.register("living_dirt_block_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.LIVING_DIRT_BLOCK, -11718636, -13559293,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MUD_BUCKET = REGISTRY.register("mud_bucket", () -> new MudItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
