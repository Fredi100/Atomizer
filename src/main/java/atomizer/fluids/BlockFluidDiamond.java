package atomizer.fluids;

import atomizer.lib.Constants;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

// TODO Muss noch auf die neue Version upgedatet werden
public class BlockFluidDiamond extends BlockFluidClassic{

    @SideOnly(Side.CLIENT) //Dinge die nur auf der Client-Seite passieren sollen
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;
    
    private String name = "diamondFluidBlock";
    
    public BlockFluidDiamond(Fluid fluid, Material material) {
            super(fluid, material);
            setCreativeTab(CreativeTabs.tabMisc);
            GameRegistry.registerBlock(this, Constants.MODID + "_" + this.getUnlocalizedName().substring(5));
    }
    
    @Override
    public IIcon getIcon(int side, int meta) {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
            //stillIcon = register.registerIcon("modid:fluidStill");
            //flowingIcon = register.registerIcon("modid:fluidFlowing");
    }
    
    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
            if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
            return super.canDisplace(world, x, y, z);
    }
    
    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
            if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
            return super.displaceIfPossible(world, x, y, z);
    }
    
}
