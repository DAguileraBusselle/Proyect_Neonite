package com.neonite.Ground_Cero.util.handlers;

import com.neonite.Ground_Cero.init.BlockInit;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event) {

		for (Item item : ItemInit.ITEMS) {
			
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();
			}
			
		}
		
		for (Block block : BlockInit.BLOCKS) {
			
			if (block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}

	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		
	}
	
	@SubscribeEvent
	public static void registerEnchant(RegistryEvent.Register<Enchantment> event) {
	}

	public static void preInitRegistries(FMLPreInitializationEvent event) {

	}

	public static void initRegistries() {

	}

	public static void postInitRegistries() {
	
	}

	public static void serverRegistries(FMLServerStartingEvent event) {
	}
}