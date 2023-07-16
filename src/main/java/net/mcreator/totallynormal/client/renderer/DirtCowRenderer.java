
package net.mcreator.totallynormal.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.totallynormal.entity.DirtCowEntity;

public class DirtCowRenderer extends MobRenderer<DirtCowEntity, CowModel<DirtCowEntity>> {
	public DirtCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DirtCowEntity entity) {
		return new ResourceLocation("totallynormal:textures/entities/cow-planetminecraft-com-15291808.png");
	}
}
