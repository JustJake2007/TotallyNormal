
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class DustItem extends Item {
	public DustItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_WASTELANDS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
