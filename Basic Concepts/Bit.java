import java.util.*;

/* Get Bit */

class main {
   public static void main(String args[]) {
      int n = 5; // bit - 0101 
      int pos = 3;
      int bitMask = 1 << pos;

      if((bitMask & n) == 0) {
          System.out.println("Bit Was Zero");
      } else {
          System.out.println("Bit Was One");
      }
   }
}

/* Set Bit */

class main {
    public static void main(String args[]) {
       int n = 5; // bit - 0101
       int pos = 1;
       int bitMask = 1 << pos;
 
       int newNumber = bitMask | n;
       System.out.println(newNumber);
    }
}
 
/* Clear Bit */

class main {
    public static void main(String args[]) {
       int n = 5; //0101
       int pos = 2;
       int bitMask = 1 << pos;
       int newBitMask = ~(bitMask);
       int newNumber = newBitMask & n;
       System.out.println(newNumber);
    }
}
  
/* Update Bit */

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 or 1 : ");
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
       int n = 5;  // bit - 0101
       int pos = 1;
      
       int bitMask = 1 << pos;
       if(oper == 1) {
           int newNumber = bitMask | n;
           System.out.println(newNumber);
       } else {
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
       }
    }
}
 
/* Write a program to find if a number is a power of 2 or not. */

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        boolean condition = checkPower(num);
  
        if(condition) {
            System.out.println(num + " is Power of 2");
        } else {
            System.out.println(num + " is Not Power of 2");
        }
    } 

    public static boolean checkPower(int n) {
        boolean result = (n & (n - 1)) == 0;
        return result;
    }
}

/* Write a program to count the number of 1’s in a binary representation of the number. */

/* Method 1 */

class main {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Total Number of 1 is " + count);
    }
}

/* Method 2  */

class main {
    public static void main(String[] args) {
        System.out.print("Enter Number : "); // 7 - 0111
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n);
        char arr[] = bin.toCharArray();
        int count = 0;
        for(int i=0; i <= arr.length - 1; i++) {
            if(arr[i] == '1') {
                count++;
            } else {
                continue;
            }
        }
        System.out.println("Total Number of 1 is " + count);
       }
}

/* Write 2 Functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another */

class main {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binaryNumber = Integer.toBinaryString(num);
        System.out.println("Binary Number : " + binaryNumber);
        int originalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("Original Number : " + originalNumber);
    }
}