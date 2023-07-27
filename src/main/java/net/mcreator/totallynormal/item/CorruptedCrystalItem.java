
package net.mcreator.totallynormal.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.totallynormal.procedures.CorruptedCrystalRightclickedOnBlockProcedure;
import net.mcreator.totallynormal.init.TotallynormalModTabs;

public class CorruptedCrystalItem extends Item {
	public CorruptedCrystalItem() {
		super(new Item.Properties().tab(TotallynormalModTabs.TAB_CHAOS_TAB).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CorruptedCrystalRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
