package atomizer.common;

import java.util.Random;

import atomizer.blocks.AtomizerBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class AtomizerWorldGen implements IWorldGenerator {

	private WorldGenerator gen_copper_ore; // Generates Copper Ore (used in
											// Overworld)
	private int copper_vein_size = 9; //Immer 1 mehr nehmen als verlangt
	private int copper_chance = 20;
	private int copper_min_height = 0;
	private int copper_max_height = 50;
	
	private WorldGenerator gen_tin_ore; // Generates Tin Ore (used in Overworld)
	private int tin_vein_size = 8;
	private int tin_chance = 16;
	private int tin_min_height = 0;
	private int tin_max_height = 40;
	
	private WorldGenerator gen_silver_ore; // Generates Silver Ore (used in Overworld)
	private int silver_vein_size = 7;
	private int silver_chance = 10;
	private int silver_min_height = 0;
	private int silver_max_height = 30;

	public AtomizerWorldGen() {
		// Zahl am Ende enstpricht der Venen Größe
		this.gen_copper_ore = new WorldGenMinable(
				AtomizerBlocks.getBlock(AtomizerBlocks.BLOCK_COPPERORE).getDefaultState(), this.copper_vein_size);
		this.gen_tin_ore = new WorldGenMinable(AtomizerBlocks.getBlock(AtomizerBlocks.BLOCK_TINORE).getDefaultState(),this.tin_vein_size);
		this.gen_silver_ore = new WorldGenMinable(AtomizerBlocks.getBlock(AtomizerBlocks.BLOCK_SILVERORE).getDefaultState(),this.silver_vein_size);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, this.copper_chance, copper_min_height, copper_max_height);
			this.runGenerator(this.gen_tin_ore, world, random, chunkX, chunkZ, silver_chance, silver_min_height, silver_max_height);
			this.runGenerator(this.gen_silver_ore, world, random, chunkX, chunkZ, this.silver_chance, this.silver_min_height, silver_max_height);
			break;
		case -1: // Nether
			break;
		case 1: // End
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z,
			int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}