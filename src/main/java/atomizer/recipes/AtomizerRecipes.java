package atomizer.recipes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import atomizer.blocks.AtomizerBlocks;
import atomizer.items.AtomizerItems;
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
		GameRegistry.addSmelting(AtomizerItems.items.get("ironRaw"), new ItemStack(Items.iron_ingot), 0.7F);
		// Rohes Gold zu Goldbarren
		// Golderz zu Goldbarren ersetzt
		GameRegistry.addSmelting(AtomizerItems.items.get("goldRaw"), new ItemStack(Items.gold_ingot), 1.0F);
		// Sandhaufen zu Glasscherbe
		GameRegistry.addSmelting(AtomizerItems.items.get("sandPile"),
				new ItemStack(AtomizerItems.items.get("glassShard")), 0.35F);
		// Steinbrocken zu Steinbarren
		GameRegistry.addSmelting(AtomizerItems.items.get("stoneRaw"),
				new ItemStack(AtomizerItems.items.get("stoneIngot")), 0.1F);
		// Netherbrocken zu Netherziegel
		// Netherstein zu Netherziegel ersetzt
		GameRegistry.addSmelting(AtomizerItems.items.get("netherRaw"), new ItemStack(Items.netherbrick), 0.35F);
		// Rohes Kupfer zu Kupferbarren
		GameRegistry.addSmelting(AtomizerItems.items.get("copperRaw"),
				new ItemStack(AtomizerItems.items.get("copperIngot")), 0.7F);
		// Rohes Zinn zu Zinnbarren
		GameRegistry.addSmelting(AtomizerItems.items.get("tinRaw"), new ItemStack(AtomizerItems.items.get("tinIngot")),
				0.7F);

		// Rohes Silber zu Silberbarren
		GameRegistry.addSmelting(AtomizerItems.items.get("silverRaw"),
				new ItemStack(AtomizerItems.items.get("silverIngot")), 1.0F);

		// Wooden Planks
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { new ItemStack(Blocks.log, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { new ItemStack(Blocks.log2, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { new ItemStack(Blocks.log2, 1, 1) });

		// Wooden Plank Block
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.planks),
				new Object[] { "###", "###", "###", '#', AtomizerItems.items.get("woodenPlank") });

		// Wooden Planks
		// TODO Muss noch in allen Holzvarianten gemacht werden
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("woodenPlank"), 9),
				new Object[] { Blocks.planks });

		// Wooden Button
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wooden_button),
				new Object[] { AtomizerItems.items.get("woodenPlank") });

		// Sticks
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4),
				new Object[] { "#", "#", '#', AtomizerItems.items.get("woodenPlank") });

		// Crafting Table
		// TODO Muss noch für alle Holzvariante gemacht werden
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table),
				new Object[] { "##", "##", '#', AtomizerItems.items.get("woodenPlank") });

		// Furnace
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.furnace),
				new Object[] { "###", "# #", "###", '#', AtomizerItems.items.get("stoneRaw") });

		// Chest
		// TODO Muss noch für alle Holzvarianten gemacht werden
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.chest),
				new Object[] { "###", "# #", "###", '#', AtomizerItems.items.get("woodenPlank") });

		// WoodenSlab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.wooden_slab),
				new Object[] { "###", '#', AtomizerItems.items.get("woodenPlank") });

		// Cobblestone Slab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_slab, 1, 3),
				new Object[] { "   ", "   ", "###", '#', AtomizerItems.items.get("stoneRaw") });

		// Stone Slab
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_slab, 1, 0),
				new Object[] { "   ", "   ", "###", '#', AtomizerItems.items.get("stoneRaw") });

		// Glass Pane
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 8),
				new Object[] { "   ", "###", "###", '#', AtomizerItems.items.get("glassShard") });

		// Glass Pane
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.glass_pane, 64),
				new Object[] { "   ", "###", "###", '#', Blocks.glass });

		// Stair
		// TODO Muss in allen Holz und in allen Steinvarianten gemacht werden
		// Oak Stairs
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs),
				new Object[] { "  #", " ##", "###", '#', AtomizerItems.items.get("woodenPlank") });

		// Cobblestone Stairs
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_stairs),
				new Object[] { "  #", " ##", "###", '#', AtomizerItems.items.get("stoneIngot") });

		// Stonebrick Stair
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_brick_stairs),
				new Object[] { "  #", " ##", "###", '#', AtomizerItems.items.get("stoneIngot") });

		// Stonebrick Block
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick),
				new Object[] { "###", "###", "###", '#', AtomizerItems.items.get("stoneIngot") });

		// TODO Alle Ressourcenblöcke
		// Bronze Block
		// GameRegistry.addShapedRecipe(new ItemStack(AtomizerBlocks.), params)

		/* Bronze Tools */

		// Bronze Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzePickaxe")),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get("bronzeIngot"), '|', Items.stick });

		// Bronze Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeAxe")),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get("bronzeIngot"), '|', Items.stick });

		// Bronze Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeShovel")),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get("bronzeIngot"), '|', Items.stick });

		// Bronze Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeHoe")),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get("bronzeIngot"), '|', Items.stick });

		/* Silver Tools */

		// Silver Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverPickaxe")),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get("silverIngot"), '|', Items.stick });

		// Silver Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverAxe")),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get("silverIngot"), '|', Items.stick });

		// Silver Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverShovel")),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get("silverIngot"), '|', Items.stick });

		// Silver Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverHoe")),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get("silverIngot"), '|', Items.stick });

		/* Copper Tools */

		// Copper Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperPickaxe")),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get("copperIngot"), '|', Items.stick });

		// Copper Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperAxe")),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get("copperIngot"), '|', Items.stick });

		// Copper Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperShovel")),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get("copperIngot"), '|', Items.stick });

		// Copper Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperHoe")),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get("copperIngot"), '|', Items.stick });

		/* Tin Tools */

		// Tin Pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinPickaxe")),
				new Object[] { "###", " | ", " | ", '#', AtomizerItems.items.get("tinIngot"), '|', Items.stick });

		// Tin Axe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinAxe")),
				new Object[] { "## ", "#| ", " | ", '#', AtomizerItems.items.get("tinIngot"), '|', Items.stick });

		// Tin Shovel
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinShovel")),
				new Object[] { " # ", " | ", " | ", '#', AtomizerItems.items.get("tinIngot"), '|', Items.stick });

		// Tin Hoe
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinHoe")),
				new Object[] { "## ", " | ", " | ", '#', AtomizerItems.items.get("tinIngot"), '|', Items.stick });

		// Bucket
		GameRegistry.addShapedRecipe(new ItemStack(Items.bucket),
				new Object[] { "   ", "# #", " # ", '#', AtomizerItems.items.get("ironPlate") });

		// Compass
		GameRegistry.addShapedRecipe(new ItemStack(Items.compass),
				new Object[] { " # ", "#R#", " # ", '#', AtomizerItems.items.get("ironPlate"), 'R', Items.redstone });

		// Watch
		GameRegistry.addShapedRecipe(new ItemStack(Items.clock),
				new Object[] { " # ", "#R#", " # ", '#', AtomizerItems.items.get("goldPlate"), 'R', Items.redstone });

		/* Bronze Armor */

		// Bronze Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeSword")),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get("bronzeIngot"), '|', Items.stick });

		// Bronze Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(AtomizerItems.items.get("bronzeIngot"), 4),
				new Object[] { AtomizerItems.items.get("copperIngot"), AtomizerItems.items.get("copperIngot"),
						AtomizerItems.items.get("copperIngot"), AtomizerItems.items.get("tinIngot") });

		// Bronze Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzePlate"), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get("bronzeIngot") });

		// Bronze Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeHelmet")),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get("bronzePlate") });

		// Bronze Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeChest")),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get("bronzePlate") });

		// Bronze Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeLeggings")),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get("bronzePlate") });

		// Bronze Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("bronzeBoots")),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get("bronzePlate") });

		/* Silver Armor */

		// Silver Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverSword")),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get("silverIngot"), '|', Items.stick });

		// Silver Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverPlate"), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get("silverIngot") });

		// Silver Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverHelmet")),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get("silverPlate") });

		// Silver Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverChest")),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get("silverPlate") });

		// Silver Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverLeggings")),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get("silverPlate") });

		// Silver Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("silverBoots")),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get("silverPlate") });

		/* Copper Armor */

		// Copper Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperSword")),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get("copperIngot"), '|', Items.stick });

		// Copper Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperPlate"), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get("copperIngot") });

		// Copper Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperHelmet")),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get("copperPlate") });

		// Copper Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperChest")),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get("copperPlate") });

		// Copper Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperLeggings")),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get("copperPlate") });

		// Copper Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("copperBoots")),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get("copperPlate") });

		/* Tin Armor */

		// Tin Sword
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinSword")),
				new Object[] { " # ", " # ", " | ", '#', AtomizerItems.items.get("tinIngot"), '|', Items.stick });

		// Tin Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinPlate"), 4),
				new Object[] { "##", "##", '#', AtomizerItems.items.get("tinIngot") });

		// Tin Helmet
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinHelmet")),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get("tinPlate") });

		// Tin Chest
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinChest")),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get("tinPlate") });

		// Tin Leggings
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinLeggings")),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get("tinPlate") });

		// Tin Boots
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("tinBoots")),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get("tinPlate") });

		/* Gold Armor */

		// Gold Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("goldPlate"), 4),
				new Object[] { "##", "##", '#', Items.gold_ingot });

		// Gold Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_helmet),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get("goldPlate") });

		// Gold Chest
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_chestplate),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get("goldPlate") });

		// Gold Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_leggings),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get("goldPlate") });

		// Gold Boots
		GameRegistry.addShapedRecipe(new ItemStack(Items.golden_boots),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get("goldPlate") });

		/* Iron Armor */

		// Iron Plate
		GameRegistry.addShapedRecipe(new ItemStack(AtomizerItems.items.get("ironPlate"), 4),
				new Object[] { "##", "##", '#', Items.iron_ingot });

		// Iron Helmet
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_helmet),
				new Object[] { "   ", "###", "# #", '#', AtomizerItems.items.get("ironPlate") });

		// Iron Chest
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_chestplate),
				new Object[] { "# #", "###", "###", '#', AtomizerItems.items.get("ironPlate") });

		// Iron Leggings
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_leggings),
				new Object[] { "###", "# #", "# #", '#', AtomizerItems.items.get("ironPlate") });

		// Iron Boots
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_boots),
				new Object[] { "   ", "# #", "# #", '#', AtomizerItems.items.get("ironPlate") });

		// Minecart
		GameRegistry.addShapedRecipe(new ItemStack(Items.minecart),
				new Object[] { "   ", "# #", "I#I", '#', AtomizerItems.items.get("ironPlate"), 'I', Items.iron_ingot });

		// TODO Alle Schienen ???

		// Boat
		GameRegistry.addShapedRecipe(new ItemStack(Items.boat),
				new Object[] { "   ", "# #", "###", '#', AtomizerItems.items.get("woodenPlank") });

		// TODO Alle Türen

		// TODO Alle Falltüren

		// TODO Zauntor

		// TODO Druckplatte

		// TODO Hebel

		// TODO Notenblock

		// TODO Alle Maschinen

		// TODO Alle Schalen
		GameRegistry.addShapedRecipe(new ItemStack(Items.bowl, 3),
				new Object[] { "   ", "# #", " # ", '#', AtomizerItems.items.get("woodenPlank") });

		// Brewing Stand
		GameRegistry.addShapedRecipe(new ItemStack(Items.brewing_stand),
				new Object[] { "   ", " B ", "SSS", 'S', AtomizerItems.items.get("stoneIngot"), 'B', Items.blaze_rod });

		// TODO Bücherregale

		// Cauldron
		GameRegistry.addShapedRecipe(new ItemStack(Items.cauldron),
				new Object[] { "# #", "# #", "###", '#', AtomizerItems.items.get("ironPlate") });

		// Sign
		GameRegistry.addShapedRecipe(new ItemStack(Items.sign),
				new Object[] { "###", "###", " S ", '#', AtomizerItems.items.get("woodenPlank"), 'S', Items.stick });

		// Bed
		GameRegistry.addShapedRecipe(new ItemStack(Items.bed), new Object[] { "   ", "WWW", "S#S", 'W', Blocks.wool,
				'S', Items.stick, '#', AtomizerItems.items.get("woodenPlank") });

		// Jukebox
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.jukebox),
				new Object[] { "###", "#D#", "###", '#', AtomizerItems.items.get("woodenPlank"), 'D', Items.diamond });

		/* Test-Rezept */
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.testBlock), new Object[] { "IDI", "DPD", "IDI", 'I',
				Items.iron_ingot, 'D', Items.diamond, 'P', Items.iron_pickaxe });

		/* Recipes */

		// SoilePileItem
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.soilBlock),
				new Object[] { "SSS", "SSS", "SSS", 'S', AtomizerItems.items.get("soilPileItem") });
		// Laser1Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get("laser1Item")), new Object[] { "   ", "RIG", "   ",
				'R', Items.redstone, 'I', Items.iron_ingot, 'G', Items.gold_ingot });
		// Laser2Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get("laser2Item")), new Object[] { "   ", "ELG", "   ",
				'E', Items.emerald, 'L', AtomizerItems.items.get("laser1Item"), 'G', Items.gold_ingot });
		// Laser3Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get("laser3Item")), new Object[] { "   ", "DLG", "   ",
				'D', Items.diamond, 'L', AtomizerItems.items.get("laser2Item"), 'G', Items.gold_ingot });
		// Assembler1Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler1Block),
				new Object[] { "GLG", "SCS", "GRG", 'C', Blocks.crafting_table, 'S', Blocks.stone, 'G',
						Items.gold_ingot, 'L', AtomizerItems.items.get("laser1Item"), 'R', Items.redstone });
		// Assembler2Block
		GameRegistry
				.addRecipe(new ItemStack(AtomizerBlocks.assembler2Block),
						new Object[] { "GLG", "ICI", "GRG", 'C', AtomizerBlocks.assembler1Block, 'I', Blocks.iron_block,
								'G', Items.gold_ingot, 'L', AtomizerItems.items.get("laser2Item"), 'R',
								Blocks.redstone_block });
		// Assembler3Block
		GameRegistry
				.addRecipe(new ItemStack(AtomizerBlocks.assembler3Block),
						new Object[] { "GLG", "DCD", "GRG", 'C', AtomizerBlocks.assembler2Block, 'D',
								Blocks.diamond_block, 'G', Items.gold_ingot, 'L', AtomizerItems.items.get("laser3Item"),
								'R', Blocks.redstone_block });
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
