package atomizer.item.tool;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTinSword extends ItemSword {

	public static final String REGISTRY_NAME = "tinSword";
	
	public ItemTinSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setRegistryName(REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}