package emsenhuber.alfred.atomizer.items;

import net.minecraft.item.Item;

/**
 * Kümmert sich um das Erzeugen und Initialisieren der Items
 * 
 * @author Fredi100
 */
public class AtomizerItems {
	
	public static Item wrenchItem;
	public static Item laser1Item;
	public static Item laser2Item;
	public static Item laser3Item;
	public static Item soilPileItem;
	
	/**
	 * Initialisiert alle Items die vom Mod eingebracht werden
	 */
	public static void init(){
		wrenchItem = new ItemWrench();
		laser1Item = new ItemLaser1();
		laser2Item = new ItemLaser2();
		laser3Item = new ItemLaser3();
		soilPileItem = new ItemSoilPile();
		
	}
}
