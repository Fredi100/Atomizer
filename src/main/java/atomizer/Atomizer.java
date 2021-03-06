package atomizer;

import atomizer.block.AtomizerBlocks;
import atomizer.client.gui.AtomizerGuiHandler;
import atomizer.fluids.AtomizerFluids;
import atomizer.item.AtomizerItems;
import atomizer.item.ItemBronzeIngot;
import atomizer.lib.Constants;
import atomizer.proxy.CommonProxy;
import atomizer.recipes.AtomizerRecipes;
import atomizer.tileentities.AtomizerTileEntities;
import atomizer.world.AtomizerWorldGen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Main-Class of this mod
 * 
 * @author Alfred Emsenhuber(Fredi100)
 * @version 2016-05-25
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
	 * Wird aufgerufen noch bevor Minecraft zu laden anf�ngt. Wird zum
	 * Registrieren verschiedener Klassen verwendet.
	 * 
	 * @param event
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.proxy.preInit(event);
		AtomizerBlocks.init();
		AtomizerItems.init();
		AtomizerFluids.init();
	}

	/**
	 * Hier m�ssen z.B. alle Rezepte initialisiert werden
	 * 
	 * @param event
	 */
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		this.proxy.init(event);

		AtomizerRecipes.recipeRemover();
		AtomizerRecipes.smeltingRemover();
		AtomizerRecipes.init();
		AtomizerRecipes.disassemblerRecipes();
		
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
		this.proxy.postInit(event);
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
