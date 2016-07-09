package atomizer.item;

import java.util.ArrayList;
import java.util.TreeMap;

import atomizer.item.armor.ItemBronzeArmor;
import atomizer.item.armor.ItemCopperArmor;
import atomizer.item.armor.ItemSilverArmor;
import atomizer.item.armor.ItemTinArmor;
import atomizer.item.tool.ItemBronzeAxe;
import atomizer.item.tool.ItemBronzeHoe;
import atomizer.item.tool.ItemBronzePickaxe;
import atomizer.item.tool.ItemBronzeShovel;
import atomizer.item.tool.ItemBronzeSword;
import atomizer.item.tool.ItemCopperAxe;
import atomizer.item.tool.ItemCopperHoe;
import atomizer.item.tool.ItemCopperPickaxe;
import atomizer.item.tool.ItemCopperShovel;
import atomizer.item.tool.ItemCopperSword;
import atomizer.item.tool.ItemSilverAxe;
import atomizer.item.tool.ItemSilverHoe;
import atomizer.item.tool.ItemSilverPickaxe;
import atomizer.item.tool.ItemSilverShovel;
import atomizer.item.tool.ItemSilverSword;
import atomizer.item.tool.ItemTinAxe;
import atomizer.item.tool.ItemTinHoe;
import atomizer.item.tool.ItemTinPickaxe;
import atomizer.item.tool.ItemTinShovel;
import atomizer.item.tool.ItemTinSword;
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

	private static ArrayList<Item> items;

	/* Materials */

	public static ArmorMaterial bronzeArmorMaterial = EnumHelper.addArmorMaterial("bronzeArmorMaterial",
			Constants.MODID + ":bronzeArmorMaterial", 17, new int[] { 2, 5, 5, 2 }, 15);
	public static ToolMaterial bronzeToolMaterial = EnumHelper.addToolMaterial("bronzeToolMaterial", 3, 1000, 15.0F,
			4.0F, 30);
	public static ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("copperArmorMaterial",
			Constants.MODID + ":copperArmorMaterial", 12, new int[] { 1, 4, 4, 2 }, 20);
	public static ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copperToolMaterial", 3, 1000, 15.0F,
			4.0F, 30);
	public static ArmorMaterial tinArmorMaterial = EnumHelper.addArmorMaterial("tinArmorMaterial",
			Constants.MODID + ":tinArmorMaterial", 10, new int[] { 1, 3, 4, 1 }, 8);
	public static ToolMaterial tinToolMaterial = EnumHelper.addToolMaterial("tinToolMaterial", 3, 1000, 15.0F, 4.0F,
			30);
	public static ArmorMaterial silverArmorMaterial = EnumHelper.addArmorMaterial("silverArmorMaterial",
			Constants.MODID + ":silverArmorMaterial", 10, new int[] { 2, 5, 4, 2 }, 25);
	public static ToolMaterial silverToolMaterial = EnumHelper.addToolMaterial("silverToolMaterial", 3, 1000, 15.0F,
			4.0F, 30);

	/* Items */

	public static final int IRON_RAW = 0;
	public static final int GOLD_RAW = 1;
	public static final int COPPER_RAW = 2;
	public static final int TIN_RAW = 3;
	public static final int SILVER_RAW = 4;
	public static final int IRON_PLATE = 5;
	public static final int GOLD_PLATE = 6;
	public static final int COPPER_PLATE = 7;
	public static final int TIN_PLATE = 8;
	public static final int SILVER_PLATE = 9;
	public static final int BRONZE_PLATE = 10;
	public static final int COPPER_INGOT = 11;
	public static final int TIN_INGOT = 12;
	public static final int SILVER_INGOT = 13;
	public static final int BRONZE_INGOT = 14;
	public static final int BRONZE_SWORD = 15;
	public static final int BRONZE_PICKAXE = 16;
	public static final int BRONZE_SHOVEL = 17;
	public static final int BRONZE_AXE = 18;
	public static final int BRONZE_HOE = 19;
	public static final int BRONZE_HELMET = 20;
	public static final int BRONZE_CHEST = 21;
	public static final int BRONZE_LEGGINGS = 22;
	public static final int BRONZE_BOOTS = 23;
	public static final int COPPER_SWORD = 24;
	public static final int COPPER_PICKAXE = 25;
	public static final int COPPER_SHOVEL = 26;
	public static final int COPPER_AXE = 27;
	public static final int COPPER_HOE = 28;
	public static final int COPPER_HELMET = 29;
	public static final int COPPER_CHEST = 30;
	public static final int COPPER_LEGGINGS = 31;
	public static final int COPPER_BOOTS = 32;
	public static final int SILVER_SWORD = 33;
	public static final int SILVER_PICKAXE = 34;
	public static final int SILVER_SHOVEL = 35;
	public static final int SILVER_AXE = 36;
	public static final int SILVER_HOE = 37;
	public static final int SILVER_HELMET = 38;
	public static final int SILVER_CHEST = 39;
	public static final int SILVER_LEGGINGS = 40;
	public static final int SILVER_BOOTS = 41;
	public static final int TIN_SWORD = 42;
	public static final int TIN_PICKAXE = 43;
	public static final int TIN_SHOVEL = 44;
	public static final int TIN_AXE = 45;
	public static final int TIN_HOE = 46;
	public static final int TIN_HELMET = 47;
	public static final int TIN_CHEST = 48;
	public static final int TIN_LEGGINGS = 49;
	public static final int TIN_BOOTS = 50;
	public static final int WRENCH = 51;
	public static final int LASER1 = 52;
	public static final int LASER2 = 53;
	public static final int LASER3 = 54;
	public static final int SOIL_PILE = 55;
	public static final int STONE_HAMMER = 56;
	public static final int DIRT_RAW = 57;
	public static final int FLOUR = 58;
	public static final int GLASS_SHARD = 59;
	public static final int GRAVEL_RAW = 60;
	public static final int ICE_SHARD = 61;
	public static final int NETHER_RAW = 62;
	public static final int OBSIDIAN_RAW = 63;
	public static final int SAND_RAW = 64;
	public static final int STONE_INGOT = 65;
	public static final int STONE_RAW = 66;
	public static final int WOODEN_PLANK = 67;

	/**
	 * Initialisiert alle Items die vom Mod eingebracht werden
	 */
	public static void init() {
		System.out.println("Atomizer is initializing its items now!");

		items = new ArrayList<Item>(WOODEN_PLANK+1);

		items.add(IRON_RAW, new ItemIronRaw());
		items.add(GOLD_RAW, new ItemGoldRaw());
		items.add(COPPER_RAW, new ItemCopperRaw());
		items.add(TIN_RAW, new ItemTinRaw());
		items.add(SILVER_RAW, new ItemSilverRaw());
		items.add(IRON_PLATE, new ItemIronPlate());
		items.add(GOLD_PLATE, new ItemGoldPlate());
		items.add(COPPER_PLATE, new ItemCopperPlate());
		items.add(TIN_PLATE, new ItemTinPlate());
		items.add(SILVER_PLATE, new ItemSilverPlate());
		items.add(BRONZE_PLATE, new ItemBronzePlate());
		items.add(COPPER_INGOT, new ItemCopperIngot());
		items.add(TIN_INGOT, new ItemTinIngot());
		items.add(SILVER_INGOT, new ItemSilverIngot());
		items.add(BRONZE_INGOT, new ItemBronzeIngot());
		items.add(BRONZE_SWORD, new ItemBronzeSword(bronzeToolMaterial));
		items.add(BRONZE_PICKAXE, new ItemBronzePickaxe(bronzeToolMaterial));
		items.add(BRONZE_SHOVEL, new ItemBronzeShovel(bronzeToolMaterial));
		items.add(BRONZE_AXE, new ItemBronzeAxe(bronzeToolMaterial));
		items.add(BRONZE_HOE, new ItemBronzeHoe(bronzeToolMaterial));
		items.add(BRONZE_HELMET, new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_HELMET, bronzeArmorMaterial, 0));
		items.add(BRONZE_CHEST, new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_CHEST, bronzeArmorMaterial, 1));
		items.add(BRONZE_LEGGINGS, new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_LEGGINGS, bronzeArmorMaterial, 2));
		items.add(BRONZE_BOOTS, new ItemBronzeArmor(ItemBronzeArmor.REGISTRY_NAME_BOOTS, bronzeArmorMaterial, 3));
		items.add(COPPER_SWORD, new ItemCopperSword(copperToolMaterial));
		items.add(COPPER_PICKAXE, new ItemCopperPickaxe(copperToolMaterial));
		items.add(COPPER_SHOVEL, new ItemCopperShovel(copperToolMaterial));
		items.add(COPPER_AXE, new ItemCopperAxe(copperToolMaterial));
		items.add(COPPER_HOE, new ItemCopperHoe(copperToolMaterial));
		items.add(COPPER_HELMET, new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_HELMET, copperArmorMaterial, 0));
		items.add(COPPER_CHEST, new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_CHEST, copperArmorMaterial, 1));
		items.add(COPPER_LEGGINGS, new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_LEGGINGS, copperArmorMaterial, 2));
		items.add(COPPER_BOOTS, new ItemCopperArmor(ItemCopperArmor.REGISTRY_NAME_BOOTS, copperArmorMaterial, 3));
		items.add(SILVER_SWORD, new ItemSilverSword(silverToolMaterial));
		items.add(SILVER_PICKAXE, new ItemSilverPickaxe(silverToolMaterial));
		items.add(SILVER_SHOVEL, new ItemSilverShovel(silverToolMaterial));
		items.add(SILVER_AXE, new ItemSilverAxe(silverToolMaterial));
		items.add(SILVER_HOE, new ItemSilverHoe(silverToolMaterial));
		items.add(SILVER_HELMET, new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_HELMET, silverArmorMaterial, 0));
		items.add(SILVER_CHEST, new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_CHEST, silverArmorMaterial, 1));
		items.add(SILVER_LEGGINGS, new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_LEGGINGS, silverArmorMaterial, 2));
		items.add(SILVER_BOOTS, new ItemSilverArmor(ItemSilverArmor.REGISTRY_NAME_BOOTS, silverArmorMaterial, 3));
		items.add(TIN_SWORD, new ItemTinSword(tinToolMaterial));
		items.add(TIN_PICKAXE, new ItemTinPickaxe(tinToolMaterial));
		items.add(TIN_SHOVEL, new ItemTinShovel(tinToolMaterial));
		items.add(TIN_AXE, new ItemTinAxe(tinToolMaterial));
		items.add(TIN_HOE, new ItemTinHoe(tinToolMaterial));
		items.add(TIN_HELMET, new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_HELMET, tinArmorMaterial, 0));
		items.add(TIN_CHEST, new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_CHEST, tinArmorMaterial, 1));
		items.add(TIN_LEGGINGS, new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_LEGGINGS, tinArmorMaterial, 2));
		items.add(TIN_BOOTS, new ItemTinArmor(ItemTinArmor.REGISTRY_NAME_BOOTS, tinArmorMaterial, 3));
		items.add(WRENCH, new ItemWrench());
		items.add(LASER1, new ItemLaser1());
		items.add(LASER2, new ItemLaser2());
		items.add(LASER3, new ItemLaser3());
		items.add(SOIL_PILE, new ItemSoilPile());
		items.add(STONE_HAMMER, new ItemStoneHammer());
		items.add(DIRT_RAW, new ItemDirtRaw());
		items.add(FLOUR, new ItemFlour());
		items.add(GLASS_SHARD, new ItemGlassShard());
		items.add(GRAVEL_RAW, new ItemGravelRaw());
		items.add(ICE_SHARD, new ItemIceShard());
		items.add(NETHER_RAW, new ItemNetherRaw());
		items.add(OBSIDIAN_RAW, new ItemObsidianRaw());
		items.add(SAND_RAW, new ItemSandRaw());
		items.add(STONE_INGOT, new ItemStoneIngot());
		items.add(STONE_RAW, new ItemStoneRaw());
		items.add(WOODEN_PLANK, new ItemWoodenPlank());
	}

	public static void registerItemModels() {
		// TODO In die Proxy Klassen verlagern
		System.out.println("Atomizer is registering its models now!");
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		ModelResourceLocation mrl;

		for(int i = 0; i < WOODEN_PLANK;i++){
			Item k = items.get(i);
			mrl = new ModelResourceLocation(k.getRegistryName(), "inventory");
			renderItem.getItemModelMesher().register(k, 0, mrl);
			// ModelLoader.setCustomModelResourceLocation(i, 0, mrl);
			System.out.println("Registered: " + k.getUnlocalizedName());
		}
	}

	public static Item getItem(int index) {
		return items.get(index);
	}
}
