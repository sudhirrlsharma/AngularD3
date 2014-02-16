package creational.builder;

public class Client {

	// Builder uses a complex series of steps
	public void constructVehicle(VehicleBuilder vehicleBuilder) {
		vehicleBuilder.buildFrame();
		vehicleBuilder.buildEngine();
		vehicleBuilder.buildWheels();
		vehicleBuilder.buildDoors();
	}

}
