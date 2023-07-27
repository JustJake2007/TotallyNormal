
package net.mcreator.totallynormal.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.totallynormal.entity.CrystalKnightEntity;

public class CrystalKnightRenderer extends HumanoidMobRenderer<CrystalKnightEntity, HumanoidModel<CrystalKnightEntity>> {
	public CrystalKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalKnightEntity entity) {
		return new ResourceLocation("totallynormal:textures/entities/2023_07_24_blue-knight-21825859.png");
	}
}
