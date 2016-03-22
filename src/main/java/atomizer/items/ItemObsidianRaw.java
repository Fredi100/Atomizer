package atomizer.items;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemObsidianRaw extends Item{
	
	public static final String UNLOCALIZED_ITEM_NAME = "obsidianRaw";
	
	public ItemObsidianRaw(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
