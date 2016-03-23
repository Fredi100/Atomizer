package atomizer.items;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWrench extends Item {
	
	public static final String UNLOCALIZED_ITEM_NAME = "wrenchItem";
	
	public ItemWrench(){
		
		setUnlocalizedName(Constants.MODID + "_" + UNLOCALIZED_ITEM_NAME);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
