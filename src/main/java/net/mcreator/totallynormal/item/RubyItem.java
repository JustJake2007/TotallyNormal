
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_RUBY_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
