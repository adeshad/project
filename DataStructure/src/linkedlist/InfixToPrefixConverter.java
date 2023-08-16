package linkedlist;
import java.util.Stack;

public class InfixToPrefixConverter {


	    // Function to check if a given character is an operator
	    private static boolean isOperator(char ch) {
	        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
	    }

	    // Function to get the precedence of an operator
	    private static int getPrecedence(char ch) {
	        switch (ch) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	        }
	        return -1;
	    }

	    // Function to convert infix expression to prefix expression
	    public static String convertToPrefix(String infixExpression) {
	        StringBuilder prefix = new StringBuilder();
	        Stack<Character> stack = new Stack<>();

	        // Reverse the infix expression
	        StringBuilder reverseInfix = new StringBuilder(infixExpression).reverse();

	        for (int i = 0; i < reverseInfix.length(); i++) {
	            char ch = reverseInfix.charAt(i);

	            // If the character is an operand, append it to the prefix expression
	            if (!isOperator(ch)) {
	                prefix.append(ch);
	            } else if (ch == ')') {
	                stack.push(ch);
	            } else if (ch == '(') {
	                while (!stack.isEmpty() && stack.peek() != ')') {
	                    prefix.append(stack.pop());
	                }
	                // Remove the closing parenthesis from the stack
	                stack.pop();
	            } else {
	                while (!stack.isEmpty() && getPrecedence(ch) < getPrecedence(stack.peek())) {
	                    prefix.append(stack.pop());
	                }
	                stack.push(ch);
	            }
	        }

	        // Pop any remaining operators from the stack
	        while (!stack.isEmpty()) {
	            prefix.append(stack.pop());
	        }

	        // Reverse the prefix expression to get the final result
	        return prefix.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String infixExpression = "(A+B)*(C-D)";

	        System.out.println("Infix Expression: " + infixExpression);
	        String prefixExpression = convertToPrefix(infixExpression);
	        System.out.println("Prefix Expression: " + prefixExpression);
	    }
	}

