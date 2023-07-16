
package net.mcreator.totallynormal.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.totallynormal.init.TotallynormalModItems;

public abstract class Dirt_OreArmorItem extends ArmorItem {
	public Dirt_OreArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 11;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 4, 4, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 6;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.place"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TotallynormalModItems.DIRT_ORE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "dirt_ore_armor";
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

	public static class Helmet extends Dirt_OreArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/dirt_ore_layer_1.png";
		}
	}

	public static class Chestplate extends Dirt_OreArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/dirt_ore_layer_1.png";
		}
	}

	public static class Leggings extends Dirt_OreArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/dirt_ore_layer_2.png";
		}
	}

	public static class Boots extends Dirt_OreArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "totallynormal:textures/models/armor/dirt_ore_layer_1.png";
		}
	}
}
