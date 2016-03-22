package atomizer.items;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGoldRaw extends Item{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "goldRaw";
	
	public ItemGoldRaw(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(UNLOCALIZED_BLOCK_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_BLOCK_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_BLOCK_NAME);
	}
}
