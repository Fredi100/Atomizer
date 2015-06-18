package emsenhuber.alfred.atomizer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import emsenhuber.alfred.atomizer.lib.Constants;
import emsenhuber.alfred.atomizer.tileentities.TileEntityAssembler1;

public class BlockTest extends Block{
	private String name = "TestBlock";
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
		this.setBlockName(Constants.MODID + "_" + name);//Gibt dem Block einen internen Namen
		this.setBlockTextureName(Constants.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);//Registriert den Block im Spiel
	}
	
	@Override
	public boolean hasTileEntity(int metadata){
		return false;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
	    for (int i = 0; i < icons.length; i++) {
	        icons[i] = iconRegister.registerIcon(Constants.MODID + ":" + name + i);
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return icons[side];
	}
}
