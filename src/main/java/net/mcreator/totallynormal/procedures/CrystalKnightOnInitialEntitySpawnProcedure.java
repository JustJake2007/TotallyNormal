package net.mcreator.totallynormal.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import java.util.Comparator;

public class CrystalKnightOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("The Crystal Knight Has Spawned!"), false);
		if (((Entity) world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 4, 4, 4), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)) instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("You dare summon me? You will pay for this mortal!"), false);
	}
}
