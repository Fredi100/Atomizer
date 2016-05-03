package atomizer.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTinIngot extends Item{
	
	public static final String UNLOCALIZED_ITEM_NAME = "tinIngot";
	
	public ItemTinIngot(){
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
	
	/**
	 * Gibt den Namen des Items zur�ck
	 * 
	 * @return Der Name des Blocks
	 */
	public String getName(){
		return UNLOCALIZED_ITEM_NAME;
	}
}
