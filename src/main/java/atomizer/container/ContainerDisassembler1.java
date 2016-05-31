package atomizer.container;

import atomizer.gui.SlotDisassemblerFuel;
import atomizer.gui.SlotDisassemblerOutput;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerDisassembler1 extends Container{
	
	private TileEntityDisassembler1 te;
	
	
	/**
	 * Inventar vom Tile Entity
	 * Slot 0-3, Slot IDs 0-3
	 * 
	 * Inventar vom Spieler
	 * Slot 0-8, Slot IDs 0-8
	 * Slot 9-35, Slot IDs 9-35
	 * 
	 * @param playerInv
	 * @param te
	 */
	public ContainerDisassembler1(IInventory playerInv, TileEntityDisassembler1 te) {
		this.te = te;
		
		//Disassembler 1, Slot 0-4, Slot IDs 0-4
		this.addSlotToContainer(new SlotItemHandler(te.getItemStackHandler(),te.SLOT_INPUT,35,32));//Input Field
		this.addSlotToContainer(new SlotDisassemblerFuel(te.getItemStackHandler(),te.SLOT_FUEL,70,59));//Fuel Field
		this.addSlotToContainer(new SlotDisassemblerOutput(te.getItemStackHandler(),te.SLOT_OUTPUT1,119,31));//Ouput Field
		this.addSlotToContainer(new SlotDisassemblerOutput(te.getItemStackHandler(),te.SLOT_OUTPUT2,147,31));//Ouput Field
		this.addSlotToContainer(new SlotDisassemblerOutput(te.getItemStackHandler(),te.SLOT_LUCK,133,59));//Luck Field
		
		//Player Inventory, Slot 0-8, Slot IDs 0-8
		for(int x = 0; x < 9; x++){
			this.addSlotToContainer(new Slot(playerInv,x,8 + x*18,142));//Player Quick Bar Field
		}
		
		//Player Inventory, Slot 9-35, Slot IDs 9-36
		for(int y = 0; y < 3; y++){
			for(int x = 0; x < 9;x++){
				this.addSlotToContainer(new Slot(playerInv,x + y*9 + 9,8 + x*18,84 + y*18));
			}
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}

}
