
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class Dirt_OreIngotItem extends Item {
	public Dirt_OreIngotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
