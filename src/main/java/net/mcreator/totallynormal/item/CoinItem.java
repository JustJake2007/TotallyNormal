
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class CoinItem extends Item {
	public CoinItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_ECONOMY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
