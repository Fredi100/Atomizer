package emsenhuber.alfred.atomizer.items;

import cpw.mods.fml.common.registry.GameRegistry;
import emsenhuber.alfred.atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLaser3 extends Item{
	
	private String name = "laser3Item";
	
	public ItemLaser3(){
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMisc);
		
	}
}