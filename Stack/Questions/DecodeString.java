import java.util.*;

public class DecodeString {
    public static void decoder(String str) {
        Stack<Character> s = new Stack<>();
        System.out.println(str);

        for(int i=0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        for(int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ']') {
                while(s.peek() != '[') {
                    System.out.print(s.pop());
                }
                s.pop();
                System.out.print(" " + s.peek());

                for(int j=0; j < s.peek(); j++) {
                    System.out.print(s.peek());
                }
            } else {
                s.push(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "2[PV]";

        decoder(str);
    }
}
