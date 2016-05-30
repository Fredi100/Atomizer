package atomizer.proxy;

import atomizer.Atomizer;
import atomizer.gui.AtomizerGuiHandler;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityDisassembler1.class,
				TileEntityDisassembler1.UNLOCALIZED_TILEENTITY_NAME);
	}

	public void init(FMLInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Atomizer.instance, new AtomizerGuiHandler());
	}
}
