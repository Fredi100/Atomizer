package atomizer.items.armor;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTinArmor extends ItemArmor{
	
	public static final String REGISTRY_NAME_CHEST = "tinChest";
	public static final String REGISTRY_NAME_HELMET = "tinHelmet";
	public static final String REGISTRY_NAME_LEGGINGS = "tinLeggings";
	public static final String REGISTRY_NAME_BOOTS = "tinBoots";

	public ItemTinArmor(String unlocalizedName, ArmorMaterial material, int type) {
		super(material, 0, type);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(Constants.MODID + ":" + unlocalizedName);
		setRegistryName(unlocalizedName);
		GameRegistry.registerItem(this, unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return Constants.MODID + ":textures/armor/" + this.getArmorMaterial().name() + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
