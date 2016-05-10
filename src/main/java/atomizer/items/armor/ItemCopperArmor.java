package atomizer.items.armor;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCopperArmor extends ItemArmor{
	
	public static final String UNLOCALIZED_ITEM_NAME_CHEST = "copperChest";
	public static final String UNLOCALIZED_ITEM_NAME_HELMET = "copperHelmet";
	public static final String UNLOCALIZED_ITEM_NAME_LEGGINGS = "copperLeggings";
	public static final String UNLOCALIZED_ITEM_NAME_BOOTS = "copperBoots";

	public ItemCopperArmor(String unlocalizedName, ArmorMaterial material, int type) {
		super(material, 0, type);
		
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Constants.MODID + ":textures/armor/" + this.getArmorMaterial().name() + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
