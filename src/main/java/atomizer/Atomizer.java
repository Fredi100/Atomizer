package atomizer;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;

import atomizer.blocks.AtomizerBlocks;
import atomizer.blocks.BlockTest;
import atomizer.blocks.ITBlock;
import atomizer.blocks.TGMBlock;
import atomizer.fluids.AtomizerFluids;
import atomizer.items.AtomizerItems;
import atomizer.lib.Constants;
import atomizer.proxy.CommonProxy;
import atomizer.recipes.AtomizerRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Die Hauptklasse der Minecraft Modifikation Atomizer
 * 
 * @author Alfred Emsenhuber(Fredi100)
 *
 */
@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
// Signalisiert der API das es sich bei folgender Klasse um eine
// Minecraft-Modifikaiton handelt
public class Atomizer {

	// Sagt der API welche Instanz verwendet werden soll
	@Instance(value = Constants.MODID)
	public static Atomizer instance;

	// Muss noch schaun
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	// Muss noch schaun

	/**
	 * Wird aufgerufen noch bevor Minecraft zu laden anfängt. Wird zum
	 * Registrieren verschiedener Klassen verwendet.
	 * 
	 * @param event
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		AtomizerBlocks.init();
		AtomizerItems.init();
		AtomizerFluids.init();
		AtomizerRecipes.recipeRemover();
		AtomizerRecipes.smeltingRemover();
		AtomizerRecipes.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerTileEntities();
	}

	/**
	 * Wird beim Laden von Minecraft aufgerufen. Wird zum Registrieren von
	 * Rezepten verwendet.
	 * 
	 * @param event
	 */
	@EventHandler
	public void load(FMLInitializationEvent event) {

	}

	/**
	 * Wird zum Interagieren mit anderen Mods und registrierten Klassen
	 * verwendet.
	 * 
	 * @param event
	 */
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	/**
	 * Damit kann ich einen neue CreativeTab machen in dem dann alles Items drin
	 * sind
	 */
	public static CreativeTabs tabAtomizer = new CreativeTabs("tabSmithy") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.anvil);
		}
	};
}
