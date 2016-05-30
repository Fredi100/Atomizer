package atomizer.container;

import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerDisassembler1 extends Container{
	
	private TileEntityDisassembler1 te;
	
	
	/**
	 * SLOTS:
	 * 
	 * 24 von links nach rechts zum ersten feld
	 * 32 von oben nach unten zum ersten feld
	 * 
	 * Tile Entity 0-? ....... 0 - ?
	 * Player Inventory ?-? .. ? - ?
	 * Player Inventory ?-? .. ? - ?
	 * 
	 * 
	 * @param playerInv
	 * @param te
	 */
	public ContainerDisassembler1(IInventory playerInv, TileEntityDisassembler1 te) {
		this.te = te;
		
		
		//Disassembler 1, Slot 0-3, Slot IDs 0-3
		this.addSlotToContainer(new SlotItemHandler(te.getItemStackHandler(),0,35,32));//Input Field
		this.addSlotToContainer(new SlotItemHandler(te.getItemStackHandler(),1,70,59));//Fuel Field
		this.addSlotToContainer(new SlotItemHandler(te.getItemStackHandler(),2,125,31));//Ouput Field
		this.addSlotToContainer(new SlotItemHandler(te.getItemStackHandler(),3,125,59));//Luck Field
		
		//Player Inventory, Slot 0-8, Slot IDs 4-12
		for(int x = 0; x < 9; x++){
			this.addSlotToContainer(new Slot(playerInv,x+4,8 + x*18,142));//Player Quick Bar Field
		}
		
		//Player Inventory, Slot 9-35, Slot IDs 13-39
		for(int y = 0; y < 3; y++){
			for(int x = 0; x < 9;x++){
				this.addSlotToContainer(new Slot(playerInv,x + y*9 + 13,8 + x*18,84 + y*18));
			}
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}

}
