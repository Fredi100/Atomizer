package atomizer.blocks;

import atomizer.lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockSpeicher2 extends Block{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "speicher2Block";
	
	public BlockSpeicher2(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weißt dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
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