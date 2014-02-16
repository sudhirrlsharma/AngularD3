package creational.factoryMethod;

public class MainApp {
	// / <summary>
	// / Entry point into console application.
	// / </summary>
	public static void main(String[] args) {
		// Note: constructors call Factory Method
	      Document[] documents = new Document[2];
	 
	      documents[0] = new Resume();
	      documents[1] = new Report();
	 
	      // Display document pages
	      for(Document document : documents){
	        System.out.println("\n" + document.getClass().getSimpleName()+ "--");
	        for (Page page : document.getPages()){
	        	System.out.println(" " + page.getClass().getSimpleName());
	        }
	      }
	}
}
