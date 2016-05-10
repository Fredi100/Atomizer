package atomizer.blocks;

import java.util.TreeMap;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Kümmert sich um das Erstellen und Initialisieren der einzelnen Blöcke
 * 
 * @author Fredi100
 */
public final class AtomizerBlocks {
	
	public static TreeMap<String,Block> blocks;
	
	/**
	 * Initialisiert die einzelnen Blöcke für das Spiel
	 */
	public static void init(){
		System.out.println("Atomizer is initializing its blocks now!");
		
		blocks = new TreeMap<String, Block>();
		
		blocks.put(BlockTest.UNLOCALIZED_BLOCK_NAME, new BlockTest());
		blocks.put(ITBlock.UNLOCALIZED_BLOCK_NAME, new ITBlock());
		blocks.put(TGMBlock.UNLOCALIZED_BLOCK_NAME, new TGMBlock());
		
		blocks.put(BlockAssembler1.UNLOCALIZED_BLOCK_NAME, new BlockAssembler1());
		blocks.put(BlockAssembler2.UNLOCALIZED_BLOCK_NAME, new BlockAssembler2());
		blocks.put(BlockAssembler3.UNLOCALIZED_BLOCK_NAME, new BlockAssembler3());
		blocks.put(BlockDisassembler1.UNLOCALIZED_BLOCK_NAME, new BlockDisassembler1());
		blocks.put(BlockDisassembler2.UNLOCALIZED_BLOCK_NAME, new BlockDisassembler2());
		blocks.put(BlockDisassembler3.UNLOCALIZED_BLOCK_NAME, new BlockDisassembler3());
		blocks.put(BlockTransport1.UNLOCALIZED_BLOCK_NAME, new BlockTransport1());
		blocks.put(BlockTransport2.UNLOCALIZED_BLOCK_NAME, new BlockTransport2());
		blocks.put(BlockTransport3.UNLOCALIZED_BLOCK_NAME, new BlockTransport3());
		blocks.put(BlockSpeicher2.UNLOCALIZED_BLOCK_NAME, new BlockSpeicher2());
		blocks.put(BlockSpeicher3.UNLOCALIZED_BLOCK_NAME, new BlockSpeicher3());
		blocks.put(BlockSoil.UNLOCALIZED_BLOCK_NAME, new BlockSoil());
		
		//Ores
		blocks.put(BlockCopperOre.UNLOCALIZED_BLOCK_NAME, new BlockCopperOre());
		blocks.put(BlockTinOre.UNLOCALIZED_BLOCK_NAME, new BlockTinOre());
		blocks.put(BlockSilverOre.UNLOCALIZED_BLOCK_NAME, new BlockSilverOre());
	}
	
	/**
	 * Vielleicht später alle Blöcke in ein Array auslagern und Variablen damit sparen
	 */
	
	public static void registerBlockModels(){
		// TODO In die Proxy Klassen verlagern
		System.out.println("Atomizer is registering its models now!");
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl;
		
		for(Block b : blocks.values()){
			mrl = new ModelResourceLocation(b.getRegistryName(), "inventory");
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(b), 0, mrl);
			System.out.println("Registered: " + b.getRegistryName());
			
			//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b), 0, mrl);
		}
	
	}
	
}
