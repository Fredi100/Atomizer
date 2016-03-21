package atomizer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import atomizer.lib.Constants;
import atomizer.tileentities.TileEntityAssembler1;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * BlockAssembler1
 * Sorgt daf�r das dieser Block im Spiel exisitert und gibt ihm einzelne Funktionen
 * 
 * @author Fredi100
 */
public class BlockAssembler1 extends Block implements ITileEntityProvider{
	private String UNLOCALIZED_BLOCK_NAME = "Assembler1Block";
	
	/**
	 * Konstruktor
	 * Wei�t dem Block ein Material zu nach dem sich der Block verh�lt
	 * Wei�t ihm einen Tab zu in dem der Block im Creative Modus angezeigt wird
	 * Gibt dem Block einen spielinternen Namen
	 * Registriert den Block im Blockregister vom Spiel
	 */
	public BlockAssembler1(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Wei�t dem Block ein Tab zu um ihn anzuzeigen
		this.setBlockName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
	
	/*Ab hier noch in Bearbeitung da noch keine Erfahrung mit TileEntitys*/
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityAssembler1();
	}
	
	@Override
	public boolean hasTileEntity(int metadata){
		return true;
	}
}
