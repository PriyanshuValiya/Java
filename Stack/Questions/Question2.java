// Q - Reverse a String using a Stack

import java.util.*;

public class Question2 {
    public static void main(String args[]) {
        String str = "Apna College";

        Stack<Character> s = new Stack<>();
        
        int i=0;
        while(i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");

        while(!s.isEmpty()) {
            result.append(s.pop());
        }

        System.out.println(result);
    }
}