import java.util.*;

/* Sum of First n number */

public class Basic {
    public static void print(int n, int i, int sum) {
        if(i == n ) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        print(n, i+1, sum);
    }

  public static void main(String[] args) {
    print(5, 1, 0);
  }  
}

/* Factorial of Given Number */

public class Basic {
  public static int facto(int n) {
   if(n == 1 || n == 0) {
      return 1;
   }
    int currfacto = n * facto(n-1);
    return currfacto;
  }

 public static void main(String[] args) {
   int ans = facto(5);
   System.out.println(ans);
 }  
}

/* Fibonacci Series */

public class Basic {
    public static void fibonacci(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n-1);
    }

  public static void main(String[] args) {
    int a = 0, b = 1, n = 7;
    System.out.print(a + " " + b + " ");
    fibonacci(a, b, n-2);
  }  
}

/* Power Function */

public class Basic {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }

  public static void main(String[] args) {
    int ans = power(2, 5);
    System.out.println(ans);
  }  
}

/* Log(n) method to find power */

public class Basic {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return power(x, n/2) * power(x, n/2);
        } else {
            return power(x, n/2) * power(x, n/2) * x;
        }
    }

  public static void main(String[] args) {
    int ans = power(2, 4);
    System.out.println(ans);
  }  
}