
package net.mcreator.totallynormal.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.totallynormal.init.TotallynormalModItems;

import java.util.List;
import java.util.Collections;

public class AshBlock extends Block {
	public AshBlock() {
		super(BlockBehaviour.Properties.of(Material.DIRT)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.soul_soil.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.soul_sand.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.soul_sand.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.soul_sand.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.soul_soil.fall"))))
				.strength(0.65f, 6f).speedFactor(0.9f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TotallynormalModItems.DUST.get(), 4));
	}
}
