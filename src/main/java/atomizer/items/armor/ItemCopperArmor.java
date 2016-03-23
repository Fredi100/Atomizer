package atomizer.items.armor;

import atomizer.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCopperArmor extends ItemArmor{
	
	public String unlocalizedName;

	public ItemCopperArmor(String unlocalizedName, ArmorMaterial material, int type) {
		super(material, 0, type);
		
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.unlocalizedName = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Constants.MODID + ":" + unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Constants.MODID + ":textures/armor/" + this.getArmorMaterial().name() + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
