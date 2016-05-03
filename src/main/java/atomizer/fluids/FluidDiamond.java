package atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidDiamond extends Fluid{
	
	private static String name = "diamondFluid";

	public FluidDiamond() {
		// TODO Flüssigkeiten überarbeiten
		super(name, null, null);
		this.setLuminosity(9);
		this.setDensity(1500);
		this.setTemperature(1800);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
}
