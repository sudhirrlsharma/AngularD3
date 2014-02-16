package behavioral.command;

public class MainApp {

	public static void main(String[] args) {
		// Create user and let her compute
	      User user = new User();
	 
	      // User presses calculator buttons
	      user.compute('+', 100);
	      user.compute('-', 50);
	      user.compute('*', 10);
	      user.compute('/', 2);
	 
	      // Undo 4 commands
	      user.Undo(4);
	 
	      // Redo 3 commands
	      user.Redo(3);
	 
	      // Wait for user
	}
}
