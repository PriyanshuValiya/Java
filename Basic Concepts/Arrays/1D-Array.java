package Arrays;
import java.util.*;

/* Taking an array as an input and printing its elements */

class main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size of Array : ");
       int size = sc.nextInt();
       int numbers[] = new int[size];


       for(int i=0; i<size; i++) {
        System.out.print("Enter " + (i+1) + "th Element : ");
           numbers[i] = sc.nextInt();
       }

       for(int i=0; i<numbers.length; i++) {
        System.out.print((i+1) + "th Element : ");
           System.out.println(numbers[i]+" ");
       }
   }
}