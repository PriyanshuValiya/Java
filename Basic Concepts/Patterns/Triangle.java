import java.util.*;
 
 /* Half Triangle */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int n = sc.nextInt();
       for(int i = 1; i <= n; i++) {
          for(int j = 0; j < i; j++) {
             System.out.print("*");
          }
          System.out.println();
       }
    }  
 }
 
 /* Reverce Half Triangle */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int n = sc.nextInt();
       for(int i = n; i >= 1; i--) {
          for(int j = 0; j < i; j++) {
             System.out.print("*");
          }
          System.out.println();
       }
    }  
 }
 
 /* Inverted Half Triangle */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int n = sc.nextInt();
       for(int i = 1; i <= n; i++) {
          for(int j = 1; j <= (n-i); j++) {
             System.out.print(" ");
          }
          for(int j = 1; j <= i; j++) {
             System.out.print("*");
          }
          System.out.println();
       }
    }  
 }
 
 /* Numerical Half Triangle */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int n = sc.nextInt();
       for(int i=1; i <= n; i++) {
          for(int j=1; j <= i; j ++) {
             System.out.print(j);
          }
          System.out.println();
       }
    }
 }
 
 /* Reverce Numerical Half Triangle */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int n = sc.nextInt();
       for(int i=n; i >= 1; i--) {
          for(int j=1; j <= i; j ++) {
             System.out.print(j);
          }
          System.out.println();
       }
    }
 }
 
 /* Increasing Number Half Triangle  */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("\nEnter Number : ");
       int n = sc.nextInt();
       int k = 1;
       for(int i=1; i <= n; i++) {
          for(int j=1; j <= i; j++) {
             System.out.print(k + " ");
             k++;
          }
          System.out.println();
       }
    }
 }
 
 /* 0-1 Half Triangle */
 
 public class Triangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("\nEnter Number : ");
       int n = sc.nextInt();
       for(int i=1; i <= n; i++) {
          for(int j=1; j <= i; j++) {
             if ((i+j) % 2 == 0) {
                System.out.print("1");
             } else {
                System.out.print("0");
             }
          }
          System.out.println();
       }
    }
 }