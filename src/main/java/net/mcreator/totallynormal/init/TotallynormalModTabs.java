
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TotallynormalModTabs {
	public static CreativeModeTab TAB_DIRT_TAB;
	public static CreativeModeTab TAB_APPLES_TAB;
	public static CreativeModeTab TAB_EMERALD_TOOL_TAB;
	public static CreativeModeTab TAB_TOTALLY_NORMAL_TAB;
	public static CreativeModeTab TAB_WASTELANDS_TAB;
	public static CreativeModeTab TAB_ECONOMY;
	public static CreativeModeTab TAB_RUBY_TAB;
	public static CreativeModeTab TAB_RECIPE_SCROLLS;
	public static CreativeModeTab TAB_CHAOS_TAB;

	public static void load() {
		TAB_DIRT_TAB = new CreativeModeTab("tabdirt_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIRT);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_APPLES_TAB = new CreativeModeTab("tabapples_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.GOLDEN_APPLE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_EMERALD_TOOL_TAB = new CreativeModeTab("tabemerald_tool_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.EMERALD_GEM_SWORD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOTALLY_NORMAL_TAB = new CreativeModeTab("tabtotally_normal_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.GOD_SWORD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_WASTELANDS_TAB = new CreativeModeTab("tabwastelands_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.DUST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ECONOMY = new CreativeModeTab("tabeconomy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.COIN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RUBY_TAB = new CreativeModeTab("tabruby_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.RUBY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RECIPE_SCROLLS = new CreativeModeTab("tabrecipe_scrolls") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.BLANK_SCROLL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_CHAOS_TAB = new CreativeModeTab("tabchaos_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TotallynormalModItems.CHAOS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
