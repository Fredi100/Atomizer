package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockAssembler2 extends Block{
	private String UNLOCALIZED_BLOCK_NAME = "Assembler2Block";
	
	public BlockAssembler2(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Wei�t dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
}
