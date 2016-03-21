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
import atomizer.recipies.AtomizerRecipies;
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
//Signalisiert der API das es sich bei folgender Klasse um eine Minecraft-Modifikaiton handelt
public class Atomizer {
	
	//Sagt der API welche Instanz verwendet werden soll
    @Instance(value = Constants.MODID)
    public static Atomizer instance;
    
    
    //Muss noch schaun
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	//Muss noch schaun
	
	
	
	
	/**
     * Wird aufgerufen noch bevor Minecraft zu laden anfängt.
     * Wird zum Registrieren verschiedener Klassen verwendet.
     * 
     * @param event
     */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		AtomizerBlocks.init();
		AtomizerItems.init();
		AtomizerFluids.init();
		AtomizerRecipies.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerTileEntities();
	}
	
	/**
     * Wird beim Laden von Minecraft aufgerufen.
     * Wird zum Registrieren von Rezepten verwendet.
     * 
     * @param event
     */
    @EventHandler
    public void load(FMLInitializationEvent event){
    	
    }
	
	/**
     * Wird zum Interagieren mit anderen Mods und registrierten Klassen verwendet.
     * 
     * @param event
     */
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
	
	 /**
     * Geht alle im Spiel registrierten Rezepte durch und löscht alle die von uns ersetzt werden.
     * Registriert anschließend unsere Rezepte
     * 
     * 
     * 	!!!!!GEHT NOCH NICHT!!!!!
     * 
     * 
     */
    private static void configureRecipes(){
    	ArrayList<ItemStack> output = new ArrayList<ItemStack>();
    	/* Output Array */
    	output.add(new ItemStack(Items.bucket)); 	//Rezept 01 Bucket		<-	IronPlate*3
    	output.add(new ItemStack(AtomizerItems.ironPlate,2));		//Rezept 02 IronPlate*2	<-	IronIngot + StoneHammer
    	
    	ItemStack recipeResult = null;
    	ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
    	for (int scan = 0; scan < recipes.size(); scan++){
    		IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
    		recipeResult=tmpRecipe.getRecipeOutput();
    		for(ItemStack resultItem:output){
    			if(ItemStack.areItemStacksEqual(resultItem, recipeResult)){
    				System.out.println("Atomizer removed following Recipe: " + recipes.get(scan) + " -> " + recipeResult);
    				recipes.remove(scan);
    			}
    		}
    	}
    	
    	//Rezept 00	Bucket		<-	IronPlate*3
    	GameRegistry.addShapedRecipe(output.get(0), new Object[]{"   ","# #"," # ",'#',AtomizerItems.ironPlate});
    	//Rezept 01 IronPlate*2	<-	IronIngot + StoneHammer
    	GameRegistry.addShapelessRecipe(output.get(1), new Object[]{Items.iron_ingot,AtomizerItems.stoneHammer});
    	
    
    }
}
