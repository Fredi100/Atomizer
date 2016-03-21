package atomizer.blocks;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
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

public class TGMBlock extends Block /*extends BlockContainer*/{
	/* Konstanten */
	
	public static final String UNLOCALIZED_BLOCK_NAME = "tgmBlock";
		
    public TGMBlock(){
        super(Material.ground);
        this.setHardness(0.5F);
        this.setStepSound(Block.soundTypeGravel);
        this.setBlockName(TGMBlock.UNLOCALIZED_BLOCK_NAME);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName(Constants.MODID +":"+UNLOCALIZED_BLOCK_NAME);
        GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);
    }
}
