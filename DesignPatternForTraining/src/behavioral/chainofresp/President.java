package behavioral.chainofresp;

public class President extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 100000.0)
	      {
	        System.out.printf("%s approved request# %d",this.getClass().getSimpleName(), purchase.getNumber());
	        System.out.println();
	      }
	      else
	      {
	    	  System.out.printf("Request# %d requires an executive meeting!", purchase.getNumber());
	    	  System.out.println();
	      }

	}

}
