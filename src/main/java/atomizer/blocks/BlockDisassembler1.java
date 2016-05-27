package atomizer.blocks;

import atomizer.Atomizer;
import atomizer.AtomizerGuiHandler;
import atomizer.lib.Constants;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Disassembler Stage 1 Block
 * 
 * @author Alfred Emsenhuber(Fredi100)
 * @version 2016-05-25
 */
public class BlockDisassembler1 extends BlockContainer {

	public static final String REGISTRY_NAME = "disassembler1Block";

	/**
	 * Sets all of the values of this block
	 */
	public BlockDisassembler1() {
		super(Material.iron);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setCreativeTab(CreativeTabs.tabBlock);// Weiﬂt dem Block ein Tab zu
													// um ihn anzuzeigen
		this.setUnlocalizedName(Constants.MODID + ":" + REGISTRY_NAME);// Gibt
																		// dem
																		// Block
																		// einen
																		// internen
																		// Namen
		this.setRegistryName(REGISTRY_NAME);
		GameRegistry.registerBlock(this, REGISTRY_NAME);// Registriert den Block
														// im Spiel
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
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side,
			float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			player.openGui(Atomizer.instance, AtomizerGuiHandler.DISASSEMBLER_RANK_1_GUI, world, pos.getX(), pos.getY(),
					pos.getZ());
			return true;
		}
		return false;
	}

	/*
	 * @Override public TileEntity createNewTileEntity(World world, int
	 * metadata) { // TODO Auto-generated method stub return new
	 * TileEntityDisassembler1(); }
	 */
}
