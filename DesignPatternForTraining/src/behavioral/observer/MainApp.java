package behavioral.observer;

public class MainApp {

	public static void main(String[] args) {
		 // Create IBM stock and attach investors
	      IBMStock ibm = new IBMStock("IBM", 120.00);
	      ibm.attach(new InvestorImpl("Sorros"));
	      ibm.attach(new InvestorImpl("Berkshire"));
	 
	      // Fluctuating prices will notify investors
	      ibm.setPrice (120.10);
	      ibm.setPrice(121.00);
	      ibm.setPrice(120.50);
	      ibm.setPrice(120.75);
	 

	}

}
