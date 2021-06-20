package com.neonite.Ground_Cero.util.handlers;

import java.io.File;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	

	//Entities
	public static int ENTITY_TEST = 250;
	public static int ENTITY_NEONITE_ARROW = 251;
	

	public static void init(File file)
	{
		config = new Configuration(file);
		String category;
			
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set IDs for each Entity.");
		ENTITY_TEST = config.getInt("Entity Test", category, 250, 250, 500, "Entity Test ID");
		ENTITY_NEONITE_ARROW = config.getInt("Entity Neonite Arrow", category, 251, 250, 500, "Entity Neonite Arrow ID");
	
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Neonite.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Neonite.config.mkdirs();
		init(new File(Neonite.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}