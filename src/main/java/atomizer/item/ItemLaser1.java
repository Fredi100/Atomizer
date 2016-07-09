package atomizer.item;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLaser1 extends Item{
	
	public static final String REGISTRY_NAME = "laser1Item";
	
	public ItemLaser1(){
		setRegistryName(REGISTRY_NAME);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
