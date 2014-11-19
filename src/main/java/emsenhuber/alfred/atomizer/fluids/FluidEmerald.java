package emsenhuber.alfred.atomizer.fluids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidEmerald extends Fluid{
	
	private static String name = "emeraldFluid";

	public FluidEmerald() {
		super(name);
		this.setLuminosity(12);
		this.setDensity(1500);
		this.setTemperature(1800);
		this.setViscosity(4500);
		this.setGaseous(false);
		FluidRegistry.registerFluid(this);
	}
}