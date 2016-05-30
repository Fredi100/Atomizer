package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * BlockAssembler1
 * Sorgt dafür das dieser Block im Spiel exisitert und gibt ihm einzelne Funktionen
 * 
 * @author Fredi100
 */
public class BlockAssembler1 extends Block{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "assembler1Block";
	
	/**
	 * Konstruktor
	 * Weißt dem Block ein Material zu nach dem sich der Block verhält
	 * Weißt ihm einen Tab zu in dem der Block im Creative Modus angezeigt wird
	 * Gibt dem Block einen spielinternen Namen
	 * Registriert den Block im Blockregister vom Spiel
	 */
	public BlockAssembler1(){
		super(Material.iron);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weißt dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		this.isBlockContainer = true;
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
}
