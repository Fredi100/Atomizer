package atomizer.fluids;

import atomizer.lib.Constants;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockFluidRedstone extends BlockFluidClassic{
    
    private String name = "redstoneFluidBlock";
    
    public BlockFluidRedstone(Fluid fluid, Material material) {
            super(fluid, material);
            setCreativeTab(CreativeTabs.tabMisc);
            GameRegistry.registerBlock(this, Constants.MODID + "_" + this.getUnlocalizedName().substring(5));
    }
}
