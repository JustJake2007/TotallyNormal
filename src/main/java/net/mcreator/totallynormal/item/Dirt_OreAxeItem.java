
package net.mcreator.totallynormal.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.totallynormal.init.TotallynormalModTabs;
import net.mcreator.totallynormal.init.TotallynormalModItems;

public class Dirt_OreAxeItem extends AxeItem {
	public Dirt_OreAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 152;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TotallynormalModItems.DIRT_ORE_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(TotallynormalModTabs.TAB_DIRT_TAB));
	}
}
