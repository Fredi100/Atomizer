package atomizer.blocks;

import net.minecraft.block.Block;

/**
 * K�mmert sich um das Erstellen und Initialisieren der einzelnen Bl�cke
 * 
 * @author Fredi100
 */
public final class AtomizerBlocks {
	
	/*Erzeugen der einzelnen Bl�cke*/
	public static Block assembler1Block;
	public static Block assembler2Block;
	public static Block assembler3Block;
	public static Block disassembler1Block;
	public static Block disassembler2Block;
	public static Block disassembler3Block;
	public static Block transport1Block;
	public static Block transport2Block;
	public static Block transport3Block;
	public static Block speicher2Block;
	public static Block speicher3Block;
	public static Block soilBlock;
	public static Block testBlock;
	
	public static Block itBlock;
	public static Block tgmBlock;
	
	public static Block copperOreBlock;
	public static Block tinOreBlock;
	public static Block silverOreBlock;
	
	/**
	 * Initialisiert die einzelnen Bl�cke f�r das Spiel
	 */
	public static void init(){
		System.out.println("Atomizer is initializing its blocks now!");
		testBlock = new BlockTest();
		itBlock = new ITBlock();
		tgmBlock = new TGMBlock();
		
		assembler1Block = new BlockAssembler1();
		assembler2Block = new BlockAssembler2();
		assembler3Block = new BlockAssembler3();
		disassembler1Block = new BlockDisassembler1();
		disassembler2Block = new BlockDisassembler2();
		disassembler3Block = new BlockDisassembler3();
		transport1Block = new BlockTransport1();
		transport2Block = new BlockTransport2();
		transport3Block = new BlockTransport3();
		speicher2Block = new BlockSpeicher2();
		speicher3Block = new BlockSpeicher3();
		soilBlock = new BlockSoil();
		
		//Ores
		copperOreBlock = new BlockCopperOre();
		tinOreBlock = new BlockTinOre();
		silverOreBlock = new BlockSilverOre();
	}
	
	/**
	 * Vielleicht sp�ter alle Bl�cke in ein Array auslagen und Variablen damit sparen
	 */
	
}