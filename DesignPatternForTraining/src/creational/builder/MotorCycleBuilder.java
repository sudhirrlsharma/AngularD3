package creational.builder;

public class MotorCycleBuilder extends VehicleBuilder {

	public MotorCycleBuilder(){
		   this.vehicle = new Vehicle("MotorCycle");
		
	}
	@Override
	public void buildFrame() {
		vehicle.setFrame("MotorCycle Frame");
	}

	@Override
	public void buildEngine() {
		vehicle.setEngine("500 cc");

	}

	@Override
	public void buildWheels() {
		 vehicle.setWheels("2");

	}

	@Override
	public void buildDoors() {
		 vehicle.setDoors("0");

	}

}
