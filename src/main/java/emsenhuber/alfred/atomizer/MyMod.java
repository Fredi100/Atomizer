package emsenhuber.alfred.atomizer;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import emsenhuber.alfred.atomizer.blocks.*;
import emsenhuber.alfred.atomizer.fluids.AtomizerFluids;
import emsenhuber.alfred.atomizer.items.*;
import emsenhuber.alfred.atomizer.lib.*;
import emsenhuber.alfred.atomizer.proxy.CommonProxy;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MyMod {
	
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		AtomizerBlocks.init();
		AtomizerItems.init();
		AtomizerFluids.init();
		
		/*Recipes*/
		//SoilePileItem
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.soilBlock), new Object[]{
			"SSS",
			"SSS",
			"SSS",
			'S', AtomizerItems.soilPileItem
		});
		//Laser1Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.laser1Item), new Object[]{
			"   ",
			"RIG",
			"   ",
			'R', Items.redstone, 'I', Items.iron_ingot, 'G', Items.gold_ingot
		});
		//Laser2Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.laser2Item), new Object[]{
			"   ",
			"ELG",
			"   ",
			'E', Items.emerald, 'L', AtomizerItems.laser1Item, 'G', Items.gold_ingot
		});
		//Laser3Item
		GameRegistry.addRecipe(new ItemStack(AtomizerItems.laser3Item), new Object[]{
			"   ",
			"DLG",
			"   ",
			'D', Items.diamond, 'L', AtomizerItems.laser2Item, 'G', Items.gold_ingot
		});
		//Assembler1Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler1Block), new Object[]{
			"GLG",
			"SCS",
			"GRG",
			'C', Blocks.crafting_table, 'S', Blocks.stone, 'G', Items.gold_ingot, 'L', AtomizerItems.laser1Item, 'R', Items.redstone
		});
		//Assembler2Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler2Block), new Object[]{
			"GLG",
			"ICI",
			"GRG",
			'C', AtomizerBlocks.assembler1Block, 'I', Blocks.iron_block, 'G', Items.gold_ingot, 'L', AtomizerItems.laser2Item, 'R', Blocks.redstone_block
		});
		//Assembler3Block
		GameRegistry.addRecipe(new ItemStack(AtomizerBlocks.assembler3Block), new Object[]{
			"GLG",
			"DCD",
			"GRG",
			'C', AtomizerBlocks.assembler2Block, 'D', Blocks.diamond_block, 'G', Items.gold_ingot, 'L', AtomizerItems.laser3Item, 'R', Blocks.redstone_block
		});
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerTileEntities();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	//Use a vanilla block as an icon
	public static CreativeTabs tabAtomizer = new CreativeTabs("tabSmithy") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Item.getItemFromBlock(Blocks.anvil);
	    }
	};
	
}
