package atomizer.blocks;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ITBlock extends Block /*extends BlockContainer*/{
	/* Konstanten */
	public static final String UNLOCALIZED_BLOCK_NAME = "itBlock";
	
	public ITBlock(){
		super(Material.ground);
        setHardness(0.5F);
        setStepSound(Block.soundTypeGravel);
        setBlockName(ITBlock.UNLOCALIZED_BLOCK_NAME);
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Constants.MODID +":"+UNLOCALIZED_BLOCK_NAME);      
    }
}