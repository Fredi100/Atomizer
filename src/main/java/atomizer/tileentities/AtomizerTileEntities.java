package atomizer.tileentities;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class AtomizerTileEntities {
	 public static void init(){
		 GameRegistry.registerTileEntity(TileEntityDisassembler1.class, TileEntityDisassembler1.UNLOCALIZED_TILEENTITY_NAME);
	 }
}
