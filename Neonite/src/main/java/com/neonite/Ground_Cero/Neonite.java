package com.neonite.Ground_Cero;

import java.io.File;

import com.neonite.Ground_Cero.proxy.CommonProxy;
import com.neonite.Ground_Cero.recipes.SmeltingRecipes;
import com.neonite.Ground_Cero.util.Reference;
import com.neonite.Ground_Cero.world.gen.WorldGenOres;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class Neonite {
	public static File config;
	
	
	@Instance
	public static Neonite instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		SmeltingRecipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event) {
		
	}
}
