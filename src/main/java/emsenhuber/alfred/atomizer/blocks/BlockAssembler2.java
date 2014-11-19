package emsenhuber.alfred.atomizer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import emsenhuber.alfred.atomizer.lib.Constants;

public class BlockAssembler2 extends Block{
	private String name = "Assembler2Block";
	
	public BlockAssembler2(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setBlockName(Constants.MODID + "_" + name);//Gibt dem Block einen internen Namen
		GameRegistry.registerBlock(this, name);//Registriert den Block im Spiel
	}
}
