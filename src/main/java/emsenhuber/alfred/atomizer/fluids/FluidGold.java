package emsenhuber.alfred.atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidGold extends Fluid{
	
	private static String name = "goldFluid";

	public FluidGold() {
		super(name);
		this.setLuminosity(12);
		this.setDensity(1500);
		this.setTemperature(1337);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
	
}