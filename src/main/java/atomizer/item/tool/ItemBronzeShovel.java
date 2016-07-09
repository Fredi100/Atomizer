package atomizer.item.tool;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzeShovel extends ItemSpade {
	
	public static final String REGISTRY_NAME = "bronzeShovel";
	
	public ItemBronzeShovel(ToolMaterial toolMaterial) {
		super(toolMaterial);
		setRegistryName(REGISTRY_NAME);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
