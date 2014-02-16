package creational.builder;

public class Vehicle {
	private String name;
	private String frame;
	private String engine;
	private String wheels;
	private String doors;

	public Vehicle(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String showDetails() {
		return "Vehicle [name=" + name + ", frame=" + frame + ", engine=" + engine + ", wheels=" + wheels + ", doors=" + doors + "]";
	}

}
