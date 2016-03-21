package atomizer.items;

import net.minecraft.item.ItemArmor;

public class ItemBronzeChest extends ItemArmor{
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeChest";

	public ItemBronzeChest(ArmorMaterial arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		
		this.setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
	}
}
