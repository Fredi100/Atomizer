package atomizer.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import atomizer.lib.Constants;
import atomizer.tileentities.TileEntityDisassembler1;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockDisassembler1 extends Block{ //Hier sp‰ter BlockContainer
	private String UNLOCALIZED_BLOCK_NAME = "Disassembler1Block";
	
	public IIcon[] icons;
	
	public BlockDisassembler1(){
		super(Material.iron);
		this.icons = new IIcon[6];
		this.setBlockName(UNLOCALIZED_BLOCK_NAME);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setBlockName(Constants.MODID + "_" + UNLOCALIZED_BLOCK_NAME);//Gibt dem Block einen internen Namen
		setBlockTextureName(Constants.MODID +":"+UNLOCALIZED_BLOCK_NAME);
		//this.isBlockContainer = true;
		GameRegistry.registerBlock(this, UNLOCALIZED_BLOCK_NAME);//Registriert den Block im Spiel
	}
	
	@Override
	public IIcon getIcon(int side, int meta){
		return this.icons[side];
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		for(int i = 0; i < icons.length; i++){
			this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		}
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
