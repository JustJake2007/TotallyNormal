
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.totallynormal.client.renderer.TechnobladeRenderer;
import net.mcreator.totallynormal.client.renderer.SorcerorRenderer;
import net.mcreator.totallynormal.client.renderer.LivingDirtBlockRenderer;
import net.mcreator.totallynormal.client.renderer.KnightRenderer;
import net.mcreator.totallynormal.client.renderer.HimRenderer;
import net.mcreator.totallynormal.client.renderer.EmeraldPigRenderer;
import net.mcreator.totallynormal.client.renderer.DirtCowRenderer;
import net.mcreator.totallynormal.client.renderer.CrystalKnightRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TotallynormalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TotallynormalModEntities.DIRT_COW.get(), DirtCowRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.LIVING_DIRT_BLOCK.get(), LivingDirtBlockRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.HIM.get(), HimRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.EMERALD_PIG.get(), EmeraldPigRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.TECHNOBLADE.get(), TechnobladeRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.TECHNOBLADE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.CRYSTAL_KNIGHT.get(), CrystalKnightRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.KNIGHT.get(), KnightRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.SORCEROR.get(), SorcerorRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.SORCEROR_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
