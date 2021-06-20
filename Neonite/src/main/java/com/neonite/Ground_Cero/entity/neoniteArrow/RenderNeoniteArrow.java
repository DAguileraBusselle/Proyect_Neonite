package com.neonite.Ground_Cero.entity.neoniteArrow;

import com.neonite.Ground_Cero.util.Reference;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNeoniteArrow extends RenderArrow<EntityNeoniteArrow>{

	public RenderNeoniteArrow(RenderManager manager) {
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityNeoniteArrow entity) {
		return new ResourceLocation(Reference.MOD_ID + ":textures/entity/arrows/neonite_arrow.png");
														
	}
}
