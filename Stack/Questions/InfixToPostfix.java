package Questions;
import java.util.*;

public class InfixToPostfix {
    // Function to get the precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    // Function to convert infix to postfix
    static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If an operator is encountered
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*c^d-e^f+g*h-i";
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + infixToPostfix(infixExpression));
    }
}