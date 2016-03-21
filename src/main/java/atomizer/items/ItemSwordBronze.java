package atomizer.items;

import atomizer.Atomizer;
import atomizer.lib.Constants;
import net.minecraft.item.ItemSword;

public class ItemSwordBronze extends ItemSword{
	
	public static final String UNLOCALIZED_ITEM_NAME = "bronzeSword";

	public ItemSwordBronze(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(UNLOCALIZED_ITEM_NAME);
		this.setTextureName(Constants.MODID + ":" + UNLOCALIZED_ITEM_NAME);
		this.setCreativeTab(Atomizer.tabAtomizer);
	}
	
}
