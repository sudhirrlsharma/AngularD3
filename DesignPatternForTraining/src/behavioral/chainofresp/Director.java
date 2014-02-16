package behavioral.chainofresp;

public class Director extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 10000.0) {
			System.out.printf("%s approved request# %d", this.getClass().getSimpleName(), purchase.getNumber());
			System.out.println();
		} else if (successor != null) {
			successor.processRequest(purchase);
		}
	}

}
