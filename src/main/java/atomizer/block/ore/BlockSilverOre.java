package atomizer.block.ore;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockSilverOre extends Block{
	
	public static final String REGISTRY_NAME = "silverOreBlock";

	public BlockSilverOre() {
		super(Material.rock);
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);//Gibt dem Block einen internen Namen
		this.setRegistryName(REGISTRY_NAME);
		GameRegistry.registerBlock(this, REGISTRY_NAME);//Registriert den Block im Spiel
	}
}
