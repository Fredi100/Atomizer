package atomizer.items.tools;

import java.util.Set;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;

public class ItemTinShovel extends ItemSpade {
	
	public static final String UNLOCALIZED_ITEM_NAME = "tinShovel";

	public ItemTinShovel(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}

}
