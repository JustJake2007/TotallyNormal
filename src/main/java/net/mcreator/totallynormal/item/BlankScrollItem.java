
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class BlankScrollItem extends Item {
	public BlankScrollItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_RECIPE_SCROLLS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
