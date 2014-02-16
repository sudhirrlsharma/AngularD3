package creational.factory;

public class TestConnection {
	public static void main(String args[]) {
		FactoryPattern factory;
		factory = new FactoryPattern();
		Connection connection = factory.createConnection("Oracle");
		System.out.println("You’re connecting with " + connection.description());
	}
}
