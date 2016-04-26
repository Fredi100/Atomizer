package atomizer.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import atomizer.GuiAssembler1;
import atomizer.tileentities.TileEntityDisassembler1;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler{
	public void registerTileEntities(){
		//GameRegistry.registerTileEntity(TileEntityDisassembler1.class, TileEntityDisassembler1.UNLOCALIZED_TILEENTITY_NAME);
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
