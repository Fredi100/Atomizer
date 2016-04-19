package atomizer.world;

import java.util.Random;

import atomizer.blocks.AtomizerBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class AtomizerWorldGen implements IWorldGenerator {

	private WorldGenerator gen_copper_ore; // Generiert Copper Ore(Overworld)
	private WorldGenerator gen_silver_ore; // Generiert Silver Ore(Overworld)
	private WorldGenerator gen_tin_ore; // Generiert Tin Ore(Overworld)
	
	public AtomizerWorldGen() {
		this.gen_copper_ore = new WorldGenMinable(AtomizerBlocks.copperOreBlock, 8);
		this.gen_silver_ore = new WorldGenMinable(AtomizerBlocks.silverOreBlock, 6);
		this.gen_tin_ore = new WorldGenMinable(AtomizerBlocks.tinOreBlock, 8);
	}

	@Override
	/**
	 * Diese Methode wird für jede Dimension einzeln aufgerufen.
	 */
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		switch (world.provider.dimensionId) { // Um für jede Dimension etwas
												// anderes zu machen dieses
												// Switch
		case 0: // Overworld
			this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			this.runGenerator(this.gen_silver_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			this.runGenerator(this.gen_tin_ore, world, random, chunkX, chunkZ, 20, 0, 64);
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
			generator.generate(world, rand, x, y, z);
		}
	}
}
