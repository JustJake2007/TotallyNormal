
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.totallynormal.init.TotallynormalModFluids;

public class MudItem extends BucketItem {
	public MudItem() {
		super(TotallynormalModFluids.MUD,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(CreativeModeTab.TAB_MISC));
	}
}
