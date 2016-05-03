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
    
    private String name = "diamondFluidBlock";
    
    public BlockFluidDiamond(Fluid fluid, Material material) {
            super(fluid, material);
            setCreativeTab(CreativeTabs.tabMisc);
            GameRegistry.registerBlock(this, Constants.MODID + "_" + this.getUnlocalizedName().substring(5));
    }
    
}
