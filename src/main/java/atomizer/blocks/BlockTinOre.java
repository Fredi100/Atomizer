package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockTinOre extends Block{
	
	public static final String REGISTRY_NAME = "tinOreBlock";

	protected BlockTinOre() {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);//Gibt dem Block einen internen Namen
		this.setRegistryName(REGISTRY_NAME);
		GameRegistry.registerBlock(this, REGISTRY_NAME);//Registriert den Block im Spiel
	}
}
