package atomizer.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import atomizer.block.AtomizerBlocks;
import atomizer.block.BlockSoil;
import atomizer.block.machine.BlockAssembler1;
import atomizer.block.machine.BlockAssembler2;
import atomizer.block.machine.BlockAssembler3;
import atomizer.item.AtomizerItems;
import atomizer.item.ItemBronzeIngot;
import atomizer.item.ItemBronzePlate;
import atomizer.item.ItemCopperIngot;
import atomizer.item.ItemCopperPlate;
import atomizer.item.ItemCopperRaw;
import atomizer.item.ItemGlassShard;
import atomizer.item.ItemGoldPlate;
import atomizer.item.ItemGoldRaw;
import atomizer.item.ItemIronPlate;
import atomizer.item.ItemIronRaw;
import atomizer.item.ItemLaser1;
import atomizer.item.ItemLaser2;
import atomizer.item.ItemLaser3;
import atomizer.item.ItemNetherRaw;
import atomizer.item.ItemSandRaw;
import atomizer.item.ItemSilverIngot;
import atomizer.item.ItemSilverPlate;
import atomizer.item.ItemSilverRaw;
import atomizer.item.ItemSoilPile;
import atomizer.item.ItemStoneIngot;
import atomizer.item.ItemStoneRaw;
import atomizer.item.ItemTinIngot;
import atomizer.item.ItemTinPlate;
import atomizer.item.ItemTinRaw;
import atomizer.item.ItemWoodenPlank;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * 
 * @author Alfred Emsenhuber(Fredi100)
 * @version 2016-07-03
 */
public class AtomizerRecipes {

	public static HashMap<String, RecipeDisassembler> disassembler;
	// public static TreeMap<String,RecipeAssembler> assembler;

	/**
	 * Initialisiert alle Rezepte
	 */
	public static void init() {
		System.out.println("Atomizer is initializing its recipes now!");

		// Rohes Eisen zu Eisenbarren
		// Eisenerz zu Eisenbarren ersetzt
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.IRON_RAW), new ItemStack(Items.iron_ingot), 0.7F);

		// Rohes Gold zu Goldbarren
		// Golderz zu Goldbarren ersetzt
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.GOLD_RAW), new ItemStack(Items.gold_ingot), 1.0F);

		// Sandhaufen zu Glasscherbe
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.SAND_RAW),
				new ItemStack(AtomizerItems.getItem(AtomizerItems.GLASS_SHARD)), 0.35F);
		// Steinbrocken zu Steinbarren
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.STONE_RAW),
				new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_INGOT)), 0.1F);
		// Netherbrocken zu Netherziegel
		// Netherstein zu Netherziegel ersetzt
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.NETHER_RAW), new ItemStack(Items.netherbrick),
				0.35F);
		// Rohes Kupfer zu Kupferbarren
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.COPPER_RAW),
				new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_INGOT)), 0.7F);
		// Rohes Zinn zu Zinnbarren
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.TIN_RAW),
				new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_INGOT)), 0.7F);

		// Rohes Silber zu Silberbarren
		GameRegistry.addSmelting(AtomizerItems.getItem(AtomizerItems.SILVER_RAW),
				new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_INGOT)), 1.0F);

		// Wooden Planks
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { new ItemStack(Blocks.log2, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { new ItemStack(Blocks.log2, 1, 1) });

		// Wooden Plank Block
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks),
				new Object[] { "###", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Wooden Planks
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 9),
				new Object[] { Blocks.planks });

		// Wooden Button
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button),
				new Object[] { AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Sticks
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4),
				new Object[] { "#", "#", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Crafting Table
		// TODO Muss noch für alle Holzvariante gemacht werden
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table),
				new Object[] { "##", "##", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Furnace
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.furnace),
				new Object[] { "###", "# #", "###", '#', AtomizerItems.getItem(AtomizerItems.STONE_RAW) });

		// Chest
		// TODO Muss noch für alle Holzvarianten gemacht werden
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.chest),
				new Object[] { "###", "# #", "###", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// WoodenSlab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab),
				new Object[] { "###", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Cobblestone Slab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_slab, 1, 3),
				new Object[] { "   ", "   ", "###", '#', AtomizerItems.getItem(AtomizerItems.STONE_RAW) });

		// Stone Slab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_slab, 1, 0),
				new Object[] { "   ", "   ", "###", '#', AtomizerItems.getItem(AtomizerItems.STONE_RAW) });

		// Glass Pane
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 8),
				new Object[] { "   ", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.GLASS_SHARD) });

		// Glass Pane
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 64),
				new Object[] { "   ", "###", "###", '#', Blocks.glass });

		// Stair
		// TODO Muss in allen Holz und in allen Steinvarianten gemacht werden
		// Oak Stairs
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs),
				new Object[] { "  #", " ##", "###", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Cobblestone Stairs
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_stairs),
				new Object[] { "  #", " ##", "###", '#', AtomizerItems.getItem(AtomizerItems.STONE_INGOT) });

		// Stonebrick Stair
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_brick_stairs),
				new Object[] { "  #", " ##", "###", '#', AtomizerItems.getItem(AtomizerItems.STONE_INGOT) });

		// Stonebrick Block
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick),
				new Object[] { "###", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.STONE_INGOT) });

		// TODO Alle Ressourcenblöcke
		// Bronze Block
		// GameRegistry.addShapedRecipe(new ItemStack(AtomizerBlocks.), params)

		/* Bronze Tools */

		// Bronze Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PICKAXE)), new Object[] {
				"###", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), '|', Items.stick });

		// Bronze Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_AXE)), new Object[] {
				"## ", "#| ", " | ", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), '|', Items.stick });

		// Bronze Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_SHOVEL)), new Object[] {
				" # ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), '|', Items.stick });

		// Bronze Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_HOE)), new Object[] {
				"## ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), '|', Items.stick });

		/* Silver Tools */

		// Silver Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PICKAXE)), new Object[] {
				"###", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), '|', Items.stick });

		// Silver Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_AXE)), new Object[] {
				"## ", "#| ", " | ", '#', AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), '|', Items.stick });

		// Silver Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_SHOVEL)), new Object[] {
				" # ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), '|', Items.stick });

		// Silver Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_HOE)), new Object[] {
				"## ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), '|', Items.stick });

		/* Copper Tools */

		// Copper Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PICKAXE)), new Object[] {
				"###", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), '|', Items.stick });

		// Copper Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_AXE)), new Object[] {
				"## ", "#| ", " | ", '#', AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), '|', Items.stick });

		// Copper Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_SHOVEL)), new Object[] {
				" # ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), '|', Items.stick });

		// Copper Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_HOE)), new Object[] {
				"## ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), '|', Items.stick });

		/* Tin Tools */

		// Tin Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PICKAXE)), new Object[] {
				"###", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.TIN_INGOT), '|', Items.stick });

		// Tin Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_AXE)), new Object[] { "## ",
				"#| ", " | ", '#', AtomizerItems.getItem(AtomizerItems.TIN_INGOT), '|', Items.stick });

		// Tin Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_SHOVEL)), new Object[] {
				" # ", " | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.TIN_INGOT), '|', Items.stick });

		// Tin Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_HOE)), new Object[] { "## ",
				" | ", " | ", '#', AtomizerItems.getItem(AtomizerItems.TIN_INGOT), '|', Items.stick });

		// Bucket
		GameRegistry.addShapedRecipe(new ItemStack(Items.bucket),
				new Object[] { "   ", "# #", " # ", '#', AtomizerItems.getItem(AtomizerItems.IRON_PLATE) });

		// Compass
		GameRegistry.addShapedRecipe(new ItemStack(Items.compass), new Object[] { " # ", "#R#", " # ", '#',
				AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 'R', Items.redstone });

		// Watch
		GameRegistry.addShapedRecipe(new ItemStack(Items.clock), new Object[] { " # ", "#R#", " # ", '#',
				AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 'R', Items.redstone });

		/* Bronze Armor */

		// Bronze Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_SWORD)), new Object[] {
				" # ", " # ", " | ", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), '|', Items.stick });

		// Bronze Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), 4),
				new Object[] { AtomizerItems.getItem(AtomizerItems.COPPER_INGOT),
						AtomizerItems.getItem(AtomizerItems.COPPER_INGOT),
						AtomizerItems.getItem(AtomizerItems.COPPER_INGOT),
						AtomizerItems.getItem(AtomizerItems.TIN_INGOT) });

		// Bronze Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 4),
				new Object[] { "##", "##", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT) });

		// Bronze Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_HELMET)),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE) });

		// Bronze Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_CHEST)),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE) });

		// Bronze Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_LEGGINGS)),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE) });

		// Bronze Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_BOOTS)),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE) });

		/* Silver Armor */

		// Silver Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_SWORD)), new Object[] {
				" # ", " # ", " | ", '#', AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), '|', Items.stick });

		// Silver Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 4),
				new Object[] { "##", "##", '#', AtomizerItems.getItem(AtomizerItems.SILVER_INGOT) });

		// Silver Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_HELMET)),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.getItem(AtomizerItems.SILVER_PLATE) });

		// Silver Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_CHEST)),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.SILVER_PLATE) });

		// Silver Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_LEGGINGS)),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.SILVER_PLATE) });

		// Silver Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_BOOTS)),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.SILVER_PLATE) });

		/* Copper Armor */

		// Copper Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_SWORD)), new Object[] {
				" # ", " # ", " | ", '#', AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), '|', Items.stick });

		// Copper Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 4),
				new Object[] { "##", "##", '#', AtomizerItems.getItem(AtomizerItems.COPPER_INGOT) });

		// Copper Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_HELMET)),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.getItem(AtomizerItems.COPPER_PLATE) });

		// Copper Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_CHEST)),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.COPPER_PLATE) });

		// Copper Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_LEGGINGS)),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.COPPER_PLATE) });

		// Copper Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_BOOTS)),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.COPPER_PLATE) });

		/* Tin Armor */

		// Tin Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_SWORD)), new Object[] {
				" # ", " # ", " | ", '#', AtomizerItems.getItem(AtomizerItems.TIN_INGOT), '|', Items.stick });

		// Tin Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 4),
				new Object[] { "##", "##", '#', AtomizerItems.getItem(AtomizerItems.TIN_INGOT) });

		// Tin Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_HELMET)),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.getItem(AtomizerItems.TIN_PLATE) });

		// Tin Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_CHEST)),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.TIN_PLATE) });

		// Tin Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_LEGGINGS)),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.TIN_PLATE) });

		// Tin Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_BOOTS)),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.TIN_PLATE) });

		/* Gold Armor */

		// Gold Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 4),
				new Object[] { "##", "##", '#', Items.gold_ingot });

		// Gold Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_helmet),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.getItem(AtomizerItems.GOLD_PLATE) });

		// Gold Chest
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_chestplate),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.GOLD_PLATE) });

		// Gold Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_leggings),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.GOLD_PLATE) });

		// Gold Boots
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_boots),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.GOLD_PLATE) });

		/* Iron Armor */

		// Iron Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 4),
				new Object[] { "##", "##", '#', Items.iron_ingot });

		// Iron Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_helmet),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.getItem(AtomizerItems.IRON_PLATE) });

		// Iron Chest
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_chestplate),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.getItem(AtomizerItems.IRON_PLATE) });

		// Iron Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_leggings),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.IRON_PLATE) });

		// Iron Boots
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_boots),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.getItem(AtomizerItems.IRON_PLATE) });

		// Minecart
		GameRegistry.addShapedRecipe(new ItemStack(Items.minecart), new Object[] { "   ", "# #", "I#I", '#',
				AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 'I', Items.iron_ingot });

		// TODO Alle Schienen ???

		// Boat
		GameRegistry.addShapedRecipe(new ItemStack(Items.boat),
				new Object[] { "   ", "# #", "###", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// TODO Alle Türen

		// TODO Alle Falltüren

		// TODO Zauntor

		// TODO Druckplatte

		// TODO Hebel

		// TODO Notenblock

		// TODO Alle Maschinen

		// TODO Alle Schalen
		GameRegistry.addShapedRecipe(new ItemStack(Items.bowl, 3),
				new Object[] { "   ", "# #", " # ", '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Brewing Stand
		GameRegistry.addShapedRecipe(new ItemStack(Items.brewing_stand), new Object[] { "   ", " B ", "SSS", 'S',
				AtomizerItems.getItem(AtomizerItems.STONE_INGOT), 'B', Items.blaze_rod });

		// TODO Bücherregale

		// Cauldron
		GameRegistry.addShapedRecipe(new ItemStack(Items.cauldron),
				new Object[] { "# #", "# #", "###", '#', AtomizerItems.getItem(AtomizerItems.IRON_PLATE) });

		// Sign
		GameRegistry.addShapedRecipe(new ItemStack(Items.sign), new Object[] { "###", "###", " S ", '#',
				AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 'S', Items.stick });

		// Bed
		GameRegistry.addShapedRecipe(new ItemStack(Items.bed), new Object[] { "   ", "WWW", "S#S", 'W', Blocks.wool,
				'S', Items.stick, '#', AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK) });

		// Jukebox
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.jukebox), new Object[] { "###", "#D#", "###", '#',
				AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 'D', Items.diamond });

		// SoilePileItem
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.getBlock(AtomizerBlocks.SOIL)),
				new Object[] { "SSS", "SSS", "SSS", 'S', AtomizerItems.getItem(AtomizerItems.SOIL_PILE) });
		// Laser1Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.LASER1)), new Object[] { "   ", "RIG",
				"   ", 'R', Items.redstone, 'I', Items.iron_ingot, 'G', Items.gold_ingot });
		// Laser2Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.LASER2)), new Object[] { "   ", "ELG",
				"   ", 'E', Items.emerald, 'L', AtomizerItems.getItem(AtomizerItems.LASER1), 'G', Items.gold_ingot });
		// Laser3Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.getItem(AtomizerItems.LASER3)), new Object[] { "   ", "DLG",
				"   ", 'D', Items.diamond, 'L', AtomizerItems.getItem(AtomizerItems.LASER2), 'G', Items.gold_ingot });
		// Assembler1Block
		GameRegistry
				.addRecipe(new ItemStack(AtomizerBlocks.getBlock(AtomizerBlocks.ASSEMBLER1)),
						new Object[] { "GLG", "SCS", "GRG", 'C', Blocks.crafting_table, 'S', Blocks.stone, 'G',
								Items.gold_ingot, 'L', AtomizerItems.getItem(AtomizerItems.LASER1), 'R',
								Items.redstone });
		// Assembler2Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.getBlock(AtomizerBlocks.ASSEMBLER2)),
				new Object[] { "GLG", "ICI", "GRG", 'C', AtomizerBlocks.getBlock(AtomizerBlocks.ASSEMBLER1), 'I',
						Blocks.iron_block, 'G', Items.gold_ingot, 'L', AtomizerItems.getItem(AtomizerItems.LASER2), 'R',
						Blocks.redstone_block });
		// Assembler3Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.getBlock(AtomizerBlocks.ASSEMBLER3)),
				new Object[] { "GLG", "DCD", "GRG", 'C', AtomizerBlocks.getBlock(AtomizerBlocks.ASSEMBLER2), 'D',
						Blocks.diamond_block, 'G', Items.gold_ingot, 'L', AtomizerItems.getItem(AtomizerItems.LASER3),
						'R', Blocks.redstone_block });

		/* Ores */
		// Iron Ore Block
		// TODO Hier die Rezepte zum erhalten von den Rohen Erzen einfügen
		// TODO Hammer Plus Erz Block ergibt damaged Hammer + Rohes Erz
		// TODO Hammer kann derzeit noch nicht damaged werden
		// TODO Deswegen einfach normale Rezept machen Also Hammer weg
		// GameRegistry.addRecipe(new
		// ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_RAW)));
	}

	/**
	 * Enfernt alle Schmelzrezepte die wir ersetzten damit wir unsere Rezepte
	 * einfügen können
	 */
	public static void smeltingRemover() {
		Map furnace = FurnaceRecipes.instance().getSmeltingList();
		furnace.remove(Blocks.iron_ore);
		furnace.remove(Blocks.gold_ore);
		furnace.remove(Blocks.netherrack);
	}

	/**
	 * Creates all Assembler Recipes
	 */
	public static void assemblerRecipes() {
		ItemStack[] in = { new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 5) };
		ItemStack[] out = { new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_HELMET), 1) };
		// new AtomizerRecipe("aCopperHelmetRecipe", in.copy(), new ItemStack[]
		// {out[0].copy(),(out[1] == null) ? null : out[1].copy()});
		// TODO Rezepte auch abspeichern
	}

	/**
	 * Creates all Disassembler Recipes
	 */
	public static void disassemblerRecipes() {
		disassembler = new HashMap<String, RecipeDisassembler>();
		ItemStack[] out = new ItemStack[2];
		ItemStack in;

		/* IronOreBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_RAW), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.iron_ore), 1);
		disassembler.put("dIronOre", new RecipeDisassembler("dIronOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CoalOreBlock */
		out[0] = new ItemStack(Items.coal, 9);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.coal_ore), 1);
		disassembler.put("dCoalOre", new RecipeDisassembler("dCoalOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* StoneBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 9);
		out[1] = null;
		in = new ItemStack(Item.getItemFromBlock(Blocks.stone), 1);
		disassembler.put("dStoneBlock", new RecipeDisassembler("dStoneBlock", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CobblestoneBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 9);
		out[1] = null;
		in = new ItemStack(Item.getItemFromBlock(Blocks.cobblestone), 1);
		disassembler.put("dCobbleStoneBlock", new RecipeDisassembler("dCobblestoneBlock", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldOreBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_RAW), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.gold_ore), 1);
		disassembler.put("dGoldOre", new RecipeDisassembler("dGoldOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* LapisLazuliOreBlock */
		out[0] = new ItemStack(Item.getItemFromBlock(Blocks.lapis_ore), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.lapis_ore), 1);
		disassembler.put("dLapisLazuliOre", new RecipeDisassembler("dLapisLazuliOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondOreBlock */
		out[0] = new ItemStack(Item.getItemFromBlock(Blocks.diamond_ore), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.diamond_ore), 1);
		disassembler.put("dDiamondOre", new RecipeDisassembler("dDiamondOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* EmeraldOreBlock */
		out[0] = new ItemStack(Item.getItemFromBlock(Blocks.emerald_ore), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.redstone_ore), 1);
		disassembler.put("dRedstoneOre", new RecipeDisassembler("dRedstoneOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* RedstoneOreBlock */
		out[0] = new ItemStack(Item.getItemFromBlock(Blocks.redstone_ore), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(Item.getItemFromBlock(Blocks.redstone_ore), 1);
		disassembler.put("dRedstoneOre", new RecipeDisassembler("dRedstoneOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverOreBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_RAW), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), 1);
		disassembler.put("dSilverOre", new RecipeDisassembler("dSilverOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperOreBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_RAW), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), 1);
		disassembler.put("dCopperOre", new RecipeDisassembler("dCopperOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinOreBlock */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_RAW), 4);
		out[1] = new ItemStack(AtomizerItems.getItem(AtomizerItems.STONE_RAW), 5);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_INGOT), 1);
		disassembler.put("dTinOre", new RecipeDisassembler("dTinOre", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/*** Items ***/

		/* IronShovelItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.iron_shovel, 1);
		disassembler.put("dIronShovel", new RecipeDisassembler("dIronShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronPickaxeItem */
		out[0] = new ItemStack(Items.iron_ingot, 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.iron_pickaxe, 1);
		disassembler.put("dIronPickaxe", new RecipeDisassembler("dIronPickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronAxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.iron_axe, 1);
		disassembler.put("dIronAxe", new RecipeDisassembler("dIronAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronHoeItem */
		out[0] = new ItemStack(Items.iron_ingot, 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.iron_hoe, 1);
		disassembler.put("dIronHoe", new RecipeDisassembler("dIronHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronSwordItem */
		out[0] = new ItemStack(Items.iron_ingot, 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(Items.iron_sword, 1);
		disassembler.put("", new RecipeDisassembler("", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperShovelItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_SHOVEL), 1);
		disassembler.put("dCopperShovel", new RecipeDisassembler("dCopperShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperPickaxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PICKAXE), 1);
		disassembler.put("dCopperPickaxe", new RecipeDisassembler("dCopperPickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperAxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_AXE), 1);
		disassembler.put("dCopperAxe", new RecipeDisassembler("dCopperAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperHoeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_HOE), 1);
		disassembler.put("dCopperHoe", new RecipeDisassembler("dCopperHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperSwordItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_SWORD), 1);
		disassembler.put("dCopperSword", new RecipeDisassembler("dCopperSword", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverShovelItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_SHOVEL), 1);
		disassembler.put("dSilverShovel", new RecipeDisassembler("dSilverShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverPickaxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PICKAXE), 1);
		disassembler.put("dSilverPickaxe", new RecipeDisassembler("dSilverPickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverAxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_AXE), 1);
		disassembler.put("dSilverAxe", new RecipeDisassembler("dSilverAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverHoeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_HOE), 1);
		disassembler.put("dSilverHoe", new RecipeDisassembler("dSilverHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverSwordItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_SWORD), 1);
		disassembler.put("dSilverSword", new RecipeDisassembler("dSilverSword", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeShovelItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_SHOVEL), 1);
		disassembler.put("dBronzeShovel", new RecipeDisassembler("dBronzeShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzePickaxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PICKAXE), 1);
		disassembler.put("dBronzePickaxe", new RecipeDisassembler("dBronzePickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeAxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_AXE), 1);
		disassembler.put("dBronzeAxe", new RecipeDisassembler("dBronzeAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeHoeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_HOE), 1);
		disassembler.put("dBronzeHoe", new RecipeDisassembler("dBronzeHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeSwordItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_SWORD), 1);
		disassembler.put("dBronzeSword", new RecipeDisassembler("dBronzeSword", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinShovelItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_SHOVEL), 1);
		disassembler.put("dTinShovel", new RecipeDisassembler("dTinShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinPickaxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_INGOT), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PICKAXE), 1);
		disassembler.put("dTinPickaxe", new RecipeDisassembler("dTinPickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinAxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_AXE), 1);
		disassembler.put("dTinAxe", new RecipeDisassembler("dTinAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinHoeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_HOE), 1);
		disassembler.put("dTinHoe", new RecipeDisassembler("dTinHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinSwordItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_INGOT), 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_SWORD), 1);
		disassembler.put("dTinSword", new RecipeDisassembler("dTinSword", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldShovelItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.golden_shovel, 1);
		disassembler.put("dGoldShovel", new RecipeDisassembler("dGoldShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldPickaxeItem */
		out[0] = new ItemStack(Items.gold_ingot, 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.golden_pickaxe, 1);
		disassembler.put("dGoldPickaxe", new RecipeDisassembler("dGoldPickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldAxeItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.golden_axe, 1);
		disassembler.put("dGoldAxe", new RecipeDisassembler("dGoldAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldHoeItem */
		out[0] = new ItemStack(Items.gold_ingot, 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.golden_hoe, 1);
		disassembler.put("dGoldHoe", new RecipeDisassembler("dGoldHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldSwordItem */
		out[0] = new ItemStack(Items.gold_ingot, 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(Items.golden_sword, 1);
		disassembler.put("dGoldSword", new RecipeDisassembler("dGoldSword", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondShovelItem */
		out[0] = new ItemStack(Items.diamond, 1);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.diamond_shovel, 1);
		disassembler.put("dDiamondShovel", new RecipeDisassembler("dDiamondShovel", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondPickaxeItem */
		out[0] = new ItemStack(Items.diamond, 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.diamond_pickaxe, 1);
		disassembler.put("dDiamondPickaxe", new RecipeDisassembler("dDiamondPickaxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondAxeItem */
		out[0] = new ItemStack(Items.diamond, 3);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.diamond_axe, 1);
		disassembler.put("dDiamondAxe", new RecipeDisassembler("dDiamondAxe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondHoeItem */
		out[0] = new ItemStack(Items.diamond, 2);
		out[1] = new ItemStack(Items.stick, 2);
		in = new ItemStack(Items.diamond_hoe, 1);
		disassembler.put("dDiamondHoe", new RecipeDisassembler("dDiamondHoe", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondSwordItem */
		out[0] = new ItemStack(Items.diamond, 2);
		out[1] = new ItemStack(Items.stick, 1);
		in = new ItemStack(Items.diamond_sword, 1);
		disassembler.put("dDiamondSword", new RecipeDisassembler("dDiamondSword", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronHelmetItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 5);
		out[1] = null;
		in = new ItemStack(Items.iron_helmet, 1);
		disassembler.put("dIronHelmet", new RecipeDisassembler("dIronHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronChestItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 8);
		out[1] = null;
		in = new ItemStack(Items.iron_chestplate, 1);
		disassembler.put("dIronChest", new RecipeDisassembler("dIronChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronLeggingsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 7);
		out[1] = null;
		in = new ItemStack(Items.iron_leggings, 1);
		disassembler.put("dIronLegging", new RecipeDisassembler("dIronLegging", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* IronBootsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 4);
		out[1] = null;
		in = new ItemStack(Items.iron_boots, 1);
		disassembler.put("dIronBoots", new RecipeDisassembler("dIronBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldHelmetItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 5);
		out[1] = null;
		in = new ItemStack(Items.golden_helmet, 1);
		disassembler.put("dGoldHelmet", new RecipeDisassembler("dGoldHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldChestItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 8);
		out[1] = null;
		in = new ItemStack(Items.golden_helmet, 1);
		disassembler.put("dGoldChest", new RecipeDisassembler("dGoldChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldLeggingsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 7);
		out[1] = null;
		in = new ItemStack(Items.golden_leggings, 1);
		disassembler.put("dGoldLeggings", new RecipeDisassembler("dGoldLeggings", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* GoldBootsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.GOLD_PLATE), 4);
		out[1] = null;
		in = new ItemStack(Items.golden_boots, 1);
		disassembler.put("dGoldBoots", new RecipeDisassembler("dGoldBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondHelmetItem */
		out[0] = new ItemStack(Items.diamond, 5);
		out[1] = null;
		in = new ItemStack(Items.diamond_helmet, 1);
		disassembler.put("dDiamondHelmet", new RecipeDisassembler("dDiamondHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondChestItem */
		out[0] = new ItemStack(Items.diamond, 8);
		out[1] = null;
		in = new ItemStack(Items.diamond_chestplate, 1);
		disassembler.put("dDiamondChest", new RecipeDisassembler("dDiamondChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondLeggingsItem */
		out[0] = new ItemStack(Items.diamond, 7);
		out[1] = null;
		in = new ItemStack(Items.diamond_leggings, 1);
		disassembler.put("dDiamondLeggings", new RecipeDisassembler("dDiamondLeggings", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* DiamondBootsItem */
		out[0] = new ItemStack(Items.diamond, 4);
		out[1] = null;
		in = new ItemStack(Items.diamond_boots, 1);
		disassembler.put("dDiamondBoots", new RecipeDisassembler("dDiamondBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinHelmetItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 5);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_HELMET), 1);
		disassembler.put("dTinHelmet", new RecipeDisassembler("dTinHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinChestItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 8);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_CHEST), 1);
		disassembler.put("dTinChest", new RecipeDisassembler("dTinChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinLeggingsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 7);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_LEGGINGS), 1);
		disassembler.put("dTinLeggings", new RecipeDisassembler("dTinLeggings", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* TinBootsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_PLATE), 4);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.TIN_BOOTS), 1);
		disassembler.put("dTinBoots", new RecipeDisassembler("dTinBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperHelmetItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 5);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_HELMET), 1);
		disassembler.put("dCopperHelmet", new RecipeDisassembler("dCopperHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperChestItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 8);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_CHEST), 1);
		disassembler.put("dCopperChest", new RecipeDisassembler("dCopperChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperLeggingsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 7);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_LEGGINGS), 1);
		disassembler.put("dCopperLeggings", new RecipeDisassembler("dCopperLeggings", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* CopperBootsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_PLATE), 4);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.COPPER_BOOTS), 1);
		disassembler.put("dCopperBoots", new RecipeDisassembler("dCopperBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeHelmetItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 5);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_HELMET), 1);
		disassembler.put("dBronzeHelmet", new RecipeDisassembler("dBronzeHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeChestItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 8);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_CHEST), 1);
		disassembler.put("dBronzeChest", new RecipeDisassembler("dBronzeChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeLeggingsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 7);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_LEGGINGS), 1);
		disassembler.put("dBronzeLeggings", new RecipeDisassembler("dBronzeLeggings", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* BronzeBootsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_PLATE), 4);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.BRONZE_BOOTS), 1);
		disassembler.put("dBronzeBoots", new RecipeDisassembler("dBronzeBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverHelmetItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 5);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_HELMET), 1);
		disassembler.put("dSilverHelmet", new RecipeDisassembler("dSilverHelmet", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverChestItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 8);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_CHEST), 1);
		disassembler.put("dSilverChest", new RecipeDisassembler("dSilverChest", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverLeggingsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 7);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_LEGGINGS), 1);
		disassembler.put("dSilverLeggings", new RecipeDisassembler("dSilverLeggings", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* SilverBootsItem */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_PLATE), 4);
		out[1] = null;
		in = new ItemStack(AtomizerItems.getItem(AtomizerItems.SILVER_BOOTS), 1);
		disassembler.put("dSilverBoots", new RecipeDisassembler("dSilverBoots", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* Bucket */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.IRON_PLATE), 3);
		out[1] = null;
		in = new ItemStack(Items.bucket, 1);
		disassembler.put("dBucket", new RecipeDisassembler("dBucket", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));

		/* Boat */
		out[0] = new ItemStack(AtomizerItems.getItem(AtomizerItems.WOODEN_PLANK), 5);
		out[1] = null;
		in = new ItemStack(Items.boat, 1);
		disassembler.put("dBoat", new RecipeDisassembler("dBoat", in.copy(),
				new ItemStack[] { out[0].copy(), (out[1] == null) ? null : out[1].copy() }, null));
	}

	/**
	 * Enfernt alle bereits vorhandenen Rezepte die wir ändern damit wir unsere
	 * eigenen Rezepte ins Spiel einfügen können.
	 */
	public static void recipeRemover() {
		// Die Liste mit allen Rezepten
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipes.iterator();

		// Solange es noch ein nächstes Rezept gibt
		while (remover.hasNext()) {
			// Das Ergebnis des Rezeptes
			ItemStack itemstack = remover.next().getRecipeOutput();
			// Wenn das Ergebnis des Rezeptes unserer Vorgabe entpspricht
			if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.planks)) {
				// Dann wird es entfernt
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.stick) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.crafting_table)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.furnace)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.chest)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.wooden_slab)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.stone_slab)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.glass_pane)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.stone_brick_stairs)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.stone_stairs)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.oak_stairs)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.stonebrick)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.bucket) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.compass) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.clock) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.minecart) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.boat) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.bowl) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.brewing_stand) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.cauldron) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.sign) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.bed) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.jukebox)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.planks)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.wooden_button)) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.golden_helmet) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.iron_helmet) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.golden_chestplate) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.iron_chestplate) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.golden_leggings) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.iron_leggings) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.golden_boots) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			} else if (itemstack != null && itemstack.getItem() == Items.iron_boots) {
				remover.remove();
				System.out.println("Atomizer removed following recipe: " + itemstack.getItem().getUnlocalizedName());
			}
		}
	}

	public static boolean containsDisassemblerRecipe(ItemStack item) {
		if (item == null || item.getItem() == null) {
			// Given Item does not exist
			return false;
		}
		for (RecipeDisassembler rp : disassembler.values()) {
			ItemStack input = rp.getInput();
			if (input != null && input.getItem() != null) {
				if (input.getItem() == item.getItem()) {
					return true;
				}
			}
		}
		return false;
	}

	public static RecipeDisassembler getDisassemblerRecipe(ItemStack item) {
		if (item == null || item.getItem() == null) {
			return null;
		}
		for (RecipeDisassembler rp : disassembler.values()) {
			ItemStack input = rp.getInput();
			if (input != null && input.getItem() != null) {
				if (input.getItem() == item.getItem()) {
					return rp;
				}
			}
		}
		return null;
	}
}
