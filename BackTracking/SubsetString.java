package Java.BackTracking;

public class SubsetString {
    public static void findSubsets(String str, String ans, int i) {
        // Base Case
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        // Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // No Choice
        findSubsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "JAVA";
        findSubsets(str, new String(""), 0);
    }
}
