package behavioral.interpreter;

import java.util.Map;

public class MinusExpression implements Expression{
	Expression leftOperand;
    Expression rightOperand;
    public MinusExpression(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
 
    public int interpret(Map<String,Expression> variables)  { 
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
