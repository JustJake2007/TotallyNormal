
package net.mcreator.totallynormal.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.totallynormal.procedures.RoyalSteelIngotItemInInventoryTickProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class Royal_SteelIngotItem extends Item {
	public Royal_SteelIngotItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		RoyalSteelIngotItemInInventoryTickProcedure.execute(entity);
	}
}
