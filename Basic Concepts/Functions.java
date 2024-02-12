import java.util.*;

/* Basic Function */

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }   
}

/* Prime Or Not Function */

public class Functions {
    public static void check(int a) {
        int flag = 0;
        for(int i=1; i <= a; i++) {
            if(a % i == 0) {
                flag++;
            } else {
                continue;
            }
        }
        if(flag == 2) {
            System.out.println(a + " is a Prime Number");
        } else {
            System.out.println(a + " is Not a Prime Number");  
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    } 
}

/* Power Calculator */

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value Of Base : ");
        int x = sc.nextInt();
        System.out.print("Enter Value Of Exponent : ");
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
    
    public static int power(int a, int b) {
        if(b == 0) {
            return 1;
        } else {
            return a * power(a, b-1);
        }
    }
}
