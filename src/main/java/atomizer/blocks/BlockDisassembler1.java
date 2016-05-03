package atomizer.blocks;

import atomizer.lib.Constants;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO Hier auf neue Minecraft Version updaten
public class BlockDisassembler1 extends BlockContainer{ //Hier später BlockContainer
	private final String UNLOCALIZED_BLOCK_NAME = "Disassembler1Block";
	
	
	public BlockDisassembler1(){
		super(Material.iron);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weißt dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		//this.isBlockContainer = true;
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
	
	/**
	 * Gibt den Namen des Blocks zurück
	 * 
	 * @return Der Name des Blocks
	 */
	public String getName(){
		return UNLOCALIZED_BLOCK_NAME;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityDisassembler1();
	}
	
	/*
	@Override
	public int getRenderType(){
		return 0; //0 weil wir das normale aussehen des blocks haben wollen
				  //-1 oder 2 wenn wir ein spezielles TileEntity aussehen haben wollen
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		// TODO Auto-generated method stub
		return new TileEntityDisassembler1();
	}
	*/
}
