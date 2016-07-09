package atomizer.block;

import java.util.ArrayList;
import java.util.TreeMap;

import atomizer.block.machine.BlockAssembler1;
import atomizer.block.machine.BlockAssembler2;
import atomizer.block.machine.BlockAssembler3;
import atomizer.block.machine.BlockDisassembler1;
import atomizer.block.machine.BlockDisassembler2;
import atomizer.block.machine.BlockDisassembler3;
import atomizer.block.misc.BlockIT;
import atomizer.block.misc.BlockTGM;
import atomizer.block.ore.BlockCopperOre;
import atomizer.block.ore.BlockSilverOre;
import atomizer.block.ore.BlockTinOre;
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
	
	public static final int  IT = 0;
	public static final int  TGM = 1;
	public static final int  ASSEMBLER1 = 2;
	public static final int  ASSEMBLER2 = 3;
	public static final int  ASSEMBLER3 = 4;
	public static final int  DISASSEMBLER1 = 5;
	public static final int  DISASSEMBLER2 = 6;
	public static final int  DISASSEMBLER3 = 7;
	public static final int  STORAGE2 = 8;
	public static final int  STORAGE3 = 9;
	public static final int  SOIL = 10;
	public static final int  COPPER_ORE = 11;
	public static final int  TIN_ORE = 12;
	public static final int  SILVER_ORE = 13;
	
	/**
	 * Initializes every block of this mod
	 */
	public static void init(){
		System.out.println("Atomizer is initializing its blocks now!");
		
		blocks = new ArrayList<Block>();
		blocks.add(IT, new BlockIT());
		blocks.add(TGM, new BlockTGM());
		
		
		blocks.add(ASSEMBLER1, new BlockAssembler1());
		blocks.add(ASSEMBLER2, new BlockAssembler2());
		blocks.add(ASSEMBLER3, new BlockAssembler3());
		blocks.add(DISASSEMBLER1, new BlockDisassembler1());
		blocks.add(DISASSEMBLER2, new BlockDisassembler2());
		blocks.add(DISASSEMBLER3, new BlockDisassembler3());
		blocks.add(STORAGE2, new BlockSpeicher2());
		blocks.add(STORAGE3, new BlockSpeicher3());
		blocks.add(SOIL, new BlockSoil());
		
		//Ores
		blocks.add(COPPER_ORE, new BlockCopperOre());
		blocks.add(TIN_ORE, new BlockTinOre());
		blocks.add(SILVER_ORE, new BlockSilverOre());
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
