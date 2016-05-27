package gui;

import atomizer.container.ContainerDisassembler1;
import atomizer.tileentities.TileEntityDisassembler1;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiDisassembler1 extends GuiContainer{

	public GuiDisassembler1(IInventory playerInv, TileEntityDisassembler1 te) {
		super(new ContainerDisassembler1(playerInv, te));
		
		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		ResourceLocation resource = new ResourceLocation("atomizer:textures/gui/GuiAssembler1.png");
		this.mc.getTextureManager().bindTexture(resource);
	}
	
	

}
