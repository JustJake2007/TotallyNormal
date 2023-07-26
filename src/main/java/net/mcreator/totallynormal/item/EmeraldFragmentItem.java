
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class EmeraldFragmentItem extends Item {
	public EmeraldFragmentItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
