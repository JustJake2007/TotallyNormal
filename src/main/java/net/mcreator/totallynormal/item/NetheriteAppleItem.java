
package net.mcreator.totallynormal.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.totallynormal.procedures.NetheriteApplePlayerFinishesUsingItemProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class NetheriteAppleItem extends Item {
	public NetheriteAppleItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_APPLES_TAB).stacksTo(64).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(10).saturationMod(2f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NetheriteApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
