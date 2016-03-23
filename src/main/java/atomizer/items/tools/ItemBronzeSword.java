package atomizer.items.tools;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemBronzeSword extends ItemSword{
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeSword";

	public ItemBronzeSword(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		this.setTextureName(Constants.MODID + ":" + UNLOCALIZED_ITEM_NAME);
		this.setCreativeTab(CreativeTabs.tabCombat);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
	
}
