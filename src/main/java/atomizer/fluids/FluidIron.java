package atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidIron extends Fluid{
	
	private static String name = "ironFluid";

	public FluidIron() {
		// TODO Fl�ssigkeiten �berarbeiten
		super(name, null, null);
		this.setLuminosity(12);
		this.setDensity(1500);
		this.setTemperature(1800);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
	
}
