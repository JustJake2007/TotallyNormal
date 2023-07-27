
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.totallynormal.world.features.ores.RubyOreFeature;
import net.mcreator.totallynormal.world.features.ores.Royal_SteelOreFeature;
import net.mcreator.totallynormal.world.features.ores.RadiumOreFeature;
import net.mcreator.totallynormal.world.features.ores.Dirt_OreOreFeature;
import net.mcreator.totallynormal.world.features.ores.ChaosOreFeature;
import net.mcreator.totallynormal.world.features.Test1Feature;
import net.mcreator.totallynormal.world.features.MudFeatureFeature;
import net.mcreator.totallynormal.TotallynormalMod;

@Mod.EventBusSubscriber
public class TotallynormalModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TotallynormalMod.MODID);
	public static final RegistryObject<Feature<?>> DIRT_ORE_ORE = REGISTRY.register("dirt_ore_ore", Dirt_OreOreFeature::feature);
	public static final RegistryObject<Feature<?>> RADIUM_ORE = REGISTRY.register("radium_ore", RadiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> MUD_FEATURE = REGISTRY.register("mud_feature", MudFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
	public static final RegistryObject<Feature<?>> CHAOS_ORE = REGISTRY.register("chaos_ore", ChaosOreFeature::feature);
	public static final RegistryObject<Feature<?>> ROYAL_STEEL_ORE = REGISTRY.register("royal_steel_ore", Royal_SteelOreFeature::feature);
	public static final RegistryObject<Feature<?>> LIMBO_TEMPLE = REGISTRY.register("limbo_temple", Test1Feature::feature);
}
