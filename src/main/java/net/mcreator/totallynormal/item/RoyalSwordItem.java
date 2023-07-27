
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.totallynormal.procedures.RoyalSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;
import net.mcreator.totallynormal.init.TotallynormalModItems;

public class RoyalSwordItem extends SwordItem {
	public RoyalSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TotallynormalModItems.ROYAL_STEEL_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RoyalSwordLivingEntityIsHitWithToolProcedure.execute(sourceentity);
		return retval;
	}
}
