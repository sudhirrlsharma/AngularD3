package behavioral.iterator;

public class MainApp {

	public static void main(String args[]) {
		Division division = new Division("Sales");
		division.add("Ted");
		division.add("Bob");
		division.add("Carol");
		division.add("Alice");
		DivisionIterator iterator = division.iterator();
		while (iterator.hasNext()) {
			VP vp = iterator.next();
			vp.print();
		}
	}
}
