
package net.mcreator.totallynormal.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.totallynormal.init.TotallynormalModTabs;

public abstract class Emerald_GemArmorItem extends ArmorItem {
	public Emerald_GemArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 7, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.EMERALD));
			}

			@Override
			public String getName() {
				return "emerald_gem_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Emerald_GemArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/emerald_gem_layer_1.png";
		}
	}

	public static class Chestplate extends Emerald_GemArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/emerald_gem_layer_1.png";
		}
	}

	public static class Leggings extends Emerald_GemArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/emerald_gem_layer_2.png";
		}
	}

	public static class Boots extends Emerald_GemArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TotallynormalModTabs.TAB_EMERALD_TOOL_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/emerald_gem_layer_1.png";
		}
	}
}
