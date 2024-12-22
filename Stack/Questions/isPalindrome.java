package Questions;
import java.util.*;

public class isPalindrome {
    public static boolean ispalindrome(LinkedList<Character> ll) {
        Stack<Character> s = new Stack<>();
        LinkedList<Character> tll = new LinkedList<>();

        for(int i=0; i < ll.size(); i++) {
            s.push(ll.get(i));
        }

        while(!s.isEmpty()) {
            tll.addLast(s.pop());
        }

        System.out.println("Reverced LL : " + tll);

        if(ll.equals(tll)) {
           return true;
        } else {
           return false;
        }
    }

    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('D');
        ll.addLast('E');

        System.out.println("Original LL : " + ll);

        if(ispalindrome(ll)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    } 
}
