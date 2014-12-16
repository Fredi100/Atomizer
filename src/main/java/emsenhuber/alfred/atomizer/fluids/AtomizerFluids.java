package emsenhuber.alfred.atomizer.fluids;

import java.sql.Blob;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Kümmert sich um das Erzeugen und Initialisieren aller Flüssigkeiten des Mods
 * 
 * @author Fredi100
 */
public class AtomizerFluids {
	/*Fluids*/
	public static Fluid ironFluid;
	public static Fluid goldFluid;
	public static Fluid glasFluid;
	public static Fluid netherFluid;
	public static Fluid obsidianFluid;
	public static Fluid redstoneFluid;
	public static Fluid diamondFluid;
	public static Fluid emeraldFluid;
	public static Fluid enderFluid;
	
	/*Blocks*/
	public static Block ironFluidBlock;
	public static Block goldFluidBlock;
	public static Block glasFluidBlock;
	public static Block netherFluidBlock;
	public static Block obsidianFluidBlock;
	public static Block redstoneFluidBlock;
	public static Block diamondFluidBlock;
	public static Block emeraldFluidBlock;
	public static Block enderFluidBlock;
	
	/**
	 * Initialisiert alle Flüssigkeiten fürs Spiel
	 */
	public static void init(){
		//IronFluid
		ironFluid = new FluidIron();
		ironFluidBlock = new BlockFluidIron(ironFluid, Material.water);
		ironFluid.setUnlocalizedName(ironFluidBlock.getUnlocalizedName());
		//GoldFluid
		goldFluid = new FluidGold();
		goldFluidBlock = new BlockFluidGold(goldFluid, Material.water);
		goldFluid.setUnlocalizedName(goldFluidBlock.getUnlocalizedName());
		//GlasFluid
		glasFluid = new FluidGlas();
		glasFluidBlock = new BlockFluidGlas(glasFluid, Material.water);
		glasFluid.setUnlocalizedName(glasFluidBlock.getUnlocalizedName());
		//NetherFluid
		netherFluid = new FluidNether();
		netherFluidBlock = new BlockFluidNether(netherFluid, Material.water);
		netherFluid.setUnlocalizedName(netherFluidBlock.getUnlocalizedName());
		//ObsidianFluid
		obsidianFluid = new FluidObsidian();
		obsidianFluidBlock = new BlockFluidObsidian(obsidianFluid, Material.water);
		obsidianFluid.setUnlocalizedName(obsidianFluidBlock.getUnlocalizedName());
		//RedstoneFluid
		redstoneFluid = new FluidRedstone();
		redstoneFluidBlock = new BlockFluidRedstone(redstoneFluid, Material.water);
		redstoneFluid.setUnlocalizedName(redstoneFluidBlock.getUnlocalizedName());
		//DiamondFluid
		diamondFluid = new FluidDiamond();
		diamondFluidBlock = new BlockFluidDiamond(diamondFluid, Material.water);
		diamondFluid.setUnlocalizedName(diamondFluidBlock.getUnlocalizedName());
		//EmeraldFluid
		emeraldFluid = new FluidEmerald();
		emeraldFluidBlock = new BlockFluidEmerald(emeraldFluid, Material.water);
		emeraldFluid.setUnlocalizedName(emeraldFluidBlock.getUnlocalizedName());
		//EnderFluid
		enderFluid = new FluidEnder();
		enderFluidBlock = new BlockFluidEnder(enderFluid, Material.water);
		enderFluid.setUnlocalizedName(enderFluidBlock.getUnlocalizedName());
	}
}
