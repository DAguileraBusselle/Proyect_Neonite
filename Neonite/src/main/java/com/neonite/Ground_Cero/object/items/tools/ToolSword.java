package com.neonite.Ground_Cero.object.items.tools;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Neonite.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
