
package net.mcreator.totallynormal.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.totallynormal.init.TotallynormalModBlocks;

import java.util.Set;
import java.util.List;

public class Dirt_OreOreFeature extends OreFeature {
	public static Dirt_OreOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new Dirt_OreOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("totallynormal:dirt_ore_ore", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), TotallynormalModBlocks.DIRT_ORE_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), TotallynormalModBlocks.DIRT_ORE_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), TotallynormalModBlocks.DIRT_ORE_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ANDESITE.defaultBlockState()), TotallynormalModBlocks.DIRT_ORE_ORE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIRT.defaultBlockState()), TotallynormalModBlocks.DIRT_ORE_ORE.get().defaultBlockState())), 4));
		PLACED_FEATURE = PlacementUtils.register("totallynormal:dirt_ore_ore", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(30), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(86)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("totallynormal:dirt")));

	public Dirt_OreOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
