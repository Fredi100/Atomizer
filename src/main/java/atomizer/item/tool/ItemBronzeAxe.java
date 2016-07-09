package atomizer.item.tool;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzeAxe extends ItemAxe {

	public static final String REGISTRY_NAME = "bronzeAxe";
	
	public ItemBronzeAxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		setRegistryName(REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}

