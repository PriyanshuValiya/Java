import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if(s.isEmpty()) { // Case for str has only closing brackets like "))" || "}}"
                    return false;
                }
                
                char top = s.peek();
                if((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(!s.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "({[]()})";

        if(isValid(str)) {
            System.out.println("Valid Parentheses String");
        } else {
            System.out.println("Invalid Parentheses String");
        }
    }
}