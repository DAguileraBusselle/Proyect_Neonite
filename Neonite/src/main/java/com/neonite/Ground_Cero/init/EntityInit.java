package com.neonite.Ground_Cero.init;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.entity.neoniteArrow.EntityNeoniteArrow;
import com.neonite.Ground_Cero.entity.test.EntityTest;
import com.neonite.Ground_Cero.util.Reference;
import com.neonite.Ground_Cero.util.handlers.ConfigHandler;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("test", EntityTest.class, ConfigHandler.ENTITY_TEST, 50, 13310623, 65354);
		registerArrow("neonite_arrow", EntityNeoniteArrow.class, ConfigHandler.ENTITY_NEONITE_ARROW);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Neonite.instance, range, 1, true, color1, color2);
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Neonite.instance, 64, 20, true);
	}
	
}