package atomizer.recipes;

import net.minecraft.item.ItemStack;

public class RecipeDisassembler {
	private String recipeName;
	private ItemStack in;
	private ItemStack[] out;
	private ItemStack[] luck;
	
	public RecipeDisassembler(String recipeName, ItemStack in, ItemStack[] out, ItemStack[] luck){
		this.recipeName = recipeName;
		this.in = in;
		this.out = out;
		this.luck = luck;
	}
	
	public String getRecipeName(){
		return this.recipeName;
	}
	
	public ItemStack getInput(){
		return in;
	}
	
	public ItemStack[] getOutput(){
		return out;
	}
	
	public ItemStack[] getLuck(){
		return luck;
	}
}
