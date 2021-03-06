package atomizer.client.gui;

import atomizer.container.ContainerDisassembler1;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiDisassembler1 extends GuiContainer {
	
	private static final ResourceLocation disassemblerGuiTextures = new ResourceLocation("atomizer:textures/gui/guiDisassembler1.png");

	private TileEntityDisassembler1 te;
	private IInventory playerInv;
	
	public GuiDisassembler1(IInventory playerInv, TileEntityDisassembler1 te) {
		super(new ContainerDisassembler1(playerInv, te));
		this.te = te;
		this.playerInv = playerInv;
		this.xSize = 176;
		this.ySize = 166;
	}
	
	/**
	 * Zeichne hier zum Beispiel die Strings in der GUI
	 */
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		//TODO Hier dynamische den Namen vergeben
		String s = "Disassembler";
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}

	/**
	 * Zeichne hier den kompletten Hintergrund der GUI
	 */
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(disassemblerGuiTextures);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
		
		
		
		if(te.isCrushing()){
			int k = this.getBurnLeftScaled(13); //Hier die Gr��e des Felds in Pixel
			this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
			//Zahlen noch anpassen
		}
		
		int l = this.getCrushProgressScaled(24);
		this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
		
	}
	
	private int getBurnLeftScaled(int pixels){
		int i = te.getFuelTime();
		
		if(i == 0){
			i=200;
		}
		
		return te.getMaxFuelTime() * pixels / i;
	}
	
	private int getCrushProgressScaled(int pixels){
		int i = te.getCrushTime();
		int j = te.getMaxCrushTime();
		return j != 0 && i != 0 ? i * pixels / j : 0;
	}
}
