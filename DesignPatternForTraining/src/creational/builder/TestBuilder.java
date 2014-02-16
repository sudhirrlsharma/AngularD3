package creational.builder;

public class TestBuilder {
	public static void main(String[] args) {
		
		Client c = new Client();
		VehicleBuilder builder;

		// Create shop with vehicle builders

		builder = new CarBuilder();
		c.constructVehicle(builder);
		System.out.println(builder.getVehicle().showDetails());

		builder = new MotorCycleBuilder();
		c.constructVehicle(builder);
		System.out.println(builder.getVehicle().showDetails());

	}
}
