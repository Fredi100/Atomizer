package atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidRedstone extends Fluid{
	
	private static String name = "redstoneFluid";

	public FluidRedstone() {
		super(name);
		this.setLuminosity(15);
		this.setDensity(1500);
		this.setTemperature(1800);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
}
