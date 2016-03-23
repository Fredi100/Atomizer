package atomizer.items;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLaser1 extends Item{
	
	public static final String UNLOCALIZED_ITEM_NAME = "laser1Item";
	
	public ItemLaser1(){
		
		setUnlocalizedName(Constants.MODID + "_" + UNLOCALIZED_ITEM_NAME);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
