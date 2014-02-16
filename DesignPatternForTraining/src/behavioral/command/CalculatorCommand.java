package behavioral.command;

public class CalculatorCommand extends Command {
	private char operator;
	private int operand;
	private Calculator calculator;

	public CalculatorCommand(Calculator calculator, char operator, int operand) {
		this.calculator = calculator;
		this.operator = operator;
		this.operand = operand;
	}

	// Execute new command
	@Override
	public void execute() {
		calculator.operation(operator, operand);
	}

	  // Unexecute last command
	@Override
    public  void unExecute(){
      calculator.operation(this.undo(operator), operand);
    }
	
	  // Returns opposite operator for given operator
    private char undo(char operator){
      switch (operator){
        case '+': return '-';
        case '-': return '+';
        case '*': return '/';
        case '/': return '*';
        default: throw new IllegalArgumentException(operator+"");
      }
    }
}
