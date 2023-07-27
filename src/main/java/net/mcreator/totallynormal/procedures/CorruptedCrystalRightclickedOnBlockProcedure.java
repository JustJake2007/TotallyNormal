package net.mcreator.totallynormal.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.totallynormal.init.TotallynormalModEntities;
import net.mcreator.totallynormal.init.TotallynormalModBlocks;
import net.mcreator.totallynormal.entity.CrystalKnightEntity;

public class CorruptedCrystalRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (TotallynormalModBlocks.CHAOS_HEART_BLOCK.get() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CrystalKnightEntity(TotallynormalModEntities.CRYSTAL_KNIGHT.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			world.destroyBlock(new BlockPos(x, y, z), false);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Must be used on a chaos heart block! But be warned!"), false);
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("totallynormal:chaos_heart_block_r")});
		}
	}
}
