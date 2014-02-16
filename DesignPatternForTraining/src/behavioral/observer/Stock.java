package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
	private String symbol;
	private double price;
	private List<Investor> investors = new ArrayList<Investor>();

	// Constructor
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	public void attach(Investor investor) {
		investors.add(investor);
	}

	public void detach(Investor investor) {
		investors.remove(investor);
	}

	public void notifyInvestor() {
		for (Investor investor : investors) {
			investor.update(this);
		}

		System.out.println();
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;

	}

	// Gets or sets the price
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (this.price != price) {
			this.price = price;
			notifyInvestor();
		}
	}
}
