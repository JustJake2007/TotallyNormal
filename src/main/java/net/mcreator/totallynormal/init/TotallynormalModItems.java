
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

import net.mcreator.totallynormal.item.WhenYouDontHaveEnoughGoldAndYouUseSomeLapisInsteadAppleItem;
import net.mcreator.totallynormal.item.NetheriteAppleItem;
import net.mcreator.totallynormal.item.MudItem;
import net.mcreator.totallynormal.item.LapisAppleItem;
import net.mcreator.totallynormal.item.IronAppleItem;
import net.mcreator.totallynormal.item.Emerald_GemSwordItem;
import net.mcreator.totallynormal.item.Emerald_GemShovelItem;
import net.mcreator.totallynormal.item.Emerald_GemPickaxeItem;
import net.mcreator.totallynormal.item.Emerald_GemHoeItem;
import net.mcreator.totallynormal.item.Emerald_GemAxeItem;
import net.mcreator.totallynormal.item.Emerald_GemArmorItem;
import net.mcreator.totallynormal.item.Dirt_OreSwordItem;
import net.mcreator.totallynormal.item.Dirt_OreShovelItem;
import net.mcreator.totallynormal.item.Dirt_OrePickaxeItem;
import net.mcreator.totallynormal.item.Dirt_OreIngotItem;
import net.mcreator.totallynormal.item.Dirt_OreHoeItem;
import net.mcreator.totallynormal.item.Dirt_OreAxeItem;
import net.mcreator.totallynormal.item.Dirt_OreArmorItem;
import net.mcreator.totallynormal.item.DirtItem;
import net.mcreator.totallynormal.item.DirtAppleItem;
import net.mcreator.totallynormal.item.DiamondAppleItem;
import net.mcreator.totallynormal.item.AppleSwordItem;
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
	public static final RegistryObject<Item> DIRT_ORE_INGOT = REGISTRY.register("dirt_ore_ingot", () -> new Dirt_OreIngotItem());
	public static final RegistryObject<Item> DIRT_ORE_ORE = block(TotallynormalModBlocks.DIRT_ORE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DIRT_ORE_BLOCK = block(TotallynormalModBlocks.DIRT_ORE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DIRT_ORE_PICKAXE = REGISTRY.register("dirt_ore_pickaxe", () -> new Dirt_OrePickaxeItem());
	public static final RegistryObject<Item> DIRT_ORE_AXE = REGISTRY.register("dirt_ore_axe", () -> new Dirt_OreAxeItem());
	public static final RegistryObject<Item> DIRT_ORE_SWORD = REGISTRY.register("dirt_ore_sword", () -> new Dirt_OreSwordItem());
	public static final RegistryObject<Item> DIRT_ORE_SHOVEL = REGISTRY.register("dirt_ore_shovel", () -> new Dirt_OreShovelItem());
	public static final RegistryObject<Item> DIRT_ORE_HOE = REGISTRY.register("dirt_ore_hoe", () -> new Dirt_OreHoeItem());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_HELMET = REGISTRY.register("dirt_ore_armor_helmet", () -> new Dirt_OreArmorItem.Helmet());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_CHESTPLATE = REGISTRY.register("dirt_ore_armor_chestplate",
			() -> new Dirt_OreArmorItem.Chestplate());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_LEGGINGS = REGISTRY.register("dirt_ore_armor_leggings",
			() -> new Dirt_OreArmorItem.Leggings());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_BOOTS = REGISTRY.register("dirt_ore_armor_boots", () -> new Dirt_OreArmorItem.Boots());
	public static final RegistryObject<Item> DIRT_COW = REGISTRY.register("dirt_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.DIRT_COW, -13363445, -10329502,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> IRON_APPLE = REGISTRY.register("iron_apple", () -> new IronAppleItem());
	public static final RegistryObject<Item> DIAMOND_APPLE = REGISTRY.register("diamond_apple", () -> new DiamondAppleItem());
	public static final RegistryObject<Item> NETHERITE_APPLE = REGISTRY.register("netherite_apple", () -> new NetheriteAppleItem());
	public static final RegistryObject<Item> LAPIS_APPLE = REGISTRY.register("lapis_apple", () -> new LapisAppleItem());
	public static final RegistryObject<Item> WHEN_YOU_DONT_HAVE_ENOUGH_GOLD_AND_YOU_USE_SOME_LAPIS_INSTEAD_APPLE = REGISTRY.register(
			"when_you_dont_have_enough_gold_and_you_use_some_lapis_instead_apple",
			() -> new WhenYouDontHaveEnoughGoldAndYouUseSomeLapisInsteadAppleItem());
	public static final RegistryObject<Item> APPLE_SWORD = REGISTRY.register("apple_sword", () -> new AppleSwordItem());
	public static final RegistryObject<Item> EMERALD_GEM_PICKAXE = REGISTRY.register("emerald_gem_pickaxe", () -> new Emerald_GemPickaxeItem());
	public static final RegistryObject<Item> EMERALD_GEM_AXE = REGISTRY.register("emerald_gem_axe", () -> new Emerald_GemAxeItem());
	public static final RegistryObject<Item> EMERALD_GEM_SWORD = REGISTRY.register("emerald_gem_sword", () -> new Emerald_GemSwordItem());
	public static final RegistryObject<Item> EMERALD_GEM_SHOVEL = REGISTRY.register("emerald_gem_shovel", () -> new Emerald_GemShovelItem());
	public static final RegistryObject<Item> EMERALD_GEM_HOE = REGISTRY.register("emerald_gem_hoe", () -> new Emerald_GemHoeItem());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_HELMET = REGISTRY.register("emerald_gem_armor_helmet",
			() -> new Emerald_GemArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_CHESTPLATE = REGISTRY.register("emerald_gem_armor_chestplate",
			() -> new Emerald_GemArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_LEGGINGS = REGISTRY.register("emerald_gem_armor_leggings",
			() -> new Emerald_GemArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_BOOTS = REGISTRY.register("emerald_gem_armor_boots",
			() -> new Emerald_GemArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
