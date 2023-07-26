
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class Dirt_OreIngotItem extends Item {
	public Dirt_OreIngotItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_DIRT_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
