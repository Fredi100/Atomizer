package atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidObsidian extends Fluid{
	
	private static String name = "obsidianFluid";

	public FluidObsidian() {
		// TODO Fl�ssigkeiten �berarbeiten
		super(name, null, null);
		this.setLuminosity(8);
		this.setDensity(1500);
		this.setTemperature(1800);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
}
