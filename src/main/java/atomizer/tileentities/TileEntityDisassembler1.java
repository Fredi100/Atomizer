
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

	private ItemStack input;
	private ItemStack fuel;

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

		this.updateInputStack();
		this.updateFuelStack();

		/* Testing Purpose */
		this.printFuelTime();
		this.printCrushingTime();

		this.updateCrushingTime();

		this.updateFuelTime();

		this.consumeFuleCrushNewItem();

		this.crushItem();

	}

	private void crushItem() {

		if (this.worldObj.isRemote || this.disassemblerChrushingTime > 0) {

		} else {
			for (RecipeDisassembler rd : AtomizerRecipes.disassembler.values()) {
				if (this.recipeForInputFound(rd)) {
					ItemStack[] recipeOutput = this.getRecipeOutput(rd);
					if (this.outputIsCompatible(recipeOutput)) {
						this.extractNewItems(recipeOutput);
						this.extractAvailableLuckItems(rd);
					}
				}
			}
		}
	}

	private void extractAvailableLuckItems(RecipeDisassembler rd) {
		if (rd.getLuck() != null) {
			int luck = (int) (rd.getLuck().length * Math.random());
			if (rd.getLuck()[luck] != null) {
				if (ish.getStackInSlot(SLOT_LUCK) == null
						|| ish.getStackInSlot(SLOT_LUCK).getItem().equals(rd.getLuck()[luck].getItem())
						|| ish.getStackInSlot(SLOT_LUCK).getItem() == null) {
					ish.insertItem(SLOT_LUCK, rd.getLuck()[luck].copy(), false);
				}
			}
		}
	}

	private boolean outputIsCompatible(ItemStack[] recipeOutput) {
		if (outputSlot1IsCompatible(recipeOutput) && this.outputSlot2IsCompatible(recipeOutput)) {
			return true;
		}
		return false;
	}

	private void extractNewItems(ItemStack[] recipeOutput) {
		ish.extractItem(SLOT_INPUT, 1, false);
		ish.insertItem(SLOT_OUTPUT1, recipeOutput[0].copy(), false);
		if (recipeOutput[1] != null) {
			ish.insertItem(SLOT_OUTPUT2, recipeOutput[1].copy(), false);
		}
	}

	private boolean outputSlot2IsCompatible(ItemStack[] recipeOutput) {
		if (ish.getStackInSlot(SLOT_OUTPUT2) == null || recipeOutput[1] == null
				|| ish.getStackInSlot(SLOT_OUTPUT2).getItem().equals(recipeOutput[1].getItem())
				|| ish.getStackInSlot(SLOT_OUTPUT2).getItem() == null) {
			return true;
		}
		return false;
	}

	private boolean outputSlot1IsCompatible(ItemStack[] recipeOutput) {
		if (ish.getStackInSlot(SLOT_OUTPUT1) == null
				|| ish.getStackInSlot(SLOT_OUTPUT1).getItem().equals(recipeOutput[0].getItem())
				|| ish.getStackInSlot(SLOT_OUTPUT1).getItem() == null) {
			return true;
		}
		return false;
	}

	private ItemStack[] getRecipeOutput(RecipeDisassembler rd) {
		ItemStack[] recipeOutput = new ItemStack[2];
		recipeOutput[0] = rd.getOutput()[0];
		recipeOutput[1] = rd.getOutput()[1];
		return recipeOutput;
	}

	private boolean recipeForInputFound(RecipeDisassembler rd) {
		if (this.recipeInputNotNull(rd)) {
			if (rd.getInput().getItem().equals(input.getItem())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if the Recipe input and the TE Input stack is not null
	 * 
	 * @param rd
	 *            The RecipeDisassembler object for which the input gets checked
	 * @return Wether the Input and the Recipe input is not null
	 */
	private boolean recipeInputNotNull(RecipeDisassembler rd) {
		if (rd.getInput() == null || input == null || rd.getInput().getItem() == null || input.getItem() == null) {
			return false;
		}
		return true;
	}

	/**
	 * Prints the curshingTime of this TE
	 */
	private void printCrushingTime() {
		if (this.disassemblerChrushingTime % 10 == 0) {
			System.out.println("CrushingTime: " + this.disassemblerChrushingTime);
		}
	}

	/**
	 * Prints the fuelTime of this TE
	 */
	private void printFuelTime() {
		if (this.disassemblerFuelTime % 10 == 0) {
			System.out.println("FuleTime: " + this.disassemblerFuelTime);
		}
	}

	/**
	 * Loads the currently available FuelItemStack
	 */
	private void updateFuelStack() {
		this.fuel = this.ish.getStackInSlot(SLOT_FUEL);
	}

	/**
	 * Loads the currently available InputItemStack
	 */
	private void updateInputStack() {
		this.input = this.ish.getStackInSlot(SLOT_INPUT);
	}

	/**
	 * If the crushingTime hits 0 it checks, wethere there is any fuel in the
	 * fuelSlot and if there is something to be processed. It the consumes one
	 * of the fuel and refreshes the crushing time
	 */
	private void consumeFuleCrushNewItem() {
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
				} else if (ish.getStackInSlot(SLOT_OUTPUT1).getItem() == rd.getOutput()[0].getItem()
						&& ish.getStackInSlot(SLOT_OUTPUT1).stackSize + rd.getOutput()[0].stackSize <= 64) {
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
	}

	/**
	 * If this TE has fuelTime left, it will get reduced by one
	 */
	private void updateFuelTime() {
		if (this.hasFuel()) {
			--this.disassemblerFuelTime;
		}

	}

	/**
	 * If this TE has crushingTime and fuleTime left it is considered crushing
	 * right now. Therefore the crushingTime will be dedreased by one. If it is
	 * not crushing anymore, the crushingTime will be set back to 100.
	 * 
	 */
	private void updateCrushingTime() {
		if (this.isCrushing() && AtomizerRecipes.containsDisassemblerRecipe(input)) {
			RecipeDisassembler rd = AtomizerRecipes.getDisassemblerRecipe(input);
			if (ish.getStackInSlot(SLOT_OUTPUT1) == null || ish.getStackInSlot(SLOT_OUTPUT1).getItem() == null
					|| ish.getStackInSlot(SLOT_OUTPUT1).getItem() == rd.getOutput()[0].getItem()) {
				--this.disassemblerChrushingTime;
			}
		} else {
			this.disassemblerChrushingTime = this.getMaxCrushTime();
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

	public int getMaxCrushTime() {
		return 200;
	}
}
