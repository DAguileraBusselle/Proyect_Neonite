package com.neonite.Ground_Cero.util.handlers;

import com.neonite.Ground_Cero.entity.neoniteArrow.EntityNeoniteArrow;
import com.neonite.Ground_Cero.entity.neoniteArrow.RenderNeoniteArrow;
import com.neonite.Ground_Cero.entity.test.EntityTest;
import com.neonite.Ground_Cero.entity.test.RenderTest;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {

		RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new IRenderFactory<EntityTest>() {
			@Override
			public Render<? super EntityTest> createRenderFor(RenderManager manager) {
				return new RenderTest(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityNeoniteArrow.class, new IRenderFactory<EntityNeoniteArrow>() {
			@Override
			public Render<? super EntityNeoniteArrow> createRenderFor(RenderManager manager) {
				return new RenderNeoniteArrow(manager);
			}
		});
	}
}
