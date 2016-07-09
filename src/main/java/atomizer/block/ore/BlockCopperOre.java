package atomizer.block.ore;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockCopperOre extends Block{
	
	public static final String REGISTRY_NAME = "copperOreBlock";

	public BlockCopperOre() {
		super(Material.rock);
		this.setHardness(2.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		this.setRegistryName(REGISTRY_NAME);
		GameRegistry.registerBlock(this, REGISTRY_NAME);
	}
}
