package emsenhuber.alfred.atomizer.blocks;

import net.minecraft.block.Block;

public final class AtomizerBlocks {

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
	
	public static void init(){
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
	
}
