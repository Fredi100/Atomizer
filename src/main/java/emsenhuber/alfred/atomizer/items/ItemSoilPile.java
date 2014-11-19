package emsenhuber.alfred.atomizer.items;

import cpw.mods.fml.common.registry.GameRegistry;
import emsenhuber.alfred.atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSoilPile extends Item{
	private String name = "soilPileItem";
	
	public ItemSoilPile(){
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
}
