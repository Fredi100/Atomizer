package atomizer.item.armor;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCopperArmor extends ItemArmor{
	
	public static final String REGISTRY_NAME_CHEST = "copperChest";
	public static final String REGISTRY_NAME_HELMET = "copperHelmet";
	public static final String REGISTRY_NAME_LEGGINGS = "copperLeggings";
	public static final String REGISTRY_NAME_BOOTS = "copperBoots";

	public ItemCopperArmor(String unlocalizedName, ArmorMaterial material, int type) {
		super(material, 0, type);
		setRegistryName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(Constants.MODID + ":" + unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Constants.MODID + ":textures/armor/" + this.getArmorMaterial().name() + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
