package behavioral.command;

public class Calculator {
	private int curr = 0;
	 public void operation(char operator, int operand)
	    {
	      switch (operator)
	      {
	        case '+': curr += operand; break;
	        case '-': curr -= operand; break;
	        case '*': curr *= operand; break;
	        case '/': curr /= operand; break;
	      }
	      System.out.printf("\nCurrent value = {%d} (following {%c} {%d})",curr,operator, operand);
	    }
}
