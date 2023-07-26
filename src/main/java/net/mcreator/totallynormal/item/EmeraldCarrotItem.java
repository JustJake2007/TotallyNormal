
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class EmeraldCarrotItem extends Item {
	public EmeraldCarrotItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.4f)

				.build()));
	}
}
