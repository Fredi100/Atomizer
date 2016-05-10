package atomizer.recipes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import atomizer.blocks.AtomizerBlocks;
import atomizer.blocks.BlockAssembler1;
import atomizer.blocks.BlockAssembler2;
import atomizer.blocks.BlockAssembler3;
import atomizer.blocks.BlockSoil;
import atomizer.blocks.BlockTest;
import atomizer.items.AtomizerItems;
import atomizer.items.ItemBronzeIngot;
import atomizer.items.ItemBronzePlate;
import atomizer.items.ItemCopperIngot;
import atomizer.items.ItemCopperPlate;
import atomizer.items.ItemCopperRaw;
import atomizer.items.ItemGlassShard;
import atomizer.items.ItemGoldPlate;
import atomizer.items.ItemGoldRaw;
import atomizer.items.ItemIronPlate;
import atomizer.items.ItemIronRaw;
import atomizer.items.ItemLaser1;
import atomizer.items.ItemLaser2;
import atomizer.items.ItemLaser3;
import atomizer.items.ItemNetherRaw;
import atomizer.items.ItemSandRaw;
import atomizer.items.ItemSilverIngot;
import atomizer.items.ItemSilverPlate;
import atomizer.items.ItemSilverRaw;
import atomizer.items.ItemSoilPile;
import atomizer.items.ItemStoneIngot;
import atomizer.items.ItemStoneRaw;
import atomizer.items.ItemTinIngot;
import atomizer.items.ItemTinPlate;
import atomizer.items.ItemTinRaw;
import atomizer.items.ItemWoodenPlank;
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
import atomizer.items.tools.ItemSilverPickaxe;
import atomizer.items.tools.ItemSilverShovel;
import atomizer.items.tools.ItemSilverSword;
import atomizer.items.tools.ItemTinAxe;
import atomizer.items.tools.ItemTinHoe;
import atomizer.items.tools.ItemTinPickaxe;
import atomizer.items.tools.ItemTinShovel;
import atomizer.items.tools.ItemTinSword;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AtomizerRecipes {

	/**
	 * Initialisiert alle Rezepte
	 */
	public static void init() {
		System.out.println("Atomizer is initializing its recipes now!");

		// Rohes Eisen zu Eisenbarren
		// Eisenerz zu Eisenbarren ersetzt
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemIronRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(Items.iron_ingot), 0.7F);

		// Rohes Gold zu Goldbarren
		// Golderz zu Goldbarren ersetzt
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemGoldRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(Items.gold_ingot), 1.0F);

		// Sandhaufen zu Glasscherbe
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemSandRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(AtomizerItems.items.get(ItemGlassShard.UNLOCALIZED_ITEM_NAME)), 0.35F);
		// Steinbrocken zu Steinbarren
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemStoneRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(AtomizerItems.items.get(ItemStoneIngot.UNLOCALIZED_ITEM_NAME)), 0.1F);
		// Netherbrocken zu Netherziegel
		// Netherstein zu Netherziegel ersetzt
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemNetherRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(Items.netherbrick), 0.35F);
		// Rohes Kupfer zu Kupferbarren
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemCopperRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME)), 0.7F);
		// Rohes Zinn zu Zinnbarren
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemTinRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME)), 0.7F);

		// Rohes Silber zu Silberbarren
		GameRegistry.addSmelting(AtomizerItems.items.get(ItemSilverRaw.UNLOCALIZED_ITEM_NAME),
				new ItemStack(AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME)), 1.0F);

		// Wooden Planks
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 0) });
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 1) });
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 2) });
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 3) });
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { new ItemStack(Blocks.log2, 1, 0) });
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { new ItemStack(Blocks.log2, 1, 1) });

		// Wooden Plank Block
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks), new Object[] { "###", "###", "###", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Wooden Planks
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 9),
				new Object[] { Blocks.planks });

		// Wooden Button
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button),
				new Object[] { AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Sticks
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4),
				new Object[] { "#", "#", '#', AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Crafting Table
		// TODO Muss noch für alle Holzvariante gemacht werden
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table),
				new Object[] { "##", "##", '#', AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Furnace
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.furnace),
				new Object[] { "###", "# #", "###", '#', AtomizerItems.items.get(ItemStoneRaw.UNLOCALIZED_ITEM_NAME) });

		// Chest
		// TODO Muss noch für alle Holzvarianten gemacht werden
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.chest), new Object[] { "###", "# #", "###", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// WoodenSlab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab),
				new Object[] { "###", '#', AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Cobblestone Slab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_slab, 1, 3),
				new Object[] { "   ", "   ", "###", '#', AtomizerItems.items.get(ItemStoneRaw.UNLOCALIZED_ITEM_NAME) });

		// Stone Slab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_slab, 1, 0),
				new Object[] { "   ", "   ", "###", '#', AtomizerItems.items.get(ItemStoneRaw.UNLOCALIZED_ITEM_NAME) });

		// Glass Pane
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 8), new Object[] { "   ", "###", "###", '#',
				AtomizerItems.items.get(ItemGlassShard.UNLOCALIZED_ITEM_NAME) });

		// Glass Pane
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 64),
				new Object[] { "   ", "###", "###", '#', Blocks.glass });

		// Stair
		// TODO Muss in allen Holz und in allen Steinvarianten gemacht werden
		// Oak Stairs
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs), new Object[] { "  #", " ##", "###", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Cobblestone Stairs
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_stairs), new Object[] { "  #", " ##", "###", '#',
				AtomizerItems.items.get(ItemStoneIngot.UNLOCALIZED_ITEM_NAME) });

		// Stonebrick Stair
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_brick_stairs), new Object[] { "  #", " ##", "###", '#',
				AtomizerItems.items.get(ItemStoneIngot.UNLOCALIZED_ITEM_NAME) });

		// Stonebrick Block
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick), new Object[] { "###", "###", "###", '#',
				AtomizerItems.items.get(ItemStoneIngot.UNLOCALIZED_ITEM_NAME) });

		// TODO Alle Ressourcenblöcke
		// Bronze Block
		// GameRegistry.addShapedRecipe(new ItemStack(AtomizerBlocks.), params)

		/* Bronze Tools */

		// Bronze Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemBronzePickaxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Bronze Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemBronzeAxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Bronze Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemBronzeShovel.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Bronze Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemBronzeHoe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		/* Silver Tools */

		// Silver Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemSilverPickaxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Silver Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemSilverAxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Silver Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemSilverShovel.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Silver Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemSilverAxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		/* Copper Tools */

		// Copper Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemCopperPickaxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Copper Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemCopperAxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Copper Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemCopperShovel.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Copper Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemCopperHoe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		/* Tin Tools */

		// Tin Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinPickaxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Tin Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinAxe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Tin Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinShovel.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Tin Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinHoe.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Bucket
		GameRegistry.addShapedRecipe(new ItemStack(Items.bucket), new Object[] { "   ", "# #", " # ", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME) });

		// Compass
		GameRegistry.addShapedRecipe(new ItemStack(Items.compass), new Object[] { " # ", "#R#", " # ", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME), 'R', Items.redstone });

		// Watch
		GameRegistry.addShapedRecipe(new ItemStack(Items.clock), new Object[] { " # ", "#R#", " # ", '#',
				AtomizerItems.items.get(ItemGoldPlate.UNLOCALIZED_ITEM_NAME), 'R', Items.redstone });

		/* Bronze Armor */

		// Bronze Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemBronzeSword.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Bronze Ingot
		GameRegistry.addShapelessRecipe(
				new ItemStack(AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME) });

		// Bronze Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemBronzePlate.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get(ItemBronzeIngot.UNLOCALIZED_ITEM_NAME) });

		// Bronze Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemBronzeArmor.UNLOCALIZED_ITEM_NAME_HELMET)), new Object[] {
						"   ", "###", "# #", '#', AtomizerItems.items.get(ItemBronzePlate.UNLOCALIZED_ITEM_NAME) });

		// Bronze Chest
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemBronzeArmor.UNLOCALIZED_ITEM_NAME_CHEST)), new Object[] {
						"# #", "###", "###", '#', AtomizerItems.items.get(ItemBronzePlate.UNLOCALIZED_ITEM_NAME) });

		// Bronze Leggings
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemBronzeArmor.UNLOCALIZED_ITEM_NAME_LEGGINGS)), new Object[] {
						"###", "# #", "# #", '#', AtomizerItems.items.get(ItemBronzePlate.UNLOCALIZED_ITEM_NAME) });

		// Bronze Boots
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemBronzeArmor.UNLOCALIZED_ITEM_NAME_BOOTS)), new Object[] {
						"   ", "# #", "# #", '#', AtomizerItems.items.get(ItemBronzePlate.UNLOCALIZED_ITEM_NAME) });

		/* Silver Armor */

		// Silver Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemSilverSword.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Silver Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemSilverPlate.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get(ItemSilverIngot.UNLOCALIZED_ITEM_NAME) });

		// Silver Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemSilverArmor.UNLOCALIZED_ITEM_NAME_HELMET)), new Object[] {
						"   ", "###", "# #", '#', AtomizerItems.items.get(ItemSilverPlate.UNLOCALIZED_ITEM_NAME) });

		// Silver Chest
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemSilverArmor.UNLOCALIZED_ITEM_NAME_CHEST)), new Object[] {
						"# #", "###", "###", '#', AtomizerItems.items.get(ItemSilverPlate.UNLOCALIZED_ITEM_NAME) });

		// Silver Leggings
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemSilverArmor.UNLOCALIZED_ITEM_NAME_LEGGINGS)), new Object[] {
						"###", "# #", "# #", '#', AtomizerItems.items.get(ItemSilverPlate.UNLOCALIZED_ITEM_NAME) });

		// Silver Boots
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemSilverArmor.UNLOCALIZED_ITEM_NAME_BOOTS)), new Object[] {
						"   ", "# #", "# #", '#', AtomizerItems.items.get(ItemSilverPlate.UNLOCALIZED_ITEM_NAME) });

		/* Copper Armor */

		// Copper Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemCopperSword.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Copper Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemCopperPlate.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get(ItemCopperIngot.UNLOCALIZED_ITEM_NAME) });

		// Copper Helmet
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemCopperArmor.UNLOCALIZED_ITEM_NAME_HELMET)), new Object[] {
						"   ", "###", "# #", '#', AtomizerItems.items.get(ItemCopperPlate.UNLOCALIZED_ITEM_NAME) });

		// Copper Chest
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemCopperArmor.UNLOCALIZED_ITEM_NAME_CHEST)), new Object[] {
						"# #", "###", "###", '#', AtomizerItems.items.get(ItemCopperPlate.UNLOCALIZED_ITEM_NAME) });

		// Copper Leggings
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemCopperArmor.UNLOCALIZED_ITEM_NAME_LEGGINGS)), new Object[] {
						"###", "# #", "# #", '#', AtomizerItems.items.get(ItemCopperPlate.UNLOCALIZED_ITEM_NAME) });

		// Copper Boots
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemCopperArmor.UNLOCALIZED_ITEM_NAME_BOOTS)), new Object[] {
						"   ", "# #", "# #", '#', AtomizerItems.items.get(ItemCopperPlate.UNLOCALIZED_ITEM_NAME) });

		/* Tin Armor */

		// Tin Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinSword.UNLOCALIZED_ITEM_NAME)),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME),
						'|', Items.stick });

		// Tin Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinPlate.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get(ItemTinIngot.UNLOCALIZED_ITEM_NAME) });

		// Tin Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinArmor.UNLOCALIZED_ITEM_NAME_HELMET)),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get(ItemTinPlate.UNLOCALIZED_ITEM_NAME) });

		// Tin Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinArmor.UNLOCALIZED_ITEM_NAME_CHEST)),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get(ItemTinPlate.UNLOCALIZED_ITEM_NAME) });

		// Tin Leggings
		GameRegistry.addShapedRecipe(
				new ItemStack(AtomizerItems.items.get(ItemTinArmor.UNLOCALIZED_ITEM_NAME_LEGGINGS)),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get(ItemTinPlate.UNLOCALIZED_ITEM_NAME) });

		// Tin Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemTinArmor.UNLOCALIZED_ITEM_NAME_BOOTS)),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get(ItemTinPlate.UNLOCALIZED_ITEM_NAME) });

		/* Gold Armor */

		// Gold Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemGoldPlate.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { "##", "##", '#', Items.gold_ingot });

		// Gold Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_helmet), new Object[] { "   ", "###", "# #", '#',
				AtomizerItems.items.get(ItemGoldPlate.UNLOCALIZED_ITEM_NAME) });

		// Gold Chest
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_chestplate), new Object[] { "# #", "###", "###", '#',
				AtomizerItems.items.get(ItemGoldPlate.UNLOCALIZED_ITEM_NAME) });

		// Gold Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_leggings), new Object[] { "###", "# #", "# #", '#',
				AtomizerItems.items.get(ItemGoldPlate.UNLOCALIZED_ITEM_NAME) });

		// Gold Boots
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_boots), new Object[] { "   ", "# #", "# #", '#',
				AtomizerItems.items.get(ItemGoldPlate.UNLOCALIZED_ITEM_NAME) });

		/* Iron Armor */

		// Iron Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME), 4),
				new Object[] { "##", "##", '#', Items.iron_ingot });

		// Iron Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_helmet), new Object[] { "   ", "###", "# #", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME) });

		// Iron Chest
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_chestplate), new Object[] { "# #", "###", "###", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME) });

		// Iron Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_leggings), new Object[] { "###", "# #", "# #", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME) });

		// Iron Boots
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_boots), new Object[] { "   ", "# #", "# #", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME) });

		// Minecart
		GameRegistry.addShapedRecipe(new ItemStack(Items.minecart), new Object[] { "   ", "# #", "I#I", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME), 'I', Items.iron_ingot });

		// TODO Alle Schienen ???

		// Boat
		GameRegistry.addShapedRecipe(new ItemStack(Items.boat), new Object[] { "   ", "# #", "###", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// TODO Alle Türen

		// TODO Alle Falltüren

		// TODO Zauntor

		// TODO Druckplatte

		// TODO Hebel

		// TODO Notenblock

		// TODO Alle Maschinen

		// TODO Alle Schalen
		GameRegistry.addShapedRecipe(new ItemStack(Items.bowl, 3), new Object[] { "   ", "# #", " # ", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Brewing Stand
		GameRegistry.addShapedRecipe(new ItemStack(Items.brewing_stand), new Object[] { "   ", " B ", "SSS", 'S',
				AtomizerItems.items.get(ItemStoneIngot.UNLOCALIZED_ITEM_NAME), 'B', Items.blaze_rod });

		// TODO Bücherregale

		// Cauldron
		GameRegistry.addShapedRecipe(new ItemStack(Items.cauldron), new Object[] { "# #", "# #", "###", '#',
				AtomizerItems.items.get(ItemIronPlate.UNLOCALIZED_ITEM_NAME) });

		// Sign
		GameRegistry.addShapedRecipe(new ItemStack(Items.sign), new Object[] { "###", "###", " S ", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 'S', Items.stick });

		// Bed
		GameRegistry.addShapedRecipe(new ItemStack(Items.bed), new Object[] { "   ", "WWW", "S#S", 'W', Blocks.wool,
				'S', Items.stick, '#', AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME) });

		// Jukebox
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.jukebox), new Object[] { "###", "#D#", "###", '#',
				AtomizerItems.items.get(ItemWoodenPlank.UNLOCALIZED_ITEM_NAME), 'D', Items.diamond });

		/* Test-Rezept */
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.blocks.get(BlockTest.UNLOCALIZED_BLOCK_NAME)), new Object[] { "IDI", "DPD", "IDI", 'I',
				Items.iron_ingot, 'D', Items.diamond, 'P', Items.iron_pickaxe });

		/* Recipes */

		// SoilePileItem
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.blocks.get(BlockSoil.UNLOCALIZED_BLOCK_NAME)),
				new Object[] { "SSS", "SSS", "SSS", 'S', AtomizerItems.items.get(ItemSoilPile.UNLOCALIZED_ITEM_NAME) });
		// Laser1Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get(ItemLaser1.UNLOCALIZED_ITEM_NAME)), new Object[] {
				"   ", "RIG", "   ", 'R', Items.redstone, 'I', Items.iron_ingot, 'G', Items.gold_ingot });
		// Laser2Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get(ItemLaser2.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "   ", "ELG", "   ", 'E', Items.emerald, 'L',
						AtomizerItems.items.get(ItemLaser1.UNLOCALIZED_ITEM_NAME), 'G', Items.gold_ingot });
		// Laser3Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get(ItemLaser3.UNLOCALIZED_ITEM_NAME)),
				new Object[] { "   ", "DLG", "   ", 'D', Items.diamond, 'L',
						AtomizerItems.items.get(ItemLaser2.UNLOCALIZED_ITEM_NAME), 'G', Items.gold_ingot });
		// Assembler1Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.blocks.get(BlockAssembler1.UNLOCALIZED_BLOCK_NAME)),
				new Object[] { "GLG", "SCS", "GRG", 'C', Blocks.crafting_table, 'S', Blocks.stone, 'G',
						Items.gold_ingot, 'L', AtomizerItems.items.get(ItemLaser1.UNLOCALIZED_ITEM_NAME), 'R',
						Items.redstone });
		// Assembler2Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.blocks.get(BlockAssembler2.UNLOCALIZED_BLOCK_NAME)),
				new Object[] { "GLG", "ICI", "GRG", 'C', AtomizerBlocks.blocks.get(BlockAssembler1.UNLOCALIZED_BLOCK_NAME), 'I', Blocks.iron_block, 'G',
						Items.gold_ingot, 'L', AtomizerItems.items.get(ItemLaser2.UNLOCALIZED_ITEM_NAME), 'R',
						Blocks.redstone_block });
		// Assembler3Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.blocks.get(BlockAssembler3.UNLOCALIZED_BLOCK_NAME)),
				new Object[] { "GLG", "DCD", "GRG", 'C', AtomizerBlocks.blocks.get(BlockAssembler2.UNLOCALIZED_BLOCK_NAME), 'D', Blocks.diamond_block, 'G',
						Items.gold_ingot, 'L', AtomizerItems.items.get(ItemLaser3.UNLOCALIZED_ITEM_NAME), 'R',
						Blocks.redstone_block });
	}

	/**
	 * Enfertn alle Schmelzrezepte die wir ersetzten damit wir unsere Rezepte
	 * einfügen können
	 */
	public static void smeltingRemover() {
		Map furnace = FurnaceRecipes.instance().getSmeltingList();
		furnace.remove(Blocks.iron_ore);
		furnace.remove(Blocks.gold_ore);
		furnace.remove(Blocks.netherrack);
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
}
