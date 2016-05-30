package atomizer.items;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSoilPile extends Item{
	
	public static final String REGISTRY_NAME = "soilPile";
	
	public ItemSoilPile(){
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setRegistryName(REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
