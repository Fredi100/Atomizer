package tgm.atomizer;

import java.util.ArrayList;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import tgm.atomizer.items.IronPlate;
import tgm.atomizer.items.IronRaw;
import tgm.atomizer.items.StoneHammer;
import tgm.atomizer.tdot.*;

/**
 * Die Hauptklasse der Minecraft Modifikation Atomizer
 * 
 * @author Alfred Emsenhuber(Fredi100)
 *
 */
@Mod(modid=BaseMod.MODID, name=BaseMod.MODNAME, version=BaseMod.MODVER)
//Sagt der API das es sich bei der folgenden Klasse um die Hauptklasses des Mods handelt
public class BaseMod{
	
	/* Hauptkonstanten */
	//Die Mod-ID unter dem die API diesen Mod anspricht
	public static final String MODID = "atomizer";
	//Der menschlich leserliche Mod-Name
	public static final String MODNAME = "Atomizer";
	//Die Version des Mods
	public static final String MODVER = "0.0.1";

	//Sagt der API welche Instanz verwendet werden soll
    @Instance(value = MODID)
    public static BaseMod instance;
    
    /* Blöcke */
    public static final Block tgmBlock = new TGMBlock();
    
    /* Items */
    public static final Item ironRaw = new IronRaw();
    public static final Item ironPlate = new IronPlate();
    public static final Item stoneHammer = new StoneHammer();
    
    /**
     * Wird aufgerufen noch bevor Minecraft zum Laden anfängt.
     * Wird zum Registrieren verschiedener Klassen verwendet.
     * 
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	//Blöcke registrieren
    	GameRegistry.registerBlock(tgmBlock, "tgmBlock");
    	
    	//Items registrieren
    	GameRegistry.registerItem(ironRaw, "ironRaw");
    	
    	//TileEntitys registrieren
    	GameRegistry.registerTileEntity(TGMTile.class, "stringID");	//Noch nicht bekannt was StringID ist
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
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	configureRecipes();
    }
    
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
    	output.add(new ItemStack(ironPlate,2));		//Rezept 02 IronPlate*2	<-	IronIngot + StoneHammer
    	
    	ItemStack recipeResult = null;
    	ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
    	for (int scan = 0; scan < recipes.size(); scan++){
    		IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
    		if (tmpRecipe instanceof ShapedRecipes){
    			ShapedRecipes recipe = (ShapedRecipes)tmpRecipe;
    			recipeResult = recipe.getRecipeOutput();
    		}
    		if (tmpRecipe instanceof ShapelessRecipes){
    			ShapelessRecipes recipe = (ShapelessRecipes)tmpRecipe;
    			recipeResult = recipe.getRecipeOutput();
    		}
    		for(ItemStack resultItem:output){
    			if(ItemStack.areItemStacksEqual(resultItem, recipeResult)){
    				System.out.println("Atomizer removed following Recipe: " + recipes.get(scan) + " -> " + recipeResult);
    				recipes.remove(scan);
    			}
    		}
    	}
    	
    	//Rezept 00	Bucket		<-	IronPlate*3
    	GameRegistry.addShapedRecipe(output.get(0), new Object[]{"   ","# #"," # ",'#',ironPlate});
    	//Rezept 01 IronPlate*2	<-	IronIngot + StoneHammer
    	GameRegistry.addShapelessRecipe(output.get(1), new Object[]{Items.iron_ingot,stoneHammer});
    } 
}