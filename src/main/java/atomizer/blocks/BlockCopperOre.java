package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockCopperOre extends Block{
	
	public static final String REGISTRY_NAME = "copperOreBlock";

	protected BlockCopperOre() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		this.setRegistryName(REGISTRY_NAME);
		GameRegistry.registerBlock(this, REGISTRY_NAME);
	}
}
