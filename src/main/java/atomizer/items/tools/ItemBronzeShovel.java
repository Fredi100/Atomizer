package atomizer.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzeShovel extends ItemSpade {
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeShovel";
	
	public ItemBronzeShovel(ToolMaterial toolMaterial) {
		super(toolMaterial);
		
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
