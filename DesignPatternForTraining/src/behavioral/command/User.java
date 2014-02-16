package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class User {
	// Initializers
	private Calculator calculator = new Calculator();
	private List<Command> commands = new ArrayList<Command>();
	private int current = 0;

	public void Redo(int levels) {
		System.out.printf("\n---- Redo {%d} levels ", levels);
		// Perform redo operations
		for (int i = 0; i < levels; i++) {
			if (current < commands.size() - 1) {
				Command command = commands.get(current++);
				command.execute();
			}
		}
	}

	public void Undo(int levels) {
		System.out.printf("\n---- Undo {%d} levels ", levels);
		// Perform undo operations
		for (int i = 0; i < levels; i++) {
			if (current > 0) {
				Command command = commands.get(--current);
				command.unExecute();
			}
		}
	}

	public void compute(char operator, int operand) {
		// Create command operation and execute it
		Command command = new CalculatorCommand(calculator, operator, operand);
		command.execute();

		// Add command to undo list
		commands.add(command);
		current++;
	}
}
