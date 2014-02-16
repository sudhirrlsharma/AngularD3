package behavioral.stratagy.good;

public abstract class Vehicle {
	private GoAlgorithm goAlgorithm;

	public void setGoAlgorithm(GoAlgorithm algorithm) {
		goAlgorithm = algorithm;
	}

	public void go() {
		goAlgorithm.go();
	}
}