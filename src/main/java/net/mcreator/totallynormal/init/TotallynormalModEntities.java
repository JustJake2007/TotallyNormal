
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.totallynormal.entity.LivingDirtBlockEntity;
import net.mcreator.totallynormal.entity.DirtCowEntity;
import net.mcreator.totallynormal.TotallynormalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TotallynormalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TotallynormalMod.MODID);
	public static final RegistryObject<EntityType<LivingDirtBlockEntity>> LIVING_DIRT_BLOCK = register("living_dirt_block",
			EntityType.Builder.<LivingDirtBlockEntity>of(LivingDirtBlockEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LivingDirtBlockEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DirtCowEntity>> DIRT_COW = register("dirt_cow",
			EntityType.Builder.<DirtCowEntity>of(DirtCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DirtCowEntity::new).fireImmune().sized(0.9f, 1.4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LivingDirtBlockEntity.init();
			DirtCowEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LIVING_DIRT_BLOCK.get(), LivingDirtBlockEntity.createAttributes().build());
		event.put(DIRT_COW.get(), DirtCowEntity.createAttributes().build());
	}
}
