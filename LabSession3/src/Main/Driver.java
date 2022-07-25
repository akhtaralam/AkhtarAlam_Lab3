package Main;

import com.greatlearning.balancedBrackets.BalancedBrackets;

public class Driver {

	public static void main(String[] args) {
		BalancedBrackets balancedBrackets = new BalancedBrackets();
		String expression = "( [ [ { } ] ] )";

		// Function call
		if (balancedBrackets.areBracketsBalanced(expression))
			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
	}
}
