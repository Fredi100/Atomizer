package atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidGlas extends Fluid{
	
	private static String name = "glasFluid";

	public FluidGlas() {
		super(name);
		this.setLuminosity(0);
		this.setDensity(1500);
		this.setTemperature(1673);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
	
}