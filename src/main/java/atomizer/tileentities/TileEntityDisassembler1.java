
package atomizer.tileentities;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import atomizer.lib.Constants;
import atomizer.recipes.AtomizerRecipes;
import atomizer.recipes.RecipeDisassembler;
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
	public static final int SLOT_OUTPUT1 = 2;
	public static final int SLOT_OUTPUT2 = 3;
	public static final int SLOT_LUCK = 4;

	private ItemStackHandler ish;
	private int disassemblerFuelTime;
	private int disassemblerMaxFuelTime;
	private int disassemblerChrushingTime;

	@CapabilityInject(ItemHandler.class)
	static Capability<ItemHandler> ITEM_HANDLER_CAPABILITY = null;

	private ArrayList aList = new ArrayList();

	public TileEntityDisassembler1() {
		// Last Slot Variable + 1
		ish = new ItemStackHandler(SLOT_LUCK + 1);
	}

	/**
	 * Gets called every tick. 20 times per seconds
	 */
	@Override
	public void update() {
		ItemStack input = this.ish.getStackInSlot(SLOT_INPUT);
		ItemStack fuel = this.ish.getStackInSlot(SLOT_FUEL);

		// Testing Purpose
		if (this.disassemblerFuelTime % 10 == 0) {
			System.out.println("FuleTime: " + this.disassemblerFuelTime);
		}
		if (this.disassemblerChrushingTime % 10 == 0) {
			System.out.println("CrushingTime: " + this.disassemblerChrushingTime);
		}

		// If this TE has crushingTime left and has FuleTime left
		// it is considered crushing right now. Therefore
		// the crushing time will be decreased by one.
		// If it is not crushing anymore, the crushing time will
		// be set back to 100
		if (this.isCrushing() && AtomizerRecipes.containsDisassemblerRecipe(input)) {
			RecipeDisassembler rd = AtomizerRecipes.getDisassemblerRecipe(input);
			if (ish.getStackInSlot(SLOT_OUTPUT1) == null || ish.getStackInSlot(SLOT_OUTPUT1).getItem() == null
					|| ish.getStackInSlot(SLOT_OUTPUT1).getItem() == rd.getOutput()[0].getItem()) {
				--this.disassemblerChrushingTime;
			}
		} else {
			this.disassemblerChrushingTime = 200;
		}

		// If this TE has fuelTime left,
		// it will get reduced by one
		if (this.hasFuel()) {
			--this.disassemblerFuelTime;
		}

		// If the crushingTime meets 0 it should check, if there is any Fuel and
		// if there is something to be processed
		// then consumes one of this fuel and refreshes the chrushingTime
		if (this.disassemblerFuelTime < 1) {
			if (AtomizerRecipes.containsDisassemblerRecipe(input)) {
				System.out.println("Input has a Recipe");
				RecipeDisassembler rd = AtomizerRecipes.getDisassemblerRecipe(input);
				if (ish.getStackInSlot(SLOT_OUTPUT1) == null || ish.getStackInSlot(SLOT_OUTPUT1).getItem() == null) {
					System.out.println("Output 1 is empty");
					if (fuel != null && TileEntityFurnace.isItemFuel(fuel)) {
						System.out.println("Consuming Fuel");
						this.disassemblerFuelTime = TileEntityFurnace.getItemBurnTime(fuel);
						this.disassemblerMaxFuelTime = TileEntityFurnace.getItemBurnTime(fuel);
						this.ish.extractItem(SLOT_FUEL, 1, false);
					} else {
						System.out.println("No valid Fuel existant");
					}
				} else if (ish.getStackInSlot(SLOT_OUTPUT1).getItem() == rd.getOutput()[0].getItem() && ish.getStackInSlot(SLOT_OUTPUT1).stackSize + rd.getOutput()[0].stackSize <= 64) {
					System.out.println("Output 1 is not empty but contains Recipe Output");
					if (fuel != null && TileEntityFurnace.isItemFuel(fuel)) {
						System.out.println("Consuming Fuel");
						this.disassemblerFuelTime = TileEntityFurnace.getItemBurnTime(fuel);
						this.disassemblerMaxFuelTime = TileEntityFurnace.getItemBurnTime(fuel);
						this.ish.extractItem(SLOT_FUEL, 1, false);
					} else {
						System.out.println("No valid Fuel existent");
					}
				} else {
					System.out.println("Output 1 is not clear for new Output!");
				}
			} else {
				System.out.println("Input does not have a Recipe!");
			}
		} else {
			System.out.println("Still Fuel left!");
		}

		if (!this.worldObj.isRemote) {
			if (this.disassemblerChrushingTime < 1) {
				for (RecipeDisassembler rd : AtomizerRecipes.disassembler.values()) {
					if (rd.getInput() != null && input != null && rd.getInput().getItem() != null
							&& input.getItem() != null) {
						if (rd.getInput().getItem().equals(input.getItem())) {
							ItemStack output1 = rd.getOutput()[0];
							ItemStack output2 = rd.getOutput()[1];
							if (output1 != null) {
								if (ish.getStackInSlot(SLOT_OUTPUT1) == null
										|| ish.getStackInSlot(SLOT_OUTPUT1).getItem().equals(output1.getItem())
										|| ish.getStackInSlot(SLOT_OUTPUT1).getItem() == null) {
									if (ish.getStackInSlot(SLOT_OUTPUT2) == null || output2 == null
											|| ish.getStackInSlot(SLOT_OUTPUT2).getItem().equals(output2.getItem())
											|| ish.getStackInSlot(SLOT_OUTPUT2).getItem() == null) {
										System.out.println("Stelle her");
										ish.extractItem(SLOT_INPUT, 1, false);
										ish.insertItem(SLOT_OUTPUT1, rd.getOutput()[0].copy(), false);
										if(output2 != null){
											ish.insertItem(SLOT_OUTPUT2, rd.getOutput()[1].copy(), false);
										}
										if (rd.getLuck() != null) {
											int luck = (int) (rd.getLuck().length * Math.random());
											if (rd.getLuck()[luck] != null) {
												if (ish.getStackInSlot(SLOT_LUCK) == null
														|| ish.getStackInSlot(SLOT_LUCK).getItem()
																.equals(rd.getLuck()[luck].getItem())
														|| ish.getStackInSlot(SLOT_LUCK).getItem() == null) {
													ish.insertItem(SLOT_LUCK, rd.getLuck()[luck].copy(), false);
												}
											}
										}
									}
								}
							}
						}
					}
				}
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

	public int getFuelTime() {
		return disassemblerFuelTime;
	}

	public int getCrushTime() {
		return disassemblerChrushingTime;
	}

	public int getMaxFuelTime() {
		return disassemblerMaxFuelTime;
	}
}
