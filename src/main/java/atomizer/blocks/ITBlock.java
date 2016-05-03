package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO Muss noch auf die neue Minecraft Version upgedatet werden
public class ITBlock extends Block /*extends BlockContainer*/{
	/* Konstanten */
	public static final String UNLOCALIZED_BLOCK_NAME = "itBlock";
	
	public ITBlock(){
		super(Material.ground);
        this.setHardness(0.5F);
        this.setStepSound(Block.soundTypeGravel);
        this.setUnlocalizedName(ITBlock.UNLOCALIZED_BLOCK_NAME);
        this.setCreativeTab(CreativeTabs.tabBlock);
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