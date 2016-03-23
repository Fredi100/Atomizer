package atomizer.items;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLaser3 extends Item{
	
	public static final String UNLOCALIZED_ITEM_NAME = "laser3Item";
	
	public ItemLaser3(){
		
		setUnlocalizedName(Constants.MODID + "_" + UNLOCALIZED_ITEM_NAME);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}