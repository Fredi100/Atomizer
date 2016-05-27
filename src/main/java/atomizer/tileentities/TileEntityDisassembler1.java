
package atomizer.tileentities;

import java.util.ArrayList;

import atomizer.lib.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.collection.TraversableOnce.OnceCanBuildFrom;

public class TileEntityDisassembler1 extends TileEntity implements ITickable, IInventory {

	public static final String UNLOCALIZED_TILEENTITY_NAME = "Disassembler1TileEntity";

	public static final String INPUT_STACK_TAG = "inputStack";
	private ItemStack inputStack;

	public static final String OUTPUT_STACK_TAG = "outputStack";
	private ItemStack outputStack;

	private ItemStack[] inventory;

	private String customName;

	/* Dient nur zu Testzwecken */
	private boolean aBoolean;
	private byte aByte;
	private short aShort;
	private int anInt;
	private long aLong;
	private float aFloat;
	private double aDouble;
	private String aString;
	private byte[] aByteArray;
	private int[] anIntArray;

	private ItemStack anItemStack;

	private ArrayList aList = new ArrayList();

	public TileEntityDisassembler1() {
		this.inventory = new ItemStack[this.getSizeInventory()];
	}

	/**
	 * Gets called every tick. 20 times per second
	 */
	@Override
	public void update() {
		
	}

	/**
	 * Dient dem Speichern von Werten der TileEntity
	 * 
	 */
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		/* Dient nur zu Testzwecken */
		// Primitives:
		compound.setBoolean("aBoolean", this.aBoolean);
		compound.setByte("aByte", this.aByte);
		compound.setShort("aShort", this.aShort);
		compound.setInteger("anInt", this.anInt);
		compound.setLong("aLong", this.aLong);
		compound.setFloat("aFloat", this.aFloat);
		compound.setDouble("aDouble", this.aDouble);
		compound.setString("aString", this.aString);
		compound.setByteArray("aByteArray", this.aByteArray);
		compound.setIntArray("anIntArray", this.anIntArray);

		// Item Stack:
		NBTTagCompound stack = new NBTTagCompound();
		this.anItemStack.writeToNBT(stack);
		compound.setTag("anItemStack", stack);

		NBTTagList list = new NBTTagList();
	    for (int i = 0; i < this.getSizeInventory(); ++i) {
	        if (this.getStackInSlot(i) != null) {
	            NBTTagCompound stackTag = new NBTTagCompound();
	            stackTag.setByte("Slot", (byte) i);
	            this.getStackInSlot(i).writeToNBT(stackTag);
	            list.appendTag(stackTag);
	        }
	    }
	    compound.setTag("Items", list);

	    if (this.hasCustomName()) {
	    	compound.setString("CustomName", this.getCustomName());
	    }
	}

	/**
	 * Dient dem Lesen von Werten der TileEntity
	 * 
	 */

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

		/* Dient nur zu Testzwecken */
		// Primitives:
		this.aBoolean = compound.getBoolean("aBoolean");
		this.aByte = compound.getByte("aByte");
		this.aShort = compound.getShort("aShort");
		this.anInt = compound.getInteger("anInt");
		this.aLong = compound.getLong("aLong");
		this.aFloat = compound.getFloat("aFloat");
		this.aDouble = compound.getDouble("aDouble");
		this.aString = compound.getString("aString");
		this.aByteArray = compound.getByteArray("aByteArray");
		this.anIntArray = compound.getIntArray("anIntArray");

		// ItemStack:
		this.anItemStack = ItemStack.loadItemStackFromNBT(compound.getCompoundTag("anItemStack"));

		NBTTagList list = compound.getTagList("Items", 10);
	    for (int i = 0; i < list.tagCount(); ++i) {
	        NBTTagCompound stackTag = list.getCompoundTagAt(i);
	        int slot = stackTag.getByte("Slot") & 255;
	        this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
	    }

	    if (compound.hasKey("CustomName", 8)) {
	        this.setCustomName(compound.getString("CustomName"));
	    }
	}

	public String getCustomName() {
		return this.hasCustomName() ? this.customName : "container.tutorial_tile_entity";
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	private int fill;

	public static final String publicName = "tileEntityAssembler1";
	private String name = "tileEntityAssembler1";

	public String getName() {
		return name;
	}

	public boolean isUsableByPlayer(EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Gibt die Größe des Inventars zurück
	 * 
	 * @return Die Größe des Inventars als int;
	 */
	@Override
	public int getSizeInventory() { // Die Größe des Inventars
		return 9;
	}

	/**
	 * Gibt einen ItemStack an der verlangten Stelle zurück
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
	 * und gibt ein ItemStack mit der Anzahl an Items zurück die entfernt wurde.
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
	 * Setzt den Inhalt eines Slots. Überprüft nicht ob das Item gültig für
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
	 * Gibt die maximale Stack größe zurück die in einem Slot vorhanden sein
	 * darf.
	 * 
	 * @return Die maximale Anzahl an Items in einem Slot
	 */

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		return false;
	}

	@Override
	public boolean hasCustomName() {
		return this.customName != null && !this.customName.equals("");
	}

	@Override
	public IChatComponent getDisplayName() {
		//No idea what this does
		return this.hasCustomName() ? new ChatComponentText(this.getName()) : new ChatComponentTranslation(this.getName());
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return null;
	}

	@Override
	public void openInventory(EntityPlayer player) {

	}

	@Override
	public void closeInventory(EntityPlayer player) {

	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {

	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return false;
	}

}
