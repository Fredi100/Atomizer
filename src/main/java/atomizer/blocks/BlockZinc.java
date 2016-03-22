package atomizer.blocks;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockZinc extends Block{
	
	private static String UNLOCALIZED_BLOCK_NAME = "zincBlock";

	protected BlockZinc() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setBlockName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
}
