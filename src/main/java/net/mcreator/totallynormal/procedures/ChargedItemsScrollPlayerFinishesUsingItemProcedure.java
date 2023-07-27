package net.mcreator.totallynormal.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

public class ChargedItemsScrollPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("totallynormal:charged_emerald_r")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("totallynormal:charged_coal_r")});
	}
}
