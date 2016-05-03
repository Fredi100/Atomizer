package atomizer.items;

import java.util.TreeMap;

import atomizer.items.armor.ItemBronzeArmor;
import atomizer.items.armor.ItemCopperArmor;
import atomizer.items.armor.ItemSilverArmor;
import atomizer.items.armor.ItemTinArmor;
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
import atomizer.items.tools.ItemTinAxe;
import atomizer.items.tools.ItemTinHoe;
import atomizer.items.tools.ItemTinPickaxe;
import atomizer.items.tools.ItemTinShovel;
import atomizer.items.tools.ItemTinSword;
import atomizer.lib.Constants;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Kümmert sich um das Erzeugen und Initialisieren der Items
 * 
 * @author Alfred Emsenhuber(Fredi100)
 */
public class AtomizerItems {
	
	public static TreeMap<String,Item> items;
	
	/* Bronze */
	public static ArmorMaterial bronzeArmorMaterial = EnumHelper.addArmorMaterial("bronzeArmorMaterial", Constants.MODID + ":bronzeArmorMaterial" , 17, new int[]{2,5,5,2}, 15);
	public static ToolMaterial bronzeToolMaterial = EnumHelper.addToolMaterial("bronzeToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	
	
	/* Copper */
	public static ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("copperArmorMaterial", Constants.MODID + ":copperArmorMaterial", 12, new int[]{1,4,4,2}, 20);
	public static ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copperToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static Item copperIngot;
	public static Item copperPlate;
	public static Item copperRaw;
	
	/* Tin */
	public static ArmorMaterial tinArmorMaterial = EnumHelper.addArmorMaterial("tinArmorMaterial", Constants.MODID + ":tinArmorMaterial", 10, new int[]{1,3,4,1}, 8);
	public static ToolMaterial tinToolMaterial = EnumHelper.addToolMaterial("tinToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static Item tinIngot;
	public static Item tinPlate;
	public static Item tinRaw;
	
	/* Iron */
	
	/* Silver */
	public static ArmorMaterial silverArmorMaterial = EnumHelper.addArmorMaterial("silverArmorMaterial", Constants.MODID + ":silverArmorMaterial", 10, new int[]{2,5,4,2}, 25);
	public static ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("silverToolMaterial", 3, 1000, 15.0F, 4.0F, 30);
	public static Item silverIngot;
	public static Item silverPlate;
	public static Item silverRaw;
	
	
	
	/**
	 * Initialisiert alle Items die vom Mod eingebracht werden
	 */
	public static void init(){
		System.out.println("Atomizer is initializing its items now!");
		
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
		
		/* Tin */
		items.put("tinHelmet",new ItemTinArmor("tinHelmet",tinArmorMaterial,0));
		items.put("tinChest",new ItemTinArmor("tinChest",tinArmorMaterial,1));
		items.put("tinLeggings",new ItemTinArmor("tinLeggings",tinArmorMaterial,2));
		items.put("tinBoots",new ItemTinArmor("tinBoots",tinArmorMaterial,3));
		items.put("tinAxe", new ItemTinAxe(tinToolMaterial));
		items.put("tinPickaxe", new ItemTinPickaxe(tinToolMaterial));
		items.put("tinShovel", new ItemTinShovel(tinToolMaterial));
		items.put("tinHoe", new ItemTinHoe(tinToolMaterial));
		items.put("tinSword", new ItemTinSword(tinToolMaterial));
		items.put("tinIngot", new ItemTinIngot());
		items.put("tinPlate", new ItemTinPlate());
		items.put("tinRaw", new ItemTinRaw());
		
		/* iron */
		items.put("ironRaw", new ItemIronRaw());
		items.put("ironPlate",new ItemIronPlate());
		
		/* gold */
		items.put("goldRaw",new ItemGoldRaw());
		items.put("goldPlate", new ItemGoldPlate());
	}
}
