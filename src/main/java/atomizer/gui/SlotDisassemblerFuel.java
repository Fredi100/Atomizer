package atomizer.gui;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotDisassemblerFuel extends SlotItemHandler{

	public SlotDisassemblerFuel(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Credits to Minecraft
	 * This is not my own Method
	 */
	@Override
	public boolean isItemValid(ItemStack stack){
		return TileEntityFurnace.isItemFuel(stack) || isBucket(stack);
	}
	
	/**
	 * Credits to Minecraft
	 * This is not my own Method
	 */
	@Override
	public int getItemStackLimit(ItemStack stack){
		return isBucket(stack) ? 1 : super.getItemStackLimit(stack);
	}
	
	/**
	 * Credits to Minecraft
	 * This is not my own Method
	 * 
	 * @param stack
	 * @return
	 */
	public static boolean isBucket(ItemStack stack){
        return stack != null && stack.getItem() != null && stack.getItem() == Items.bucket;
    }
	
}
