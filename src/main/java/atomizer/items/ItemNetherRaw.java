package atomizer.items;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemNetherRaw extends Item{
	
	public static final String REGISTRY_NAME = "netherRaw";
	
	public ItemNetherRaw(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setRegistryName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
