
package atomizer.tileentities;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import atomizer.lib.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
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

public class TileEntityDisassembler1 extends TileEntity implements ITickable{

	public static final String UNLOCALIZED_TILEENTITY_NAME = "Disassembler1TileEntity";

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
	
	private ItemStackHandler ish;
	
	@CapabilityInject(ItemHandler.class)
	static Capability<ItemHandler> ITEM_HANDLER_CAPABILITY = null;

	private ArrayList aList = new ArrayList();

	public TileEntityDisassembler1() {
		ish = new ItemStackHandler();
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
	}
	
	/**
	 * TODO Überprüft, ob diese Fähigkeit vorhanden ist
	 */
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		if(capability == ITEM_HANDLER_CAPABILITY){
			return true;
		}
		return false;
	}
	
	/**
	 * TODO Gibt die verlangte Fähigkeit zurück
	 */
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if(capability == ITEM_HANDLER_CAPABILITY){
			return null; // TODO ?????
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

		}

}
