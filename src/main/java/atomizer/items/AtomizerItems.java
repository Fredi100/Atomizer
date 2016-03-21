package atomizer.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Kümmert sich um das Erzeugen und Initialisieren der Items
 * 
 * @author Alfred Emsenhuber(Fredi100)
 */
public class AtomizerItems {
	
	public static Item wrenchItem;
	public static Item laser1Item;
	public static Item laser2Item;
	public static Item laser3Item;
	public static Item soilPileItem;
	public static Item stoneHammer;
	public static Item ironPlate;
	public static Item ironRaw;
	public static Item bronzeSword;
	
	public static Item chestBronze;
	public static Item leggingsBronze;
	public static Item helmetBronze;
	public static Item bootsBronze;
	
	public static ToolMaterial bronzeSwordMaterial = EnumHelper.addToolMaterial("bronzeSwordMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static ArmorMaterial bronzeArmorMaterial = EnumHelper.addArmorMaterial("bronzeSwordMaterial", 17, new int[]{2,5,5,2}, 15);
	
	/**
	 * Initialisiert alle Items die vom Mod eingebracht werden
	 */
	public static void init(){
		wrenchItem = new ItemWrench();
		laser1Item = new ItemLaser1();
		laser2Item = new ItemLaser2();
		laser3Item = new ItemLaser3();
		soilPileItem = new ItemSoilPile();
		stoneHammer = new ItemStoneHammer();
		ironPlate = new ItemIronPlate();
		bronzeSword = new ItemSwordBronze(bronzeSwordMaterial);
		
		/* Armor */
		
		chestBronze = new ItemBronzeChest(bronzeArmorMaterial, 1, 1);
		leggingsBronze = new ItemBronzeLeggings(bronzeArmorMaterial, 0, 0);
		helmetBronze = new ItemBronzeHelmet(bronzeArmorMaterial, 0, 0);
		bootsBronze = new ItemBronzeBoots(bronzeArmorMaterial, 0, 0);
		
	}
}
