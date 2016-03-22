package atomizer.items.tools;

import java.util.Set;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

public class ItemSilverAxe extends ItemTool {

	public static final String UNLOCALIZED_ITEM_NAME = "silverAxe";
	
	public ItemSilverAxe(float damageVsEntity, ToolMaterial toolMaterial, Set p_i45333_3_) {
		super(damageVsEntity, toolMaterial, p_i45333_3_);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
	}

}
