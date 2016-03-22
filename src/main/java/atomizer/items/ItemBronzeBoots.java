package atomizer.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor;

public class ItemBronzeBoots extends ItemArmor{
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeBoots";

	public ItemBronzeBoots(ArmorMaterial arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		
		this.setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		GameRegistry.registerItem(this, UNLOCALIZED_ITEM_NAME);
	}

}
