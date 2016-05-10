package atomizer.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSilverSword extends ItemSword {

	public static final String REGISTRY_NAME = "silverSword";
	
	public ItemSilverSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}