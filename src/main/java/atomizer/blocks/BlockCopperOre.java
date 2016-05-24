package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockCopperOre extends Block{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "copperOreBlock";

	protected BlockCopperOre() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		setUnlocalizedName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);
	}
	
	/**
	 * Gibt den Namen des Blocks zurück
	 * 
	 * @return Der Name des Blocks
	 */
	public String getName(){
		return UNLOCALIZED_BLOCK_NAME;
	}
}
