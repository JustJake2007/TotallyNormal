
package net.mcreator.totallynormal.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.totallynormal.init.TotallynormalModFluids;

public class MudBlock extends LiquidBlock {
	public MudBlock() {
		super(() -> TotallynormalModFluids.MUD.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
