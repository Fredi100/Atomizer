package atomizer.gui;

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
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
		String s = this.te.UNLOCALIZED_TILEENTITY_NAME;
		this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(disassemblerGuiTextures);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
	}
}
