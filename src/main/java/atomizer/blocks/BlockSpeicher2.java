package atomizer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockSpeicher2 extends Block{
	private String UNLOCALIZED_BLOCK_NAME = "Speicher2Block";
	
	public BlockSpeicher2(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Wei�t dem Block ein Tab zu um ihn anzuzeigen
		this.setBlockName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
}