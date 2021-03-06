package atomizer.block.misc;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * TGMBlock
 * 
 * @author Alfred Emsenhuber(Fredi100)
 * @version 2016-05-25
 */
public class BlockTGM extends Block/*Container*/{
	/* Konstanten */
	
	public static final String REGISTRY_NAME = "tgmBlock";
	//public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
		
    public BlockTGM(){
        super(Material.ground);
        this.setHardness(0.5F);
        this.setStepSound(Block.soundTypeGravel);
        this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
        this.setRegistryName(this.REGISTRY_NAME);
        this.setCreativeTab(CreativeTabs.tabBlock);
        //this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        GameRegistry.registerBlock(this, REGISTRY_NAME);
    }
	
	/*
	@Override
	public BlockState createBlockState(){
		return new BlockState(this, new IProperty[] {FACING});
	}
	*/
}
