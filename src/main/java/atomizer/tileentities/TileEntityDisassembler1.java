
package atomizer.tileentities;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import atomizer.lib.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import scala.collection.TraversableOnce.OnceCanBuildFrom;

public class TileEntityDisassembler1 extends TileEntity implements ITickable {

	public static final String UNLOCALIZED_TILEENTITY_NAME = "Disassembler1TileEntity";

	public static final int SLOT_INPUT = 0;
	public static final int SLOT_FUEL = 1;
	public static final int SLOT_OUTPUT = 2;
	public static final int SLOT_LUCK = 3;

	private ItemStackHandler ish;
	private int disassemblerFuelTime;
	private int disassemblerChrushingTime;

	@CapabilityInject(ItemHandler.class)
	static Capability<ItemHandler> ITEM_HANDLER_CAPABILITY = null;

	private ArrayList aList = new ArrayList();

	public TileEntityDisassembler1() {
		ish = new ItemStackHandler(4);
	}

	/**
	 * Gets called every tick. 20 times per seconds
	 */
	@Override
	public void update() {
		System.out.println("FuleTime: " + this.disassemblerFuelTime);
		System.out.println("CrushingTime: " + this.disassemblerChrushingTime);
		
		ItemStack input = this.ish.getStackInSlot(SLOT_INPUT);

		// If this TE has crushingTime left and has FuleTime left
		// it is considered crushing right now. Therefore
		// the crushing time will be decreased by one.
		// If it is not crushing anymore, the crushing time will
		// be set back to 100
		if (this.isCrushing()) {
			--this.disassemblerChrushingTime;
		} else {
			this.disassemblerChrushingTime = 100;
		}

		// If this TE has fuelTime left,
		// it will get reduced by one
		if (this.hasFuel()) {
			--this.disassemblerFuelTime;
		}

		// If the crushingTime meets 0 it should check, if there is any Fuel and
		// then consumes one of this fuel and refreshes the chrushingTime
		if (this.disassemblerFuelTime < 1) {
			ItemStack fuel = this.ish.getStackInSlot(SLOT_FUEL);
			if (fuel != null && TileEntityFurnace.isItemFuel(fuel)) {
				this.disassemblerFuelTime = TileEntityFurnace.getItemBurnTime(fuel);
				this.ish.extractItem(SLOT_FUEL, 1, false);
			}
		}

		if (!this.worldObj.isRemote) {
			
			if(this.isCrushing())// && DisassemblerRecipe.inputItem == input){
			{
			}
		}
	}

	/**
	 * Checks whether or not this TileEntity has crushing time left
	 * 
	 * @return If the TileEntity is still crushing
	 */
	public boolean hasFuel() {
		return this.disassemblerFuelTime > 0;
	}

	public boolean isCrushing() {
		return this.disassemblerChrushingTime > 0 && this.hasFuel();
	}

	public ItemStackHandler getItemStackHandler() {
		return ish;
	}

	/**
	 * Dient dem Speichern von Werten der TileEntity
	 * 
	 */
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
	}

	/**
	 * TODO Überprüft, ob diese Fähigkeit vorhanden ist
	 */
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if (capability == ITEM_HANDLER_CAPABILITY) {
			return true;
		}
		return false;
	}

	/**
	 * TODO Gibt die verlangte Fähigkeit zurück
	 */
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if (capability == ITEM_HANDLER_CAPABILITY) {
			return (T) ish;
		}
		return null;
	}

	/**
	 * Dient dem Lesen von Werten der TileEntity
	 * 
	 */
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);

	}

	public boolean isUsableByPlayer(EntityPlayer playerIn) {
		return true;
	}
}
