package atomizer.items;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLaser1 extends Item{
	
	public static final String REGISTRY_NAME = "laser1Item";
	
	public ItemLaser1(){
		
		setUnlocalizedName(Constants.MODID + "_" + REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
