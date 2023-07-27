
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

import net.mcreator.totallynormal.entity.TechnobladeEntityProjectile;
import net.mcreator.totallynormal.entity.TechnobladeEntity;
import net.mcreator.totallynormal.entity.SorcerorEntityProjectile;
import net.mcreator.totallynormal.entity.SorcerorEntity;
import net.mcreator.totallynormal.entity.LivingDirtBlockEntity;
import net.mcreator.totallynormal.entity.KnightEntity;
import net.mcreator.totallynormal.entity.HimEntity;
import net.mcreator.totallynormal.entity.EmeraldPigEntity;
import net.mcreator.totallynormal.entity.DirtCowEntity;
import net.mcreator.totallynormal.entity.CrystalKnightEntity;
import net.mcreator.totallynormal.TotallynormalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TotallynormalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TotallynormalMod.MODID);
	public static final RegistryObject<EntityType<DirtCowEntity>> DIRT_COW = register("dirt_cow",
			EntityType.Builder.<DirtCowEntity>of(DirtCowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DirtCowEntity::new).fireImmune().sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<LivingDirtBlockEntity>> LIVING_DIRT_BLOCK = register("living_dirt_block", EntityType.Builder.<LivingDirtBlockEntity>of(LivingDirtBlockEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(40).setUpdateInterval(3).setCustomClientFactory(LivingDirtBlockEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HimEntity>> HIM = register("him",
			EntityType.Builder.<HimEntity>of(HimEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HimEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EmeraldPigEntity>> EMERALD_PIG = register("emerald_pig",
			EntityType.Builder.<EmeraldPigEntity>of(EmeraldPigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EmeraldPigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<TechnobladeEntity>> TECHNOBLADE = register("technoblade", EntityType.Builder.<TechnobladeEntity>of(TechnobladeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TechnobladeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TechnobladeEntityProjectile>> TECHNOBLADE_PROJECTILE = register("projectile_technoblade", EntityType.Builder.<TechnobladeEntityProjectile>of(TechnobladeEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(TechnobladeEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrystalKnightEntity>> CRYSTAL_KNIGHT = register("crystal_knight",
			EntityType.Builder.<CrystalKnightEntity>of(CrystalKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(CrystalKnightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KnightEntity>> KNIGHT = register("knight",
			EntityType.Builder.<KnightEntity>of(KnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KnightEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SorcerorEntity>> SORCEROR = register("sorceror",
			EntityType.Builder.<SorcerorEntity>of(SorcerorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SorcerorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SorcerorEntityProjectile>> SORCEROR_PROJECTILE = register("projectile_sorceror", EntityType.Builder.<SorcerorEntityProjectile>of(SorcerorEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(SorcerorEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DirtCowEntity.init();
			LivingDirtBlockEntity.init();
			HimEntity.init();
			EmeraldPigEntity.init();
			TechnobladeEntity.init();
			CrystalKnightEntity.init();
			KnightEntity.init();
			SorcerorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DIRT_COW.get(), DirtCowEntity.createAttributes().build());
		event.put(LIVING_DIRT_BLOCK.get(), LivingDirtBlockEntity.createAttributes().build());
		event.put(HIM.get(), HimEntity.createAttributes().build());
		event.put(EMERALD_PIG.get(), EmeraldPigEntity.createAttributes().build());
		event.put(TECHNOBLADE.get(), TechnobladeEntity.createAttributes().build());
		event.put(CRYSTAL_KNIGHT.get(), CrystalKnightEntity.createAttributes().build());
		event.put(KNIGHT.get(), KnightEntity.createAttributes().build());
		event.put(SORCEROR.get(), SorcerorEntity.createAttributes().build());
	}
}
