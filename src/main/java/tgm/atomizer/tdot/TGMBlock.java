package tgm.atomizer.tdot;

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
import tgm.atomizer.BaseMod;

public class TGMBlock extends BlockContainer{
		/* Konstanten */
	
		public static final String UNLOCALIZED_BLOCK_NAME = "tgmBlock";
		
        public TGMBlock(){
                super(Material.ground);
                setHardness(0.5F);
                setStepSound(Block.soundTypeGravel);
                setBlockName(TGMBlock.UNLOCALIZED_BLOCK_NAME);
                setCreativeTab(CreativeTabs.tabBlock);
                setBlockTextureName(BaseMod.MODID +":ITLogo_0");
                
        }
        
		@Override
		public TileEntity createNewTileEntity(World world, int arg1) {
			return new TGMTile();
		}
        
		@Override
		public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9){
			setBlockTextureName(BaseMod.MODID +":ITLogo");
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}
		
}