package atomizer.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSilverHoe extends ItemHoe {

	public static final String REGISTRY_NAME = "silverHoe";
	
	public ItemSilverHoe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
