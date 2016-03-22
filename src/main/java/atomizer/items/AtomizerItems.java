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
	public static Item dirtRaw;
	public static Item flour;
	public static Item glassShard;
	public static Item gravelRaw;
	public static Item iceShard;
	public static Item netherRaw;
	public static Item obsidianRaw;
	public static Item sandRaw;
	public static Item stoneIngot;
	public static Item stoneRaw;
	public static Item woodenPlank;
	
	/* Bronze */
	public static Item chestBronze;
	public static Item leggingsBronze;
	public static Item helmetBronze;
	public static Item bootsBronze;
	public static Item bronzeSword;
	public static Item bronzeIngot;
	public static Item bronzePlate;
	
	/* Copper */
	public static Item copperIngot;
	public static Item copperPlate;
	public static Item copperRaw;
	
	/* Zinc */
	public static Item zincIngot;
	public static Item zincPlate;
	public static Item zincRaw;
	
	/* Iron */
	public static Item ironRaw;
	public static Item ironPlate;
	
	/* Silver */
	public static Item silverIngot;
	public static Item silverPlate;
	public static Item silverRaw;
	
	/* Gold */
	public static Item goldPlate;
	public static Item goldRaw;
	
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
		dirtRaw = new ItemDirtRaw();
		flour = new ItemFlour();
		glassShard = new ItemGlassShard();
		gravelRaw = new ItemGravelRaw();
		iceShard = new ItemIceShard();
		netherRaw = new ItemNetherRaw();
		obsidianRaw = new ItemObsidianRaw();
		sandRaw = new ItemSandRaw();
		stoneIngot = new ItemStoneIngot();
		stoneRaw = new ItemStoneRaw();
		woodenPlank = new ItemWoodenPlank();
		
		/* Bronze */
		chestBronze = new ItemBronzeChest(bronzeArmorMaterial, 1, 1);
		leggingsBronze = new ItemBronzeLeggings(bronzeArmorMaterial, 0, 0);
		helmetBronze = new ItemBronzeHelmet(bronzeArmorMaterial, 0, 0);
		bootsBronze = new ItemBronzeBoots(bronzeArmorMaterial, 0, 0);
		bronzeSword = new ItemBronzeSword(bronzeSwordMaterial);
		bronzeIngot = new ItemBronzeIngot();
		bronzePlate = new ItemBronzePlate();
		
		/* Copper */
		copperIngot = new ItemCopperIngot();
		copperPlate = new ItemCopperPlate();
		copperRaw = new ItemCopperRaw();
		
		/* Zinc */
		zincIngot = new ItemZincIngot();
		zincPlate = new ItemZincPlate();
		zincRaw = new ItemZincRaw();
		
		/* Iron */
		ironRaw = new ItemIronRaw();
		ironPlate = new ItemIronPlate();
		
		/* Silver */
		
		silverIngot = new ItemSilverIngot();
		silverPlate = new ItemSilverPlate();
		silverRaw = new ItemSilverRaw();
		
		/* Gold */
		goldRaw = new ItemGoldRaw();
		goldPlate = new ItemGoldPlate();
	}
}
