package atomizer.recipies;

import atomizer.blocks.AtomizerBlocks;
import atomizer.items.AtomizerItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AtomizerRecipies{
	
	/**
	 * Initialisiert alle Rezepte
	 */
	public static void init(){
		/*Test-Rezept*/
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.testBlock), new Object[]{
			"IDI",
			"DPD",
			"IDI",
			'I', Items.iron_ingot, 'D', Items.diamond, 'P', Items.iron_pickaxe
		});
		
		/*Recipes*/
		
		//SoilePileItem
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.soilBlock), new Object[]{
			"SSS",
			"SSS",
			"SSS",
			'S', AtomizerItems.items.get("soilPileItem")
		});
		//Laser1Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get("laser1Item")), new Object[]{
			"   ",
			"RIG",
			"   ",
			'R', Items.redstone, 'I', Items.iron_ingot, 'G', Items.gold_ingot
		});
		//Laser2Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get("laser2Item")), new Object[]{
			"   ",
			"ELG",
			"   ",
			'E', Items.emerald, 'L', AtomizerItems.items.get("laser1Item"), 'G', Items.gold_ingot
		});
		//Laser3Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.items.get("laser3Item")), new Object[]{
			"   ",
			"DLG",
			"   ",
			'D', Items.diamond, 'L', AtomizerItems.items.get("laser2Item"), 'G', Items.gold_ingot
		});
		//Assembler1Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler1Block), new Object[]{
			"GLG",
			"SCS",
			"GRG",
			'C', Blocks.crafting_table, 'S', Blocks.stone, 'G', Items.gold_ingot, 'L', AtomizerItems.items.get("laser1Item"), 'R', Items.redstone
		});
		//Assembler2Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler2Block), new Object[]{
			"GLG",
			"ICI",
			"GRG",
			'C', AtomizerBlocks.assembler1Block, 'I', Blocks.iron_block, 'G', Items.gold_ingot, 'L', AtomizerItems.items.get("laser2Item"), 'R', Blocks.redstone_block
		});
		//Assembler3Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler3Block), new Object[]{
			"GLG",
			"DCD",
			"GRG",
			'C', AtomizerBlocks.assembler2Block, 'D', Blocks.diamond_block, 'G', Items.gold_ingot, 'L', AtomizerItems.items.get("laser3Item"), 'R', Blocks.redstone_block
		});
	}
}
