package atomizer.container;

import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

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
		
		// Unsere Slots 0 und 1, Slot ID 0 und 1
		//this.addSlotToContainer(new Slot(te, 0, 24, 32));
		
		// TODO Hier muss ich die ganzen Slots machen
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}

}
