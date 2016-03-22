package atomizer.items.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;

public class ItemBronzeLeggings extends ItemArmor{
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeLeggings";
	
	public ItemBronzeLeggings(ArmorMaterial arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}
}
