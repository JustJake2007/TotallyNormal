
package net.mcreator.totallynormal.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.totallynormal.init.TotallynormalModTabs;
import net.mcreator.totallynormal.init.TotallynormalModItems;

public class RubyBattleAxeNerfedItem extends AxeItem {
	public RubyBattleAxeNerfedItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TotallynormalModItems.RUBY.get()));
			}
		}, 1, -3f, new Item.Properties().tab(TotallynormalModTabs.TAB_RUBY_TAB));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
