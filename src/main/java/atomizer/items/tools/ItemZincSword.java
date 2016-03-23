package atomizer.items.tools;

import java.util.Set;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

public class ItemZincSword extends ItemSword {

	public static final String UNLOCALIZED_ITEM_NAME = "zincSword";
	
	public ItemZincSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}

}