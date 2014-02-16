package behavioral.stratagy.bad;

public class TestVehical {
	public static void main(String[] args) {
		StreetRacer streetRacer = new StreetRacer();
		FormulaOne formulaOne = new FormulaOne();
		Helicopter helicopter = new Helicopter();

		streetRacer.go();
		formulaOne.go();
		helicopter.go();
	}
}
