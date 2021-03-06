package com.neonite.Ground_Cero.object.items;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {

		Neonite.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
