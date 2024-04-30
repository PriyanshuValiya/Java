import java.util.*;

public class SimpleURL {
    public static void pushAtBottom(Stack<Character> s, char data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        char temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void reverse(Stack<Character> s) {
        if(s.isEmpty()) {
            return;
        }

        char top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void optimizedURL(String url) {
        Stack<Character> s = new Stack<>();
        int count = 0;

        for(int i=0; i < url.length()-1; i++) {
            s.push(url.charAt(i));
        }

        for(int i=0; i < url.length()-1; i++) {
            char ch = url.charAt(i);

            if(ch == '/' && count != 0) {
                if(url.charAt(i+1) == ' ') {
                    s.pop();
                } else if(url.charAt(i+1) == '.') {
                    while(s.pop() != '/') {
                        s.pop();
                    }
                }
            } else {
                count++;
            }
        }

        reverse(s);

        while(!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
        String url = "/PriyanshuValiya/github/..";

        System.out.println("URL : " + url);

        optimizedURL(url);
    }
}
