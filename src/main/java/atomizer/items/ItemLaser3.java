package atomizer.items;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLaser3 extends Item{
	
	public static final String REGISTRY_NAME = "laser3Item";
	
	public ItemLaser3(){
		
		setUnlocalizedName(Constants.MODID + "_" + REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}