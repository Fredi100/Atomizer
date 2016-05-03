package atomizer.items.tools;

import java.util.Set;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;

public class ItemCopperPickaxe extends ItemPickaxe {

	public static final String UNLOCALIZED_ITEM_NAME = "copperPickaxe";
	
	public ItemCopperPickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		setTextureName(Constants.MODID+":"+UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}

}