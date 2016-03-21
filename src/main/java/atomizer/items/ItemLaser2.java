package atomizer.items;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLaser2 extends Item{
	
	private String name = "laser2Item";
	
	public ItemLaser2(){
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMisc);
		
	}
}