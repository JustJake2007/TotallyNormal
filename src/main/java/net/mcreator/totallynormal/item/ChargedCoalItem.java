
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class ChargedCoalItem extends Item {
	public ChargedCoalItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
