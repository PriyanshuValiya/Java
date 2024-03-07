package String;

/* Replace Character */

public class StringBuilders {
    public static void main(String args[]) {
      StringBuilder sb = new StringBuilder("Tony");
      sb.setCharAt(0, 'R');
      System.out.println(sb);
    }
}

/* Insert Character */

public class StringBuilders {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("tony");
     sb.insert(0, 'S');
     System.out.println(sb);
   }
}

/* Delete Character */

public class StringBuilders {
    public static void main(String args[]) {
      StringBuilder sb = new StringBuilder("tony");
      sb.delete(2, 3);
      System.out.println(sb);
    }
}
 
/* Append Character */

public class StringBuilders {
    public static void main(String args[]) {
      StringBuilder sb = new StringBuilder("Tony ");
      sb.append("Stark");
      System.out.println(sb); 
    }
}
 
/* Reverse String Using StringBuilder Class */

public class StringBuilders {
  public static void main(String args[]) {
    StringBuilder sb = new StringBuilder("tonY starK");
  // Write for User's Input :     
  //    Scanner sc = new Scanner(System.in);
  //    StringBuilder sb = new StringBuilder(sc.nextLine());
   
    for(int i=0; i<sb.length()/2; i++) {
      char frontChar = sb.charAt(i);
      char backChar = sb.charAt(sb.length() - i - 1);

      sb.setCharAt(i, backChar);
      sb.setCharAt(sb.length() - i - 1, frontChar);
    }
   System.out.println(sb);
  }
}
