import java.util.*;

/* if-else Condition */

public class Condition {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Any Number : ");
       int number = sc.nextInt();
       if(number % 2 == 0) {
          System.out.println("Your Entered Number is Even.");
       } else {
          System.out.println("Your Enterd Number is Odd.");
       }
    }  
 }
 
 /* else-if ladder Condition */
 
 public class Condition {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.print("Enter Your Preferable Language : ");
       int lang = sc.nextInt();     
       if(lang == 1) {
          System.out.println("English");
       } else if (lang == 2) {
          System.out.println("Gujarati");
       } else if (lang == 3) {
          System.out.println("Hindi");
       } else {
          System.out.println("Invalid Language");
       }
    }
 }
 
 
 /* Switch Condition */
 
 public class Condition {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.print("Enter Your Preferable Language : ");
       int lang = sc.nextInt();
 
       switch(lang) {
          case 1: System.out.println("English");
          break;
          case 2: System.out.println("Gujarati");
          break;
          case 3: System.out.println("Hindi");
          break;
          default: System.out.println("Invalid Language");
       }
    } 
 }