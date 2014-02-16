package creational.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Document {
	private List<Page> pages = new ArrayList<Page>();

	// Constructor calls abstract Factory method
	public Document() {
		this.createPages();
	}

	public List<Page> getPages(){
    	return this.pages;
    }

	// Factory Method
	public abstract void createPages();
}
