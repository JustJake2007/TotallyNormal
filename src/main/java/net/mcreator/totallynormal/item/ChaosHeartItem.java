
package net.mcreator.totallynormal.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.totallynormal.procedures.ChaosHeartItemInInventoryTickProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class ChaosHeartItem extends Item {
	public ChaosHeartItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ChaosHeartItemInInventoryTickProcedure.execute(entity);
	}
}
