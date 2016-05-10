package atomizer.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBronzeSword extends ItemSword{
	
	public static final String REGISTRY_NAME = "bronzeSword";

	public ItemBronzeSword(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(REGISTRY_NAME);
		this.setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(this, REGISTRY_NAME);
	}
}
