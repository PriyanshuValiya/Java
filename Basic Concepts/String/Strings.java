package String;
import java.util.*;

/* .compareTo() Function */

public class Strings {
   public static void main(String args[]) {
       String name1 = "Hello";
       String name2 = "World";

       if(name1.compareTo(name2) == 0) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
   }
}

/* .subString() Function */ 

public class Strings {
    public static void main(String args[]) {
        String name = "Priyanshu Valiya";   
        System.out.println(name.substring(10));    
        System.out.println("Length Of String : " + name.length());
    }
 }
 
/* .parseInt() Function */

public class Strings {
    public static void main(String args[]) {
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);     
    }
 }
 
/* toString() Function */

public class Strings {
    public static void main(String args[]) {
       int number = 123;
       String str = Integer.toString(number);
       System.out.println(str);       
    }
 }
 
 
/* Replace Character in String */
// Here we are going to replace 'e' with 'i'.

public class Strings {
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      String str = sc.next();
      String result = "";
 
      for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'e') {
          result += 'i';
        } else {
          result += str.charAt(i);
        }
      }
      System.out.println(result);
    }
 }