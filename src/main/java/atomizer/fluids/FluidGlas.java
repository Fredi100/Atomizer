package atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidGlas extends Fluid{
	
	private static String name = "glasFluid";

	public FluidGlas() {
		// TODO Fl�ssigkeiten �berarbeiten
		super(name, null, null);
		this.setLuminosity(0);
		this.setDensity(1500);
		this.setTemperature(1673);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
	
}