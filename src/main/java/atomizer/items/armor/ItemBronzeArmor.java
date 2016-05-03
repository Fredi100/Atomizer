package atomizer.items.armor;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO Muss noch auf die neue Minecraft Version upgedatet werden
public class ItemBronzeArmor extends ItemArmor{
	
	public String unlocalizedName;

	public ItemBronzeArmor(String unlocalizedName, ArmorMaterial material, int type) {
		super(material, 0, type);
		
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.unlocalizedName = unlocalizedName;
		this.setUnlocalizedName(unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Constants.MODID + ":textures/armor/" + this.getArmorMaterial().name() + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
