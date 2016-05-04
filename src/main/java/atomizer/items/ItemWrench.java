package atomizer.items;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemWrench extends Item {
	
	public static final String UNLOCALIZED_ITEM_NAME = "wrenchItem";
	
	public ItemWrench(){
		
		setUnlocalizedName(Constants.MODID + "_" + UNLOCALIZED_ITEM_NAME);
		setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
