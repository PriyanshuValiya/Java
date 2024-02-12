/* Tower Of Henoi */

public class Intermediate {
    public static void tower(int n, String src, String helper, String des) {
        if(n == 1) {
            System.out.println("Transfer Disk : " + n + " From " + src + " to " + des);
            return;
        }
        tower(n-1, src, des, helper);
        System.out.println("Transfer Disk : " + n + " From " + src + " to " + des);
        tower(n-1, helper, src, des);
    }

    public static void main(String[] args) {
        tower(5, "Source", "Helper", "Destination");
    }
}


/* Reverce String Using Recursion */

public class Intermediate {
    public static void printRevName(int idx, String name) {
        if(idx == 0){
            System.out.print(name.charAt(idx));
            return;
        }
        System.out.print(name.charAt(idx));
        printRevName(idx-1, name);
    }

    public static void main(String[] args) {
        String name = "Priyanshu";
        printRevName(name.length()-1, name);
    }
}