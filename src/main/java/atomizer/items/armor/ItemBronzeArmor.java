package atomizer.items.armor;

import atomizer.lib.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO Muss noch auf die neue Minecraft Version upgedatet werden
public class ItemBronzeArmor extends ItemArmor{
	
	public static final String REGISTRY_NAME_CHEST = "bronzeChest";
	public static final String REGISTRY_NAME_HELMET = "bronzeHelmet";
	public static final String REGISTRY_NAME_LEGGINGS = "bronzeLeggings";
	public static final String REGISTRY_NAME_BOOTS = "bronzeBoots";

	public ItemBronzeArmor(String unlocalizedName, ArmorMaterial material, int type) {
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
