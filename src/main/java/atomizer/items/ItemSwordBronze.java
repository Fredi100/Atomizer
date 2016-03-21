package atomizer.items;

import atomizer.lib.Constants;
import net.minecraft.item.ItemSword;

public class ItemSwordBronze extends ItemSword{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "bronzeSword";

	public ItemSwordBronze(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(UNLOCALIZED_BLOCK_NAME);
		this.setTextureName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);
		this.setCreativeTab(arg0);
	}
	
}
