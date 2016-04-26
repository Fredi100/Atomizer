
package atomizer.tileentities;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityDisassembler1 extends TileEntity implements IUpdatePlayerListBox{
	
	public static final String UNLOCALIZED_TILEENTITY_NAME = "Disassembler1TileEntity";
	
	/**
	 * Diese Methode wird nach jedem Tick aufgerufen, also 20 mal pro Sekunde
	 */
	@Override
	public void update(){
		//Hier kann was gemacht werden
	}
	
	public void TileEntityAssembler1() {
		// TODO Auto-generated constructor stub
	}
	/*
	private int fill;
	
	public static final String publicName = "tileEntityAssembler1";
	private String name = "tileEntityAssembler1";
	
	public String getName(){
		return name;
	}
	
	@Override
	public void writeToNBT(NBTTagCompound par1){
		super.writeToNBT(par1);
		par1.setInteger("fill", fill);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound par1){
		super.readFromNBT(par1);
		this.fill = par1.getInteger("fill");
	}
	
	//Zum drauf zugreifen auf die Daten von egal wo
	TileEntityYour tile = (TileEntityYour) world.getBlockTileEntity(i, j, k);
	if (tile != null){
		int l = tile.customField;
	}
	*/

	public boolean isUsableByPlayer(EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return false;
	}

}
