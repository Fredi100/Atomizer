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
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
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
		items.put(ItemWrench.REGISTRY_NAME,new ItemWrench());
		items.put(ItemLaser1.REGISTRY_NAME,new ItemLaser1());
		items.put(ItemLaser2.REGISTRY_NAME,new ItemLaser2());
		items.put(ItemLaser3.REGISTRY_NAME,new ItemLaser3());
		items.put(ItemSoilPile.REGISTRY_NAME,new ItemSoilPile());
		items.put(ItemStoneHammer.REGISTRY_NAME,new ItemStoneHammer());
		items.put(ItemDirtRaw.REGISTRY_NAME,new ItemDirtRaw());
		items.put(ItemFlour.REGISTRY_NAME,new ItemFlour());
		items.put(ItemGlassShard.REGISTRY_NAME,new ItemGlassShard());
		items.put(ItemGravelRaw.REGISTRY_NAME,new ItemGravelRaw());
		items.put(ItemIceShard.REGISTRY_NAME,new ItemIceShard());
		items.put(ItemNetherRaw.REGISTRY_NAME,new ItemNetherRaw());
		items.put(ItemObsidianRaw.REGISTRY_NAME,new ItemObsidianRaw());
		items.put(ItemSandRaw.REGISTRY_NAME,new ItemSandRaw());
		items.put(ItemStoneIngot.REGISTRY_NAME,new ItemStoneIngot());
		items.put(ItemStoneRaw.REGISTRY_NAME,new ItemStoneRaw());
		items.put(ItemWoodenPlank.REGISTRY_NAME,new ItemWoodenPlank());
		
		/* Bronze */
		items.put(ItemBronzeArmor.REGISTRY_NAME_HELMET,new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_HELMET,bronzeArmorMaterial,0));
		items.put(ItemBronzeArmor.REGISTRY_NAME_CHEST,new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_CHEST,bronzeArmorMaterial,1));
		items.put(ItemBronzeArmor.REGISTRY_NAME_LEGGINGS,new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_LEGGINGS,bronzeArmorMaterial,2));
		items.put(ItemBronzeArmor.REGISTRY_NAME_BOOTS,new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_BOOTS,bronzeArmorMaterial,3));
		items.put(ItemBronzeAxe.REGISTRY_NAME, new ItemBronzeAxe(bronzeToolMaterial));
		items.put(ItemBronzePickaxe.REGISTRY_NAME, new ItemBronzePickaxe(bronzeToolMaterial));
		items.put(ItemBronzeShovel.REGISTRY_NAME, new ItemBronzeShovel(bronzeToolMaterial));
		items.put(ItemBronzeHoe.REGISTRY_NAME, new ItemBronzeHoe(bronzeToolMaterial));
		items.put(ItemBronzeSword.REGISTRY_NAME, new ItemBronzeSword(bronzeToolMaterial));
		items.put(ItemBronzeIngot.REGISTRY_NAME, new ItemBronzeIngot());
		items.put(ItemBronzePlate.REGISTRY_NAME, new ItemBronzePlate());
		
		/* Copper */
		items.put(ItemCopperArmor.REGISTRY_NAME_HELMET,new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_HELMET,copperArmorMaterial,0));
		items.put(ItemCopperArmor.REGISTRY_NAME_CHEST,new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_CHEST,copperArmorMaterial,1));
		items.put(ItemCopperArmor.REGISTRY_NAME_LEGGINGS,new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_LEGGINGS,copperArmorMaterial,2));
		items.put(ItemCopperArmor.REGISTRY_NAME_BOOTS,new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_BOOTS,copperArmorMaterial,3));
		items.put(ItemCopperAxe.REGISTRY_NAME, new ItemCopperAxe(copperToolMaterial));
		items.put(ItemCopperPickaxe.REGISTRY_NAME, new ItemCopperPickaxe(copperToolMaterial));
		items.put(ItemCopperShovel.REGISTRY_NAME, new ItemCopperShovel(copperToolMaterial));
		items.put(ItemCopperHoe.REGISTRY_NAME, new ItemCopperHoe(copperToolMaterial));
		items.put(ItemCopperSword.REGISTRY_NAME, new ItemCopperSword(copperToolMaterial));
		items.put(ItemCopperIngot.REGISTRY_NAME, new ItemCopperIngot());
		items.put(ItemCopperPlate.REGISTRY_NAME, new ItemCopperPlate());
		items.put(ItemCopperRaw.REGISTRY_NAME, new ItemCopperRaw());
		
		/* Silver */
		items.put(ItemSilverArmor.REGISTRY_NAME_HELMET,new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_HELMET,silverArmorMaterial,0));
		items.put(ItemSilverArmor.REGISTRY_NAME_CHEST,new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_CHEST,silverArmorMaterial,1));
		items.put(ItemSilverArmor.REGISTRY_NAME_LEGGINGS,new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_LEGGINGS,silverArmorMaterial,2));
		items.put(ItemSilverArmor.REGISTRY_NAME_BOOTS,new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_BOOTS,silverArmorMaterial,3));
		items.put(ItemSilverAxe.REGISTRY_NAME, new ItemSilverAxe(silverToolMaterial));
		items.put(ItemSilverPickaxe.REGISTRY_NAME, new ItemSilverPickaxe(silverToolMaterial));
		items.put(ItemSilverShovel.REGISTRY_NAME, new ItemSilverShovel(silverToolMaterial));
		items.put(ItemSilverHoe.REGISTRY_NAME, new ItemSilverHoe(silverToolMaterial));
		items.put(ItemSilverSword.REGISTRY_NAME, new ItemSilverSword(silverToolMaterial));
		items.put(ItemSilverIngot.REGISTRY_NAME, new ItemSilverIngot());
		items.put(ItemSilverPlate.REGISTRY_NAME, new ItemSilverPlate());
		items.put(ItemSilverRaw.REGISTRY_NAME, new ItemSilverRaw());
		
		/* Tin */
		items.put(ItemTinArmor.REGISTRY_NAME_HELMET,new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_HELMET,tinArmorMaterial,0));
		items.put(ItemTinArmor.REGISTRY_NAME_CHEST,new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_CHEST,tinArmorMaterial,1));
		items.put(ItemTinArmor.REGISTRY_NAME_LEGGINGS,new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_LEGGINGS,tinArmorMaterial,2));
		items.put(ItemTinArmor.REGISTRY_NAME_BOOTS,new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_BOOTS,tinArmorMaterial,3));
		items.put(ItemTinAxe.REGISTRY_NAME, new ItemTinAxe(tinToolMaterial));
		items.put(ItemTinPickaxe.REGISTRY_NAME, new ItemTinPickaxe(tinToolMaterial));
		items.put(ItemTinShovel.REGISTRY_NAME, new ItemTinShovel(tinToolMaterial));
		items.put(ItemTinHoe.REGISTRY_NAME, new ItemTinHoe(tinToolMaterial));
		items.put(ItemTinSword.REGISTRY_NAME, new ItemTinSword(tinToolMaterial));
		items.put(ItemTinIngot.REGISTRY_NAME, new ItemTinIngot());
		items.put(ItemTinPlate.REGISTRY_NAME, new ItemTinPlate());
		items.put(ItemTinRaw.REGISTRY_NAME, new ItemTinRaw());
		
		/* iron */
		items.put(ItemIronRaw.REGISTRY_NAME, new ItemIronRaw());
		items.put(ItemIronPlate.REGISTRY_NAME,new ItemIronPlate());
		
		/* gold */
		items.put(ItemGoldRaw.REGISTRY_NAME,new ItemGoldRaw());
		items.put(ItemGoldPlate.REGISTRY_NAME, new ItemGoldPlate());
	}
	
	public static void registerItemModels(){
		// TODO In die Proxy Klassen verlagern
		System.out.println("Atomizer is registering its models now!");
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl;
		
		for(Item i : items.values()){
			mrl = new ModelResourceLocation(i.getRegistryName(), "inventory");
			renderItem.getItemModelMesher().register(i, 0, mrl);
			//ModelLoader.setCustomModelResourceLocation(i, 0, mrl);
			System.out.println("Registered: " + i.getUnlocalizedName());
		}
	
	}
}
