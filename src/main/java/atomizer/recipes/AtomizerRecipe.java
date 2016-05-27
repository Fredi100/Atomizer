package atomizer.recipes;

import net.minecraft.item.ItemStack;

public class AtomizerRecipe {
	private String recipeName;
	private ItemStack[] in;
	private ItemStack[] out;
	
	public AtomizerRecipe(String recipeName, ItemStack[] in, ItemStack[] out){
		this.recipeName = recipeName;
		this.in = in;
		this.out = out;
	}
	
	public String getRecipeName(){
		return this.recipeName;
	}
	
	public ItemStack[] getInput(){
		return in;
	}
	
	public ItemStack[] getOutput(){
		return out;
	}
}
