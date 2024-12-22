package Questions;
import java.util.*;


public class SimpleURL {
    public static void simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> stack = new Stack();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim() != "") {
                stack.push(arr[i]);
            }
        }

        int flag = 0;

        while (!stack.isEmpty()) {
            String s = stack.pop();

            if (s.equals("..")) {
                flag++;
            } else if (s.equals(".")) {
                continue;
            } else {
                if (flag == 0) {
                    sb.insert(0, "/" + s);
                } else {
                    flag--;
                }
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String url = "/PriyanshuValiya/github/..";

        System.out.println("URL : " + url);

        simplifyPath(url);
    }
}
