package atomizer.blocks;

import java.util.ArrayList;
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
 * @version 2016-07-03
 */
public final class AtomizerBlocks {
	
	public static ArrayList<Block> blocks;
	
	public static final int  BLOCK_IT = 0;
	public static final int  BLOCK_TGM = 1;
	public static final int  BLOCK_ASSEMBLER1 = 2;
	public static final int  BLOCK_ASSEMBLER2 = 3;
	public static final int  BLOCK_ASSEMBLER3 = 4;
	public static final int  BLOCK_DISASSEMBLER1 = 5;
	public static final int  BLOCK_DISASSEMBLER2 = 6;
	public static final int  BLOCK_DISASSEMBLER3 = 7;
	public static final int  BLOCK_STORAGE2 = 8;
	public static final int  BLOCK_STORAGE3 = 9;
	public static final int  BLOCK_SOIL = 10;
	public static final int  BLOCK_COPPERORE = 11;
	public static final int  BLOCK_TINORE = 12;
	public static final int  BLOCK_SILVERORE = 13;
	
	/**
	 * Initializes every block of this mod
	 */
	public static void init(){
		System.out.println("Atomizer is initializing its blocks now!");
		
		blocks = new ArrayList<Block>();
		blocks.add(BLOCK_IT, new BlockIT());
		blocks.add(BLOCK_TGM, new BlockTGM());
		
		
		blocks.add(BLOCK_ASSEMBLER1, new BlockAssembler1());
		blocks.add(BLOCK_ASSEMBLER2, new BlockAssembler2());
		blocks.add(BLOCK_ASSEMBLER3, new BlockAssembler3());
		blocks.add(BLOCK_DISASSEMBLER1, new BlockDisassembler1());
		blocks.add(BLOCK_DISASSEMBLER2, new BlockDisassembler2());
		blocks.add(BLOCK_DISASSEMBLER3, new BlockDisassembler3());
		blocks.add(BLOCK_STORAGE2, new BlockSpeicher2());
		blocks.add(BLOCK_STORAGE3, new BlockSpeicher3());
		blocks.add(BLOCK_SOIL, new BlockSoil());
		
		//Ores
		blocks.add(BLOCK_COPPERORE, new BlockCopperOre());
		blocks.add(BLOCK_TINORE, new BlockTinOre());
		blocks.add(BLOCK_SILVERORE, new BlockSilverOre());
	}
	
	/**
	 * Registers every model of each block so it has a texture
	 */
	public static void registerBlockModels(){
		// TODO In die Proxy Klassen verlagern
		System.out.println("Atomizer is registering its models now!");
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl;
		
		for(Block b : blocks){
			mrl = new ModelResourceLocation(b.getRegistryName(), "inventory");
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(b), 0, mrl);
			System.out.println("Registered: " + b.getRegistryName());
			
			//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b), 0, mrl);
		}
	
	}
	
	public static Block getBlock(int index){
		return blocks.get(index);
	}
	
}
