package atomizer.proxy;

import atomizer.Atomizer;
import atomizer.client.gui.AtomizerGuiHandler;
import atomizer.tileentities.TileEntityDisassembler1;
import atomizer.world.AtomizerWorldGen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {

	}

	public void init(FMLInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Atomizer.instance, new AtomizerGuiHandler());
		GameRegistry.registerWorldGenerator(new AtomizerWorldGen(), 0);
		GameRegistry.registerTileEntity(TileEntityDisassembler1.class,
				TileEntityDisassembler1.UNLOCALIZED_TILEENTITY_NAME);
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
