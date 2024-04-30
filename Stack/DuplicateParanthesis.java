import java.util.*;

public class DuplicateParanthesis {
    public static boolean checkDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ')') {    
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }
                if(count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "(((a+(b))+(c+d)))";

        if(checkDuplicate(str)) {
            System.out.println("Duplicate Parentheses Exist");
        } else {
            System.out.println("Duplicate Parentheses Does Not Exist");
        }
    }
}