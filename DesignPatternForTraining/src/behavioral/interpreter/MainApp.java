package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
	  public static void main(String[] args) {
	        testVariableExpression();
	       // testNExpression();
	    }

	private static void testVariableExpression() {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		Map<String,Expression> variables = new HashMap<String,Expression>();
		variables.put("w", new NumberExpression(5));
		variables.put("x", new NumberExpression(10));
		variables.put("z", new NumberExpression(42));
		int result = sentence.interpret(variables);
		System.out.println(result);
	}
	
}
