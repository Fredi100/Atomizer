package atomizer.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;

public class ItemBronzeHelmet extends ItemArmor{
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeHelmet";
	
	public ItemBronzeHelmet(ArmorMaterial arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
