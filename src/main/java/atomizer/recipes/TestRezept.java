package atomizer.recipes;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class TestRezept implements IRecipe{

	@Override
	public ItemStack getCraftingResult(InventoryCrafting arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Gibt lediglich die gr��e des Verwendeten Arbeitsbereiches f�r das Rezept zur�ck
	 */
	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean matches(InventoryCrafting arg0, World arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting inv) {
		// TODO Auto-generated method stub
		return null;
	}

}
