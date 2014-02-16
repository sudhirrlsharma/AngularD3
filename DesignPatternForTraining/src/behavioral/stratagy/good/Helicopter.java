package behavioral.stratagy.good;

public class Helicopter extends Vehicle{
	public Helicopter() {
		this.setGoAlgorithm(new GoByFlying());
	}
}
