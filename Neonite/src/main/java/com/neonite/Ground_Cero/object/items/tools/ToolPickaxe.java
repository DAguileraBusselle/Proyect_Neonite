package com.neonite.Ground_Cero.object.items.tools;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

	
	public ToolPickaxe(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		efficiency = 20.0f;
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Neonite.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
