package atomizer.items.tools;

import java.util.Set;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemTool;

public class ItemBronzeHoe extends ItemHoe {

	public static final String UNLOCALIZED_ITEM_NAME = "bronzeHoe";
	
	public ItemBronzeHoe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}

}
