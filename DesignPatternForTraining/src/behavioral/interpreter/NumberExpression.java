package behavioral.interpreter;

import java.util.Map;

public class NumberExpression implements Expression {
	private int number;

	public NumberExpression(int number) {
		this.number = number;
	}

	public int interpret(Map<String, Expression> variables) {
		return number;
	}
}
