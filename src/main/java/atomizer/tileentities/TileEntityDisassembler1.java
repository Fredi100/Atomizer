
package atomizer.tileentities;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityDisassembler1 extends TileEntity implements IInventory, IUpdatePlayerListBox {

	public static final String UNLOCALIZED_TILEENTITY_NAME = "Disassembler1TileEntity";

	public static final String INPUT_STACK_TAG = "inputStack";
	private ItemStack inputStack;

	public static final String OUTPUT_STACK_TAG = "outputStack";
	private ItemStack outputStack;

	private ItemStack[] inventory;

	private String customName;

	public TileEntityDisassembler1() {
		this.inventory = new ItemStack[this.getSizeInventory()];
	}

	/**
	 * Diese Methode wird nach jedem Tick aufgerufen, also 20 mal pro Sekunde
	 */
	@Override
	public void update() {
		// Hier kann was gemacht werden
	}

	/**
	 * Dient dem Speichern von Werten der TileEntity
	 * 
	 */
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		// Item Stack
		NBTTagCompound inputStack = new NBTTagCompound();
		this.inputStack.writeToNBT(inputStack);
		compound.setTag(INPUT_STACK_TAG, inputStack);

		NBTTagCompound outputStack = new NBTTagCompound();
		this.outputStack.writeToNBT(outputStack);
		compound.setTag(OUTPUT_STACK_TAG, outputStack);

	}

	/**
	 * Dient dem Lesen von Werten der TileEntity
	 * 
	 */
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		// ItemStack
		NBTTagCompound stack = compound.getCompoundTag(INPUT_STACK_TAG);
		this.inputStack = ItemStack.loadItemStackFromNBT(stack);

		stack = compound.getCompoundTag(OUTPUT_STACK_TAG);
		this.outputStack = ItemStack.loadItemStackFromNBT(stack);
	}

	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	/*
	 * private int fill;
	 * 
	 * public static final String publicName = "tileEntityAssembler1"; private
	 * String name = "tileEntityAssembler1";
	 * 
	 * public String getName(){ return name; }
	 * 
	 * @Override public void writeToNBT(NBTTagCompound par1){
	 * super.writeToNBT(par1); par1.setInteger("fill", fill); }
	 * 
	 * @Override public void readFromNBT(NBTTagCompound par1){
	 * super.readFromNBT(par1); this.fill = par1.getInteger("fill"); }
	 * 
	 * //Zum drauf zugreifen auf die Daten von egal wo TileEntityYour tile =
	 * (TileEntityYour) world.getBlockTileEntity(i, j, k); if (tile != null){
	 * int l = tile.customField; }
	 */

	public boolean isUsableByPlayer(EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Gibt die Gr��e des Inventars zur�ck
	 * 
	 * @return Die Gr��e des Inventars als int;
	 */
	@Override
	public int getSizeInventory() {
		// Die Gr��e des Inventars
		return 9;
	}

	/**
	 * Gibt einen ItemStack an der verlangten Stelle zur�ck
	 * 
	 * @param index
	 *            Der Slot von dem der ItemStack verlangt wird
	 * @return Das verlangte ItemStack
	 */
	@Override
	public ItemStack getStackInSlot(int index) {
		if (index < 0 || index >= this.getSizeInventory())
			return null;
		return this.inventory[index];
	}

	/**
	 * Veringert die Anzahl an Items in dem gegenen Slot um die gegebene Anzahl
	 * und gibt ein ItemStack mit der Anzahl an Items zur�ck die entfernt wurde.
	 * 
	 * @param index
	 *            Der Slot an dem die Items veringert werden
	 * @param count
	 *            Die Anzahl an Items die entfernt werden sollen
	 * @return Ein ItemStack mit den entfernten Items
	 */
	@Override
	public ItemStack decrStackSize(int index, int count) {
		if (this.getStackInSlot(index) != null) {
			ItemStack itemstack;

			if (this.getStackInSlot(index).stackSize <= count) {
				itemstack = this.getStackInSlot(index);
				this.setInventorySlotContents(index, null);
				this.markDirty();
				return itemstack;
			} else {
				itemstack = this.getStackInSlot(index).splitStack(count);

				if (this.getStackInSlot(index).stackSize <= 0) {
					this.setInventorySlotContents(index, null);
				} else {
					// Just to show that changes happened
					this.setInventorySlotContents(index, this.getStackInSlot(index));
				}

				this.markDirty();
				return itemstack;
			}
		} else {
			return null;
		}
	}

	/**
	 * Leert einen Slot und gibt seinen vorherigen Inhalt zur�ck
	 * 
	 * @param index
	 *            Der verlangte Slot
	 * @return Ein ItemStack mit dem Inhalt des geleerten Slots
	 */
	@Override
	public ItemStack getStackInSlotOnClosing(int index) {
		ItemStack stack = this.getStackInSlot(index);
		this.setInventorySlotContents(index, null);
		return stack;
	}

	/**
	 * Setzt den Inhalt eines Slots. �berpr�ft nicht ob das Item g�ltig f�r
	 * diesen Slot ist.
	 * 
	 * @param index
	 *            Der verlangte Slot
	 * @param stack
	 *            Der ItemStack der in den Slot gegeben werden soll
	 */
	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		if (index < 0 || index >= this.getSizeInventory())
			return;

		if (stack != null && stack.stackSize > this.getInventoryStackLimit())
			stack.stackSize = this.getInventoryStackLimit();

		if (stack != null && stack.stackSize == 0)
			stack = null;

		this.inventory[index] = stack;
		this.markDirty();
	}

	/**
	 * Gibt den Namen des Inventars zur�ck
	 * 
	 * @return Der Name des Inventars als String
	 */
	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Schaut ob das Inventar einen eigenen Namen hat
	 * 
	 * @return Ob der Inventar einen eigenen Namen hat
	 */
	@Override
	public boolean hasCustomInventoryName() {
		return this.getInventoryName() != null && !this.customName.equals("");
	}

	/**
	 * Gibt die maximale Stack gr��e zur�ck die in einem Slot vorhanden sein darf.
	 * 
	 * @return Die maximale Anzahl an Items in einem Slot
	 */
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	/**
	 * Gibt zur�ck ober der �bergebene Spieler das Inventar verwenden darf
	 * 
	 * @param player Der Spieler der das Inventar verwenden m�chte
	 * @return Ob der �bergebene Spieler das Inventar verwenden darf
	 */
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}

	/**
	 * Leer implementierung
	 */
	@Override
	public void openInventory() {
		
	}

	/**
	 * Leer implementierung
	 */
	@Override
	public void closeInventory() {
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return false;
	}

}