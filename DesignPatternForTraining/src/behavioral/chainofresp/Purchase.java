package behavioral.chainofresp;

public class Purchase {
	private int number;
	private double amount;
	private String purpose;

	// Constructor
	public Purchase(int number, double amount, String purpose) {
		this.number = number;
		this.amount = amount;
		this.purpose = purpose;
	}

	public int getNumber() {
		return number;
	}

	public double getAmount() {
		return amount;
	}

	public String getPurpose() {
		return purpose;
	}
}
