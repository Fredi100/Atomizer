package atomizer.items;

import java.util.ArrayList;
import java.util.TreeMap;

import atomizer.items.armor.ItemBronzeArmor;
import atomizer.items.armor.ItemCopperArmor;
import atomizer.items.armor.ItemSilverArmor;
import atomizer.items.armor.ItemZincArmor;
import atomizer.items.tools.ItemBronzeAxe;
import atomizer.items.tools.ItemBronzeHoe;
import atomizer.items.tools.ItemBronzePickaxe;
import atomizer.items.tools.ItemBronzeShovel;
import atomizer.items.tools.ItemBronzeSword;
import atomizer.items.tools.ItemCopperAxe;
import atomizer.items.tools.ItemCopperHoe;
import atomizer.items.tools.ItemCopperPickaxe;
import atomizer.items.tools.ItemCopperShovel;
import atomizer.items.tools.ItemCopperSword;
import atomizer.items.tools.ItemSilverAxe;
import atomizer.items.tools.ItemSilverHoe;
import atomizer.items.tools.ItemSilverPickaxe;
import atomizer.items.tools.ItemSilverShovel;
import atomizer.items.tools.ItemSilverSword;
import atomizer.items.tools.ItemZincAxe;
import atomizer.items.tools.ItemZincHoe;
import atomizer.items.tools.ItemZincPickaxe;
import atomizer.items.tools.ItemZincShovel;
import atomizer.items.tools.ItemZincSword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * K�mmert sich um das Erzeugen und Initialisieren der Items
 * 
 * @author Alfred Emsenhuber(Fredi100)
 */
public class AtomizerItems {
	
	public static TreeMap<String,Item> items;
	
	/* Bronze */
	public static ArmorMaterial bronzeArmorMaterial = EnumHelper.addArmorMaterial("bronzeArmorMaterial", 17, new int[]{2,5,5,2}, 15);
	public static ToolMaterial bronzeToolMaterial = EnumHelper.addToolMaterial("bronzeToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	
	/* Copper */
	public static ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("copperArmorMaterial", 12, new int[]{1,4,4,2}, 20);
	public static ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copperToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static Item copperIngot;
	public static Item copperPlate;
	public static Item copperRaw;
	
	/* Zinc */
	public static ArmorMaterial zincArmorMaterial = EnumHelper.addArmorMaterial("zincArmorMaterial", 10, new int[]{1,3,4,1}, 8);
	public static ToolMaterial zincToolMaterial = EnumHelper.addToolMaterial("zincToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static Item zincIngot;
	public static Item zincPlate;
	public static Item zincRaw;
	
	/* Iron */
	public static Item ironRaw;
	public static Item ironPlate;
	
	/* Silver */
	public static ArmorMaterial silverArmorMaterial = EnumHelper.addArmorMaterial("silverArmorMaterial", 10, new int[]{2,5,4,2}, 25);
	public static ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("silverToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static Item silverIngot;
	public static Item silverPlate;
	public static Item silverRaw;
	
	/* Gold */
	public static Item goldPlate;
	public static Item goldRaw;
	
	
	/**
	 * Initialisiert alle Items die vom Mod eingebracht werden
	 */
	public static void init(){
		items = new TreeMap<String,Item>();
		items.put(ItemWrench.UNLOCALIZED_ITEM_NAME,new ItemWrench());
		items.put(ItemLaser1.UNLOCALIZED_ITEM_NAME,new ItemLaser1());
		items.put(ItemLaser2.UNLOCALIZED_ITEM_NAME,new ItemLaser2());
		items.put(ItemLaser3.UNLOCALIZED_ITEM_NAME,new ItemLaser3());
		items.put(ItemSoilPile.UNLOCALIZED_ITEM_NAME,new ItemSoilPile());
		items.put(ItemStoneHammer.UNLOCALIZED_ITEM_NAME,new ItemStoneHammer());
		items.put(ItemDirtRaw.UNLOCALIZED_ITEM_NAME,new ItemDirtRaw());
		items.put(ItemFlour.UNLOCALIZED_ITEM_NAME,new ItemFlour());
		items.put(ItemGlassShard.UNLOCALIZED_ITEM_NAME,new ItemGlassShard());
		items.put(ItemGravelRaw.UNLOCALIZED_ITEM_NAME,new ItemGravelRaw());
		items.put(ItemIceShard.UNLOCALIZED_ITEM_NAME,new ItemIceShard());
		items.put(ItemNetherRaw.UNLOCALIZED_ITEM_NAME,new ItemNetherRaw());
		items.put(ItemObsidianRaw.UNLOCALIZED_ITEM_NAME,new ItemObsidianRaw());
		items.put(ItemSandRaw.UNLOCALIZED_ITEM_NAME,new ItemSandRaw());
		items.put(ItemStoneIngot.UNLOCALIZED_ITEM_NAME,new ItemStoneIngot());
		items.put(ItemStoneRaw.UNLOCALIZED_ITEM_NAME,new ItemStoneRaw());
		items.put(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME,new ItemWoodenPlank());
		
		/* Bronze */
		items.put("bronzeHelmet",new ItemBronzeArmor("bronzeHelmet",bronzeArmorMaterial,0));
		items.put("bronzeChest",new ItemBronzeArmor("bronzeChest",bronzeArmorMaterial,1));
		items.put("bronzeLeggings",new ItemBronzeArmor("bronzeLeggings",bronzeArmorMaterial,2));
		items.put("bronzeBoots",new ItemBronzeArmor("bronzeBoots",bronzeArmorMaterial,3));
		items.put("bronzeAxe", new ItemBronzeAxe(bronzeToolMaterial));
		items.put("bronzePickaxe", new ItemBronzePickaxe(bronzeToolMaterial));
		items.put("bronzeShovel", new ItemBronzeShovel(bronzeToolMaterial));
		items.put("bronzeHoe", new ItemBronzeHoe(bronzeToolMaterial));
		items.put("bronzeSword", new ItemBronzeSword(bronzeToolMaterial));
		items.put("bronzeIngot", new ItemBronzeIngot());
		items.put("bronzePlate", new ItemBronzePlate());
		
		/* Copper */
		items.put("copperHelmet",new ItemCopperArmor("copperHelmet",copperArmorMaterial,0));
		items.put("copperChest",new ItemCopperArmor("copperChest",copperArmorMaterial,1));
		items.put("copperLeggings",new ItemCopperArmor("copperLeggings",copperArmorMaterial,2));
		items.put("copperBoots",new ItemCopperArmor("copperBoots",copperArmorMaterial,3));
		items.put("copperAxe", new ItemCopperAxe(copperToolMaterial));
		items.put("copperPickaxe", new ItemCopperPickaxe(copperToolMaterial));
		items.put("copperShovel", new ItemCopperShovel(copperToolMaterial));
		items.put("copperHoe", new ItemCopperHoe(copperToolMaterial));
		items.put("copperSword", new ItemCopperSword(copperToolMaterial));
		items.put("copperIngot", new ItemCopperIngot());
		items.put("copperPlate", new ItemCopperPlate());
		items.put("copperRaw", new ItemCopperRaw());
		
		/* Silver */
		items.put("silverHelmet",new ItemSilverArmor("silverHelmet",silverArmorMaterial,0));
		items.put("silverChest",new ItemSilverArmor("silverChest",silverArmorMaterial,1));
		items.put("silverLeggings",new ItemSilverArmor("silverLeggings",silverArmorMaterial,2));
		items.put("silverBoots",new ItemSilverArmor("silverBoots",silverArmorMaterial,3));
		items.put("silverAxe", new ItemSilverAxe(silverToolMaterial));
		items.put("silverPickaxe", new ItemSilverPickaxe(silverToolMaterial));
		items.put("silverShovel", new ItemSilverShovel(silverToolMaterial));
		items.put("silverHoe", new ItemSilverHoe(silverToolMaterial));
		items.put("silverSword", new ItemSilverSword(silverToolMaterial));
		items.put("silverIngot", new ItemSilverIngot());
		items.put("silverPlate", new ItemSilverPlate());
		items.put("silverRaw", new ItemSilverRaw());
		
		/* zinc */
		items.put("zincHelmet",new ItemZincArmor("zincHelmet",zincArmorMaterial,0));
		items.put("zincChest",new ItemZincArmor("zincChest",zincArmorMaterial,1));
		items.put("zincLeggings",new ItemZincArmor("zincLeggings",zincArmorMaterial,2));
		items.put("zincBoots",new ItemZincArmor("zincBoots",zincArmorMaterial,3));
		items.put("zincAxe", new ItemZincAxe(silverToolMaterial));
		items.put("zincPickaxe", new ItemZincPickaxe(silverToolMaterial));
		items.put("zincShovel", new ItemZincShovel(silverToolMaterial));
		items.put("zincHoe", new ItemZincHoe(silverToolMaterial));
		items.put("zincSword", new ItemZincSword(silverToolMaterial));
		items.put("zincIngot", new ItemZincIngot());
		items.put("zincPlate", new ItemZincPlate());
		items.put("zincRaw", new ItemZincRaw());
		
		/* iron */
		items.put("ironRaw", new ItemIronRaw());
		ironPlate = new ItemIronPlate();
		
		/* gold */
		goldRaw = new ItemGoldRaw();
		goldPlate = new ItemGoldPlate();
	}
}
