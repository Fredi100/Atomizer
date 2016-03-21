package atomizer.items;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIronRaw extends Item{
	
	public ItemIronRaw(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ironRaw");
		setTextureName(Constants.MODID+":IronRawTexture");
	}
}
