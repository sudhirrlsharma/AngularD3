package creational.singleton;

public class MainApp {
public static void main(String[] args) {
	Singleton s1 = Singleton.Instance();
    Singleton s2 = Singleton.Instance();

    // Test for same instance
    if (s1 == s2)
    {
      System.out.println("Objects are the same instance");
    }
}
}
