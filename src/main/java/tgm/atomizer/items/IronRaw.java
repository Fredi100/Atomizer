package tgm.atomizer.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tgm.atomizer.BaseMod;

public class IronRaw extends Item{
	
	public IronRaw(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ironRaw");
		setTextureName(BaseMod.MODID+":IronRawTexture");
	}
}
