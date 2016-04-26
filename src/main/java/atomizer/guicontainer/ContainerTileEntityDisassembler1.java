package atomizer.guicontainer;

import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

public class ContainerTileEntityDisassembler1 extends Container{
	
	private TileEntityDisassembler1 te;
	
	
	/**
	 * SLOTS:
	 * 
	 * Tile Entity 0-? ....... 0 - ?
	 * Player Inventory ?-? .. ? - ?
	 * Player Inventory ?-? .. ? - ?
	 * 
	 * 
	 * @param playerInv
	 * @param te
	 */
	public ContainerTileEntityDisassembler1(IInventory playerInv, TileEntityDisassembler1 te) {
		this.te = te;
		// TODO Hier muss ich die ganzen Slots machen
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}

}
