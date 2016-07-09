package atomizer.item.tool;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzePickaxe extends ItemPickaxe {

	public static final String REGISTRY_NAME = "bronzePickaxe";
	
	public ItemBronzePickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setRegistryName(REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
