
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
import net.mcreator.totallynormal.world.features.ores.RadiumOreFeature;
import net.mcreator.totallynormal.world.features.ores.Dirt_OreOreFeature;
import net.mcreator.totallynormal.world.features.MudFeatureFeature;
import net.mcreator.totallynormal.TotallynormalMod;

@Mod.EventBusSubscriber
public class TotallynormalModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TotallynormalMod.MODID);
	public static final RegistryObject<Feature<?>> DIRT_ORE_ORE = REGISTRY.register("dirt_ore_ore", Dirt_OreOreFeature::feature);
	public static final RegistryObject<Feature<?>> RADIUM_ORE = REGISTRY.register("radium_ore", RadiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> MUD_FEATURE = REGISTRY.register("mud_feature", MudFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
}
