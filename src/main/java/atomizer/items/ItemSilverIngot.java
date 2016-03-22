package atomizer.items;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemSilverIngot extends Item{
	
	public static final String UNLOCALIZED_ITEM_NAME = "silverIngot";
	
	public ItemSilverIngot(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
