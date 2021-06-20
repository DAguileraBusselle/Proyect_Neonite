package com.neonite.Ground_Cero.object.items.tools;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {

	
	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Neonite.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
