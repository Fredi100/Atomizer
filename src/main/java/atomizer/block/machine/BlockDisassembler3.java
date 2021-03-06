package atomizer.block.machine;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockDisassembler3 extends Block{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "Disassembler3Block";
	
	public BlockDisassembler3(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Wei�t dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
	
	/**
	 * Gibt den Namen des Blocks zur�ck
	 * 
	 * @return Der Name des Blocks
	 */
	public String getName(){
		return UNLOCALIZED_BLOCK_NAME;
	}
}