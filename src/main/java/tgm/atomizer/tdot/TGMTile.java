package tgm.atomizer.tdot;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * 
 * @author Alfred Emsenhuber
 *
 */
public class TGMTile extends TileEntity implements IUpdatePlayerListBox{
	
	public int test;
	public static final String TEST = "test";	//Key für die Variable
	private int count = 0;
	
	public TileEntity createTileEntity(World world, int metadata){
		return new TGMTile();
	}
	
	/**
	 * Wird immer aufgerufen wenn Daten dauerhaft gespeichert werden sollen
	 */
	@Override
   	public void writeToNBT(NBTTagCompound par1){
	   par1.setInteger(TEST,test); //Sagt Minecraft das die Variable mit einem Key dauerhaft gespeichert werden soll
	   super.writeToNBT(par1);
   	}
   
   	/**
     * Wird immer aufgerufen wenn Daten geladen werden sollen
     */
   	@Override
   	public void readFromNBT(NBTTagCompound par1){
	   test = par1.getInteger(TEST); //Sagt Minecraft das die Variable mit einem Key wieder ausgelesen werden soll
	   super.readFromNBT(par1);
   	}
   	
   	@Override
   	public void update(){
   		
   }
   
}