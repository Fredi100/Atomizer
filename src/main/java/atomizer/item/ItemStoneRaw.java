package atomizer.item;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemStoneRaw extends Item{
	
	public static final String REGISTRY_NAME = "stoneRaw";
	
	public ItemStoneRaw(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setRegistryName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
