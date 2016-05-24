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
public class BlockDisassembler1 extends BlockContainer{ //Hier sp‰ter BlockContainer
	
	public static final String REGISTRY_NAME = "disassembler1Block";
	
	public BlockDisassembler1(){
		super(Material.iron);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setCreativeTab(CreativeTabs.tabBlock);//Weiﬂt dem Block ein Tab zu um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);//Gibt dem Block einen internen Namen
		this.setRegistryName(REGISTRY_NAME);
		//this.isBlockContainer = true;
		GameRegistry.registerBlock(this, REGISTRY_NAME);//Registriert den Block im Spiel
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
