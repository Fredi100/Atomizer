package atomizer.item;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemWrench extends Item {
	
	public static final String REGISTRY_NAME = "wrench";
	
	public ItemWrench(){
		setRegistryName(REGISTRY_NAME);
		setUnlocalizedName(Constants.MODID + ":" + Constants.MODID + "_" + REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
