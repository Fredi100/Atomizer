package atomizer.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemStoneIngot extends Item{
	
	public static final String REGISTRY_NAME = "stoneIngot";
	
	public ItemStoneIngot(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
