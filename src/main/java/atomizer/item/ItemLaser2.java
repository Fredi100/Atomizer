package atomizer.item;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLaser2 extends Item{
	
	public static final String REGISTRY_NAME = "laser2Item";
	
	public ItemLaser2(){
		setRegistryName(REGISTRY_NAME);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}