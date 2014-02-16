package behavioral.stratagy.good;

public class StreetRacer extends Vehicle {

	public StreetRacer() {
		this.setGoAlgorithm(new GoByDrivingAlgorithm());
	}

}
