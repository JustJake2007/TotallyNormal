
package net.mcreator.totallynormal.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.totallynormal.init.TotallynormalModItems;
import net.mcreator.totallynormal.init.TotallynormalModFluids;
import net.mcreator.totallynormal.init.TotallynormalModFluidTypes;
import net.mcreator.totallynormal.init.TotallynormalModBlocks;

public abstract class MudFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TotallynormalModFluidTypes.MUD_TYPE.get(),
			() -> TotallynormalModFluids.MUD.get(), () -> TotallynormalModFluids.FLOWING_MUD.get()).explosionResistance(100f).tickRate(10)
			.bucket(() -> TotallynormalModItems.MUD_BUCKET.get()).block(() -> (LiquidBlock) TotallynormalModBlocks.MUD.get());

	private MudFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends MudFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MudFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
