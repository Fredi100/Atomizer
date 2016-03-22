package atomizer.items.armor;

import java.util.Set;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;


public class ItemSilverChest extends ItemArmor {

	public static final String UNLOCALIZED_ITEM_NAME = "silverChest";
	
	public ItemSilverChest(ArmorMaterial armorMaterial, int p_i45325_2_, int p_i45325_3_) {
		super(armorMaterial, p_i45325_2_, p_i45325_3_);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
	}

	
	
	

}
