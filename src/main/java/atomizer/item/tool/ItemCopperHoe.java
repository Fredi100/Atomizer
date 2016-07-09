package atomizer.item.tool;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCopperHoe extends ItemHoe {

	public static final String REGISTRY_NAME = "copperHoe";
	
	public ItemCopperHoe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setRegistryName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
