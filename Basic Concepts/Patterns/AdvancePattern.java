import java.util.*;

/* Butterfly Pattern */

public class AdvancePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        for(int i=1; i <= n; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j=1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=n; i >= 1; i--) {
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j=1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

/* Hollow Butterfly Pattern */

public class AdvancePattern {
    public static void main(String[] args) {
        System.out.println();
        int n = 10;
        for(int i=1; i <= n; i++) {
            for(int j=1; j <= i; j++) {
                if(j == i ||j == 1) {
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            for(int j=1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++) {
                if(j == i ||j == 1) {
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=(n-1); i >= 1; i--) {
            for(int j=1; j <= i; j++) {
                if(j == i ||j == 1) {
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            for(int j=1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++) {
                if(j == i ||j == 1) {
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/* Solid Rhombus */

public class AdvancePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        for(int i=1; i <= n; i++) {
            for (int j=1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Number Pyramid */

 public class AdvancePattern {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Any Number : ");
         int n = sc.nextInt();
         for(int i=1; i <= n; i++) {
             for(int j=1; j <= (n-i); j++) {
                 System.out.print(" ");
            }
             for(int j=1; j <= i; j++) {
                 System.out.print(i + " ");
        System.out.println();
       }
    }
 }
 }

/* Palindromic Pattern */

 public class AdvancePattern {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Any Number : ");
         int n = sc.nextInt();
         for(int i=1; i <= n; i++) {
             for(int j=1; j <= (n-i); j++) {
                 System.out.print(" ");
           }
             for(int j=i; j >= 1; j--) {
                 System.out.print(j);
             }
             for(int j=2; j <= i; j++) {
                 System.out.print(j);
             }
             System.out.println();
        }
     }
 }

/* Diamond Pattern */

public class AdvancePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
         for(int i=1; i <= n; i++) {
            for(int j=1; j <= (n-i); j++) {
               System.out.print(" ");
            }
            for(int j=1; j <= i; j++) {
                System.err.print("*");
            }
            for(int j=2; j <= i; j++) {
                System.err.print("*");
            }
          System.out.println();
        }
        for(int i=(n-1); i >= 1; i--) {
           for(int j=1; j <= (n-i); j++) {
              System.out.print(" ");
           }
           for(int j=1; j <= i; j++) {
               System.err.print("*");
           }
           for(int j=2; j <= i; j++) {
               System.err.print("*");
           }
         System.out.println();
       }
    }
}

/* Spiral Pattern */

public class AdvancePattern {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        // Here i denotes variable Rows and j denotes variable Collums.

        while(startRow <= startCol && startCol <= endCol) {
            // Top Boundry
            for(int j=startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right Boundry
            for(int i=startRow+1; i <= endCol; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //Bottom Boundry
            for(int j=endCol-1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //Left Boundry
            for(int i=endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}