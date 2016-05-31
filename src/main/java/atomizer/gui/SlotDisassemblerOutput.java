package atomizer.gui;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotDisassemblerOutput extends SlotItemHandler{

	public SlotDisassemblerOutput(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isItemValid(ItemStack stack){
		return false;
	}

}
