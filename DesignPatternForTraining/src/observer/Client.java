package observer;

public class Client implements Observer {
	public void update(String operation, String record) {
		System.out.println("The client says a " + operation + " operation was performed on " + record);
	}
}
