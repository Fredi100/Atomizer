package atomizer.block.misc;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * IT Block
 * 
 * @author Alfred Emsenhuber(Fredi100)
 * @version 2016-05-25
 */
public class BlockIT extends Block/*Container*/{
	/* Konstanten */
	public static final String UNLOCALIZED_BLOCK_NAME = "itBlock";
	
	public BlockIT(){
		super(Material.ground);
        this.setHardness(0.5F);
        this.setStepSound(Block.soundTypeGravel);
        this.setUnlocalizedName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);
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