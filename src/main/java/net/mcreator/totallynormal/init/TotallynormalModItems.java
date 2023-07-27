
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
import net.mcreator.totallynormal.item.WastelandItem;
import net.mcreator.totallynormal.item.StrangeMirrorItem;
import net.mcreator.totallynormal.item.RubyTSwordItem;
import net.mcreator.totallynormal.item.RubyTShovelItem;
import net.mcreator.totallynormal.item.RubyTPickaxeItem;
import net.mcreator.totallynormal.item.RubyTHoeItem;
import net.mcreator.totallynormal.item.RubyTAxeItem;
import net.mcreator.totallynormal.item.RubyItem;
import net.mcreator.totallynormal.item.RubyBattleAxeScrollItem;
import net.mcreator.totallynormal.item.RubyBattleAxeNerfedItem;
import net.mcreator.totallynormal.item.RubyBattleAxeItem;
import net.mcreator.totallynormal.item.Royal_SteelIngotItem;
import net.mcreator.totallynormal.item.RoyalSwordItem;
import net.mcreator.totallynormal.item.RadiumDustItem;
import net.mcreator.totallynormal.item.PocketWatchScrollItem;
import net.mcreator.totallynormal.item.PocketWatchItem;
import net.mcreator.totallynormal.item.OldRockItem;
import net.mcreator.totallynormal.item.NetheriteAppleItem;
import net.mcreator.totallynormal.item.MudItem;
import net.mcreator.totallynormal.item.LimboTPItemItem;
import net.mcreator.totallynormal.item.LapisAppleItem;
import net.mcreator.totallynormal.item.IronAppleItem;
import net.mcreator.totallynormal.item.GodSwordItem;
import net.mcreator.totallynormal.item.Emerald_GemSwordItem;
import net.mcreator.totallynormal.item.Emerald_GemShovelItem;
import net.mcreator.totallynormal.item.Emerald_GemPickaxeItem;
import net.mcreator.totallynormal.item.Emerald_GemHoeItem;
import net.mcreator.totallynormal.item.Emerald_GemAxeItem;
import net.mcreator.totallynormal.item.Emerald_GemArmorItem;
import net.mcreator.totallynormal.item.EmeraldStaffScrollItem;
import net.mcreator.totallynormal.item.EmeraldStaffItem;
import net.mcreator.totallynormal.item.EmeraldIngotItem;
import net.mcreator.totallynormal.item.EmeraldFragmentItem;
import net.mcreator.totallynormal.item.EmeraldCarrotItem;
import net.mcreator.totallynormal.item.DustItem;
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
import net.mcreator.totallynormal.item.DaggerItem;
import net.mcreator.totallynormal.item.CorruptedCrystalItem;
import net.mcreator.totallynormal.item.CorruptedCrystalFragmentItem;
import net.mcreator.totallynormal.item.CoinItem;
import net.mcreator.totallynormal.item.ChargedItemsScrollItem;
import net.mcreator.totallynormal.item.ChargedEmeraldItem;
import net.mcreator.totallynormal.item.ChargedCoalItem;
import net.mcreator.totallynormal.item.ChaosItem;
import net.mcreator.totallynormal.item.ChaosHeartScrollItem;
import net.mcreator.totallynormal.item.ChaosHeartItem;
import net.mcreator.totallynormal.item.BlankScrollItem;
import net.mcreator.totallynormal.item.AppleSwordScrollItem;
import net.mcreator.totallynormal.item.AppleSwordItem;
import net.mcreator.totallynormal.TotallynormalMod;

public class TotallynormalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TotallynormalMod.MODID);
	public static final RegistryObject<Item> DIRT = REGISTRY.register("dirt", () -> new DirtItem());
	public static final RegistryObject<Item> DIRT_APPLE = REGISTRY.register("dirt_apple", () -> new DirtAppleItem());
	public static final RegistryObject<Item> DIRT_APPLE_BLOCK = block(TotallynormalModBlocks.DIRT_APPLE_BLOCK, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> MUD_BUCKET = REGISTRY.register("mud_bucket", () -> new MudItem());
	public static final RegistryObject<Item> DIRT_ORE_ORE = block(TotallynormalModBlocks.DIRT_ORE_ORE, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> DIRT_ORE_INGOT = REGISTRY.register("dirt_ore_ingot", () -> new Dirt_OreIngotItem());
	public static final RegistryObject<Item> DIRT_ORE_BLOCK = block(TotallynormalModBlocks.DIRT_ORE_BLOCK, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> DIRT_ORE_SWORD = REGISTRY.register("dirt_ore_sword", () -> new Dirt_OreSwordItem());
	public static final RegistryObject<Item> DIRT_ORE_PICKAXE = REGISTRY.register("dirt_ore_pickaxe", () -> new Dirt_OrePickaxeItem());
	public static final RegistryObject<Item> DIRT_ORE_AXE = REGISTRY.register("dirt_ore_axe", () -> new Dirt_OreAxeItem());
	public static final RegistryObject<Item> DIRT_ORE_SHOVEL = REGISTRY.register("dirt_ore_shovel", () -> new Dirt_OreShovelItem());
	public static final RegistryObject<Item> DIRT_ORE_HOE = REGISTRY.register("dirt_ore_hoe", () -> new Dirt_OreHoeItem());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_HELMET = REGISTRY.register("dirt_ore_armor_helmet", () -> new Dirt_OreArmorItem.Helmet());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_CHESTPLATE = REGISTRY.register("dirt_ore_armor_chestplate", () -> new Dirt_OreArmorItem.Chestplate());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_LEGGINGS = REGISTRY.register("dirt_ore_armor_leggings", () -> new Dirt_OreArmorItem.Leggings());
	public static final RegistryObject<Item> DIRT_ORE_ARMOR_BOOTS = REGISTRY.register("dirt_ore_armor_boots", () -> new Dirt_OreArmorItem.Boots());
	public static final RegistryObject<Item> DIRT_COW_SPAWN_EGG = REGISTRY.register("dirt_cow_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.DIRT_COW, -13363445, -10329502, new Item.Properties().tab(TotallynormalModTabs.TAB_DIRT_TAB)));
	public static final RegistryObject<Item> LIVING_DIRT_BLOCK_SPAWN_EGG = REGISTRY.register("living_dirt_block_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.LIVING_DIRT_BLOCK, -11718636, -13559293, new Item.Properties().tab(TotallynormalModTabs.TAB_DIRT_TAB)));
	public static final RegistryObject<Item> IRON_APPLE = REGISTRY.register("iron_apple", () -> new IronAppleItem());
	public static final RegistryObject<Item> DIAMOND_APPLE = REGISTRY.register("diamond_apple", () -> new DiamondAppleItem());
	public static final RegistryObject<Item> NETHERITE_APPLE = REGISTRY.register("netherite_apple", () -> new NetheriteAppleItem());
	public static final RegistryObject<Item> LAPIS_APPLE = REGISTRY.register("lapis_apple", () -> new LapisAppleItem());
	public static final RegistryObject<Item> WHEN_YOU_DONT_HAVE_ENOUGH_GOLD_AND_YOU_USE_SOME_LAPIS_INSTEAD_APPLE = REGISTRY.register("when_you_dont_have_enough_gold_and_you_use_some_lapis_instead_apple",
			() -> new WhenYouDontHaveEnoughGoldAndYouUseSomeLapisInsteadAppleItem());
	public static final RegistryObject<Item> APPLE_SWORD = REGISTRY.register("apple_sword", () -> new AppleSwordItem());
	public static final RegistryObject<Item> EMERALD_GEM_SWORD = REGISTRY.register("emerald_gem_sword", () -> new Emerald_GemSwordItem());
	public static final RegistryObject<Item> EMERALD_GEM_PICKAXE = REGISTRY.register("emerald_gem_pickaxe", () -> new Emerald_GemPickaxeItem());
	public static final RegistryObject<Item> EMERALD_GEM_AXE = REGISTRY.register("emerald_gem_axe", () -> new Emerald_GemAxeItem());
	public static final RegistryObject<Item> EMERALD_GEM_SHOVEL = REGISTRY.register("emerald_gem_shovel", () -> new Emerald_GemShovelItem());
	public static final RegistryObject<Item> EMERALD_GEM_HOE = REGISTRY.register("emerald_gem_hoe", () -> new Emerald_GemHoeItem());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_HELMET = REGISTRY.register("emerald_gem_armor_helmet", () -> new Emerald_GemArmorItem.Helmet());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_CHESTPLATE = REGISTRY.register("emerald_gem_armor_chestplate", () -> new Emerald_GemArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_LEGGINGS = REGISTRY.register("emerald_gem_armor_leggings", () -> new Emerald_GemArmorItem.Leggings());
	public static final RegistryObject<Item> EMERALD_GEM_ARMOR_BOOTS = REGISTRY.register("emerald_gem_armor_boots", () -> new Emerald_GemArmorItem.Boots());
	public static final RegistryObject<Item> GOD_SWORD = REGISTRY.register("god_sword", () -> new GodSwordItem());
	public static final RegistryObject<Item> DUST = REGISTRY.register("dust", () -> new DustItem());
	public static final RegistryObject<Item> ASH = block(TotallynormalModBlocks.ASH, TotallynormalModTabs.TAB_WASTELANDS_TAB);
	public static final RegistryObject<Item> HIM_SPAWN_EGG = REGISTRY.register("him_spawn_egg", () -> new ForgeSpawnEggItem(TotallynormalModEntities.HIM, -16777216, -9079435, new Item.Properties().tab(TotallynormalModTabs.TAB_WASTELANDS_TAB)));
	public static final RegistryObject<Item> WASTELAND = REGISTRY.register("wasteland", () -> new WastelandItem());
	public static final RegistryObject<Item> RADIUM_DUST = REGISTRY.register("radium_dust", () -> new RadiumDustItem());
	public static final RegistryObject<Item> RADIUM_ORE = block(TotallynormalModBlocks.RADIUM_ORE, TotallynormalModTabs.TAB_WASTELANDS_TAB);
	public static final RegistryObject<Item> RADIUM_BLOCK = block(TotallynormalModBlocks.RADIUM_BLOCK, TotallynormalModTabs.TAB_WASTELANDS_TAB);
	public static final RegistryObject<Item> OLD_ROCK = REGISTRY.register("old_rock", () -> new OldRockItem());
	public static final RegistryObject<Item> EMERALD_INGOT = REGISTRY.register("emerald_ingot", () -> new EmeraldIngotItem());
	public static final RegistryObject<Item> EMERALD_FRAGMENT = REGISTRY.register("emerald_fragment", () -> new EmeraldFragmentItem());
	public static final RegistryObject<Item> EMERALD_PIG_SPAWN_EGG = REGISTRY.register("emerald_pig_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.EMERALD_PIG, -7471313, -15118080, new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB)));
	public static final RegistryObject<Item> EMERALD_CARROT = REGISTRY.register("emerald_carrot", () -> new EmeraldCarrotItem());
	public static final RegistryObject<Item> TECHNOBLADE_SPAWN_EGG = REGISTRY.register("technoblade_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.TECHNOBLADE, -1048410, -2883584, new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB)));
	public static final RegistryObject<Item> COIN = REGISTRY.register("coin", () -> new CoinItem());
	public static final RegistryObject<Item> RUBY_ORE = block(TotallynormalModBlocks.RUBY_ORE, TotallynormalModTabs.TAB_RUBY_TAB);
	public static final RegistryObject<Item> RUBY_BLOCK = block(TotallynormalModBlocks.RUBY_BLOCK, TotallynormalModTabs.TAB_RUBY_TAB);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_T_PICKAXE = REGISTRY.register("ruby_t_pickaxe", () -> new RubyTPickaxeItem());
	public static final RegistryObject<Item> RUBY_T_AXE = REGISTRY.register("ruby_t_axe", () -> new RubyTAxeItem());
	public static final RegistryObject<Item> RUBY_T_SWORD = REGISTRY.register("ruby_t_sword", () -> new RubyTSwordItem());
	public static final RegistryObject<Item> RUBY_T_SHOVEL = REGISTRY.register("ruby_t_shovel", () -> new RubyTShovelItem());
	public static final RegistryObject<Item> RUBY_T_HOE = REGISTRY.register("ruby_t_hoe", () -> new RubyTHoeItem());
	public static final RegistryObject<Item> RUBY_BATTLE_AXE = REGISTRY.register("ruby_battle_axe", () -> new RubyBattleAxeItem());
	public static final RegistryObject<Item> EMERALD_STAFF = REGISTRY.register("emerald_staff", () -> new EmeraldStaffItem());
	public static final RegistryObject<Item> BLANK_SCROLL = REGISTRY.register("blank_scroll", () -> new BlankScrollItem());
	public static final RegistryObject<Item> APPLE_SWORD_SCROLL = REGISTRY.register("apple_sword_scroll", () -> new AppleSwordScrollItem());
	public static final RegistryObject<Item> RUBY_BATTLE_AXE_SCROLL = REGISTRY.register("ruby_battle_axe_scroll", () -> new RubyBattleAxeScrollItem());
	public static final RegistryObject<Item> POCKET_WATCH = REGISTRY.register("pocket_watch", () -> new PocketWatchItem());
	public static final RegistryObject<Item> POCKET_WATCH_SCROLL = REGISTRY.register("pocket_watch_scroll", () -> new PocketWatchScrollItem());
	public static final RegistryObject<Item> CHAOS_ORE = block(TotallynormalModBlocks.CHAOS_ORE, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> CHAOS_BLOCK = block(TotallynormalModBlocks.CHAOS_BLOCK, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> CHAOS = REGISTRY.register("chaos", () -> new ChaosItem());
	public static final RegistryObject<Item> CHARGED_EMERALD = REGISTRY.register("charged_emerald", () -> new ChargedEmeraldItem());
	public static final RegistryObject<Item> EMERALD_STAFF_SCROLL = REGISTRY.register("emerald_staff_scroll", () -> new EmeraldStaffScrollItem());
	public static final RegistryObject<Item> CHARGED_COAL = REGISTRY.register("charged_coal", () -> new ChargedCoalItem());
	public static final RegistryObject<Item> CHAOS_HEART = REGISTRY.register("chaos_heart", () -> new ChaosHeartItem());
	public static final RegistryObject<Item> CHAOS_HEART_SCROLL = REGISTRY.register("chaos_heart_scroll", () -> new ChaosHeartScrollItem());
	public static final RegistryObject<Item> WEIRD_GRASS = block(TotallynormalModBlocks.WEIRD_GRASS, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> LUMINARA = block(TotallynormalModBlocks.LUMINARA, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> MOONSHADOW_WOOD = block(TotallynormalModBlocks.MOONSHADOW_WOOD, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> MOONSHADOW_LOG = block(TotallynormalModBlocks.MOONSHADOW_LOG, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> MOONSHADOW_PLANKS = block(TotallynormalModBlocks.MOONSHADOW_PLANKS, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> MOONSHADOW_LEAVES = block(TotallynormalModBlocks.MOONSHADOW_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOONSHADOW_STAIRS = block(TotallynormalModBlocks.MOONSHADOW_STAIRS, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> MOONSHADOW_SLAB = block(TotallynormalModBlocks.MOONSHADOW_SLAB, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> MOONSHADOW_FENCE = block(TotallynormalModBlocks.MOONSHADOW_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOONSHADOW_FENCE_GATE = block(TotallynormalModBlocks.MOONSHADOW_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MOONSHADOW_PRESSURE_PLATE = block(TotallynormalModBlocks.MOONSHADOW_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MOONSHADOW_BUTTON = block(TotallynormalModBlocks.MOONSHADOW_BUTTON, TotallynormalModTabs.TAB_DIRT_TAB);
	public static final RegistryObject<Item> DAGGER = REGISTRY.register("dagger", () -> new DaggerItem());
	public static final RegistryObject<Item> CRYSTAL_KNIGHT_SPAWN_EGG = REGISTRY.register("crystal_knight_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.CRYSTAL_KNIGHT, -13421569, -16764058, new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB)));
	public static final RegistryObject<Item> LIMBO_TP_ITEM = REGISTRY.register("limbo_tp_item", () -> new LimboTPItemItem());
	public static final RegistryObject<Item> RUBY_BATTLE_AXE_NERFED = REGISTRY.register("ruby_battle_axe_nerfed", () -> new RubyBattleAxeNerfedItem());
	public static final RegistryObject<Item> ROYAL_STEEL_ORE = block(TotallynormalModBlocks.ROYAL_STEEL_ORE, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> ROYAL_STEEL_BLOCK = block(TotallynormalModBlocks.ROYAL_STEEL_BLOCK, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> ROYAL_STEEL_INGOT = REGISTRY.register("royal_steel_ingot", () -> new Royal_SteelIngotItem());
	public static final RegistryObject<Item> ROYAL_SWORD = REGISTRY.register("royal_sword", () -> new RoyalSwordItem());
	public static final RegistryObject<Item> CORRUPTED_CRYSTAL = REGISTRY.register("corrupted_crystal", () -> new CorruptedCrystalItem());
	public static final RegistryObject<Item> KNIGHT_SPAWN_EGG = REGISTRY.register("knight_spawn_egg", () -> new ForgeSpawnEggItem(TotallynormalModEntities.KNIGHT, -8684677, -1, new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB)));
	public static final RegistryObject<Item> CHAOS_HEART_BLOCK = block(TotallynormalModBlocks.CHAOS_HEART_BLOCK, TotallynormalModTabs.TAB_CHAOS_TAB);
	public static final RegistryObject<Item> CORRUPTED_CRYSTAL_FRAGMENT = REGISTRY.register("corrupted_crystal_fragment", () -> new CorruptedCrystalFragmentItem());
	public static final RegistryObject<Item> SORCEROR_SPAWN_EGG = REGISTRY.register("sorceror_spawn_egg",
			() -> new ForgeSpawnEggItem(TotallynormalModEntities.SORCEROR, -4375365, -12048741, new Item.Properties().tab(TotallynormalModTabs.TAB_TOTALLY_NORMAL_TAB)));
	public static final RegistryObject<Item> CHARGED_ITEMS_SCROLL = REGISTRY.register("charged_items_scroll", () -> new ChargedItemsScrollItem());
	public static final RegistryObject<Item> STRANGE_MIRROR = REGISTRY.register("strange_mirror", () -> new StrangeMirrorItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
