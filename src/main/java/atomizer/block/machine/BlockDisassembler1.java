package atomizer.block.machine;

import java.util.Random;

import atomizer.Atomizer;
import atomizer.block.AtomizerBlocks;
import atomizer.client.gui.AtomizerGuiHandler;
import atomizer.lib.Constants;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Disassembler Stage 1 Block
 * 
 * @author Alfred Emsenhuber(Fredi100)
 * @version 2016-07-03
 */
public class BlockDisassembler1 extends BlockContainer {

	public static final String REGISTRY_NAME = "disassembler1Block";
	
	//public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	private static boolean keepInventory;
	
	/**
	 * Sets all of the values of this block
	 */
	public BlockDisassembler1() {
		super(Material.iron);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		// Weißt dem Block ein Tab zu um ihn anzuzeigen
		this.setCreativeTab(CreativeTabs.tabBlock);
		// Gibt dem Block einen internen Namen
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);
		this.setRegistryName(REGISTRY_NAME);
		//this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		// Registriert den Block im Spiel
		GameRegistry.registerBlock(this, REGISTRY_NAME);
	}
	
	/**
	 * Gibt beim Abbau dieses Blocks einen Disassembler als Item zurück
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Item.getItemFromBlock(AtomizerBlocks.getBlock(AtomizerBlocks.ASSEMBLER1));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityDisassembler1();
	}

	/**
	 * The type of render function called. 3 for standard block models, 2 for
	 * TESR's, 1 for liquids, -1 is no render
	 */
	@Override
	public int getRenderType() {
		return 3;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side,
			float hitX, float hitY, float hitZ) {
		System.out.println("Block activated");
		if (!worldIn.isRemote) {
			playerIn.openGui(Atomizer.instance, AtomizerGuiHandler.DISASSEMBLER_RANK_1_GUI, worldIn, pos.getX(), pos.getY(),
					pos.getZ());
			System.out.println("Opened gui");
			return true;
		}
		
		return true;
	}
}
