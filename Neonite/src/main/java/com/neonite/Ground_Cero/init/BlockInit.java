package com.neonite.Ground_Cero.init;

import java.util.ArrayList;
import java.util.List;

import com.neonite.Ground_Cero.object.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block NEONITE_ORE = new BlockBase("neonite_ore", Material.ROCK, 5.0f, 75.0f, 5.0f, 0.6f, "pickaxe", 3, SoundType.STONE);
	
	
}
