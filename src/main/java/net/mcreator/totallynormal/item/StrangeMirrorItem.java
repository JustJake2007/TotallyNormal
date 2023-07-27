
package net.mcreator.totallynormal.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.totallynormal.procedures.StrangeMirrorPlayerFinishesUsingItemProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;
import net.mcreator.totallynormal.init.TotallynormalModItems;

public class StrangeMirrorItem extends Item {
	public StrangeMirrorItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(TotallynormalModItems.STRANGE_MIRROR.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		StrangeMirrorPlayerFinishesUsingItemProcedure.execute(world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
