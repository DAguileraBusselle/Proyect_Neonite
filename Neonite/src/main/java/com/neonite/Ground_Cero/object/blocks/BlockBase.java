package com.neonite.Ground_Cero.object.blocks;

import com.neonite.Ground_Cero.Neonite;
import com.neonite.Ground_Cero.init.BlockInit;
import com.neonite.Ground_Cero.init.ItemInit;
import com.neonite.Ground_Cero.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material, float blockHardness, float blockResistance, float lightValue, float slipperiness,
			String toolClass, int level, SoundType soundType) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(blockHardness);
		setResistance(blockResistance);
		setLightLevel(lightValue);
		setDefaultSlipperiness(slipperiness);
		setHarvestLevel(toolClass, level);
		setSoundType(blockSoundType);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Neonite.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	
}
