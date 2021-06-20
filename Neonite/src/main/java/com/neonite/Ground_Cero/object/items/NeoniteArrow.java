package com.neonite.Ground_Cero.object.items;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.entity.neoniteArrow.EntityNeoniteArrow;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NeoniteArrow extends ItemArrow implements IHasModel {

	public NeoniteArrow (String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) {
		
		EntityNeoniteArrow entityNeoniteArrow = new EntityNeoniteArrow(worldIn, shooter);
		return entityNeoniteArrow;
	}
	
	@Override
	public void registerModels() {

		Neonite.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
