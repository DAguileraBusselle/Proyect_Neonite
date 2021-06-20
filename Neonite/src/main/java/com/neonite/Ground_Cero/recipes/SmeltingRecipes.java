package com.neonite.Ground_Cero.recipes;

import com.neonite.Ground_Cero.init.BlockInit;
import com.neonite.Ground_Cero.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {

	public static void init() {
		GameRegistry.addSmelting(new ItemStack(BlockInit.NEONITE_ORE), new ItemStack(ItemInit.FRAGMENTED_NEONITE), 1.3f);
	}
}
