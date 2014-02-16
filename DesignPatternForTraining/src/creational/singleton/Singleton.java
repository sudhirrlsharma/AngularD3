package creational.singleton;

public class Singleton {
	private static Singleton theInstance;

	private Singleton() {
		// no one can create the instance now outside this class
	}

	public static Singleton Instance() {
		// Uses lazy initialization.
		// Note: this is not thread safe.
		if (theInstance == null) {
			theInstance = new Singleton();
		}

		return theInstance;
	}
}
