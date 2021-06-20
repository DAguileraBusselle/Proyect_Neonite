package com.neonite.Ground_Cero.world.gen;

import java.util.Random;

import com.neonite.Ground_Cero.init.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		if(world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
	}

	private void generateOverworld(Random rd, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		generateOre(BlockInit.NEONITE_ORE.getDefaultState(), world, rd, chunkX * 16, chunkZ * 16, 1, 15, rd.nextInt(2) + 3, 7);
		
	}

	private void generateOre(IBlockState ore, World world, Random rd, int x, int z, int minY, int maxY, int size,
			int chances) {
		
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + rd.nextInt(16), minY + rd.nextInt(deltaY), z + rd.nextInt(16)); 
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, rd, pos);
			
		}
		
		
		
	}
}
