package atomizer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import atomizer.lib.Constants;
import atomizer.tileentities.TileEntityAssembler1;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockTest extends Block{
	
	public static final String UNLOCALIZED_BLOCK_NAME = "testBlock";
	private IIcon[] icons = new IIcon[6];
	
	/**
	 * Konstruktor
	 * Weiﬂt dem Block ein Material zu nach dem sich der Block verh‰lt
	 * Weiﬂt ihm einen Tab zu in dem der Block im Creative Modus angezeigt wird
	 * Gibt dem Block einen spielinternen Namen
	 * Registriert den Block im Blockregister vom Spiel
	 */
	public BlockTest(){
		super(Material.glass);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setBlockName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		this.setBlockTextureName(Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME);
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
	
	@Override
	public boolean hasTileEntity(int metadata){
		return false;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
	    for (int i = 0; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(""+Constants.MODID + ":" + UNLOCALIZED_BLOCK_NAME + "_" + i);
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return icons[side];
	}
}
