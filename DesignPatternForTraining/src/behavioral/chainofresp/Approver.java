package behavioral.chainofresp;

public abstract class Approver {
	protected Approver successor;

	public void SetSuccessor(Approver successor) {
		this.successor = successor;
	}

	public abstract void processRequest(Purchase purchase);
}