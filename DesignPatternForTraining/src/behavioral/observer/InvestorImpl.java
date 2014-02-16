package behavioral.observer;

public class InvestorImpl implements Investor {
	private String name;
    private Stock stock;
 
    // Constructor
    public InvestorImpl(String name)
    {
      this.name = name;
    }
 
    public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void update(Stock stock)
    {
      System.out.printf("Notified {%s} of {%s}'s " +"change to {%f}\n", name, stock.getSymbol(), stock.getPrice());
    }
}
