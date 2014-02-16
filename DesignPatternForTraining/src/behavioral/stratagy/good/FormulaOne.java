package behavioral.stratagy.good;

public class FormulaOne extends Vehicle {

	public FormulaOne() {
		this.setGoAlgorithm(new GoByDrivingAlgorithm());
	}

}
