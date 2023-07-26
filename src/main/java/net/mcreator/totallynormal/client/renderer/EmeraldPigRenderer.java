
package net.mcreator.totallynormal.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.totallynormal.entity.EmeraldPigEntity;

public class EmeraldPigRenderer extends MobRenderer<EmeraldPigEntity, PigModel<EmeraldPigEntity>> {
	public EmeraldPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmeraldPigEntity entity) {
		return new ResourceLocation("totallynormal:textures/entities/pig.png");
	}
}
