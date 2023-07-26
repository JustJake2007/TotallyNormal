
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.totallynormal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.totallynormal.client.renderer.TechnobladeRenderer;
import net.mcreator.totallynormal.client.renderer.LivingDirtBlockRenderer;
import net.mcreator.totallynormal.client.renderer.HimRenderer;
import net.mcreator.totallynormal.client.renderer.EmeraldPigRenderer;
import net.mcreator.totallynormal.client.renderer.DirtCowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TotallynormalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TotallynormalModEntities.DIRT_COW.get(), DirtCowRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.LIVING_DIRT_BLOCK.get(), LivingDirtBlockRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.HIM.get(), HimRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.EMERALD_PIG.get(), EmeraldPigRenderer::new);
		event.registerEntityRenderer(TotallynormalModEntities.TECHNOBLADE.get(), TechnobladeRenderer::new);
	}
}
