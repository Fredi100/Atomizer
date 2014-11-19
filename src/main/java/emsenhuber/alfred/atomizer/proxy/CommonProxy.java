package emsenhuber.alfred.atomizer.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import emsenhuber.alfred.atomizer.GuiAssembler1;
import emsenhuber.alfred.atomizer.tileentities.TileEntityAssembler1;

public class CommonProxy implements IGuiHandler{
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityAssembler1.class, "TileEntityAssembler1");
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}
