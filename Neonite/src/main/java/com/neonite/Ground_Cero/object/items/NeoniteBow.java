package com.neonite.Ground_Cero.object.items;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class NeoniteBow extends ItemBow implements IHasModel{
	
	public NeoniteBow(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxDamage(800);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public int getItemEnchantability() {
		
		return 25;
	}
	
	@Override
	protected boolean isArrow(ItemStack stack) {

		if (stack.getItem() == ItemInit.NEONITE_ARROW) {
			return true;
		} else {
			return false;
		}
	}
	
	/*@Override
	public void setDamage(ItemStack stack, int damage) {
		
		return
	}*/
	
	@Override
	public void registerModels() {

		Neonite.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
