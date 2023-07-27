
package net.mcreator.totallynormal.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.totallynormal.procedures.LimboTPItemPlayerFinishesUsingItemProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class LimboTPItemItem extends Item {
	public LimboTPItemItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LimboTPItemPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
