package atomizer.gui;

import atomizer.container.ContainerDisassembler1;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class AtomizerGuiHandler implements IGuiHandler{
	
	public static final int DISASSEMBLER_RANK_1_GUI = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == DISASSEMBLER_RANK_1_GUI){
			return new ContainerDisassembler1(player.inventory,(TileEntityDisassembler1) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == DISASSEMBLER_RANK_1_GUI){
			return new GuiDisassembler1(player.inventory,(TileEntityDisassembler1) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
}
