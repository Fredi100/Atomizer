package atomizer.item.tool;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSilverPickaxe extends ItemPickaxe {

	public static final String REGISTRY_NAME = "silverPickaxe";
	
	public ItemSilverPickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setRegistryName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
