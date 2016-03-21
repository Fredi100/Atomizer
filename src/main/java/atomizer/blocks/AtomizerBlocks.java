package atomizer.blocks;

import net.minecraft.block.Block;

/**
 * Kümmert sich um das Erstellen und Initialisieren der einzelnen Blöcke
 * 
 * @author Fredi100
 */
public final class AtomizerBlocks {
	
	/*Erzeugen der einzelnen Blöcke*/
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
	
	/**
	 * Initialisiert die einzelnen Blöcke für das Spiel
	 */
	public static void init(){
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
	}
	
	/**
	 * Vielleicht später alle Blöcke in ein Array auslagen und Variablen damit sparen
	 */
	
}
