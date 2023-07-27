package net.mcreator.totallynormal.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

import java.util.Comparator;

public class CrystalKnightPlayerCollidesWithThisEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (1 == Mth.nextDouble(RandomSource.create(), 1, 5)) {
			if (((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 5, false, false));
		} else if (1 == Mth.nextDouble(RandomSource.create(), 1, 5)) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20, 5, false, true));
		}
	}
}
