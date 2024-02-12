package Arrays;
import java.util.*;

/* Print Matrix */

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
 
        int numbers[][] = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                    System.out.print(numbers[i][j]+" ");
            }
         System.out.println();
        }
    }
}

/* Transpose Of Matrix */

class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of Columns : ");
        int cols = sc.nextInt();
 
        int numbers[][] = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transposed Matrix : ");

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                    System.out.print(numbers[j][i] + " ");
            }
         System.out.println();
        }
    }
}

/* Diagonal Sum */

class main {
    public static void diagonalSum(int matrix[][]) {
        int primarySum = 0, secondarySum = 0;

        for(int i=0; i <= matrix.length-1; i++) { 
            for(int j=0; j <= matrix[0].length-1; j++) {
                if(i == j) {
                    primarySum += matrix[i][j];
                }
            }
        }

        for(int i=matrix.length-1; i >= 0; i--) {
            for(int j=matrix[0].length-1; j >= 0; j--) {
                if(i == j) {
                    secondarySum += matrix[i][j];
                }
            }
        }

        System.err.print(primarySum + secondarySum);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        diagonalSum(matrix);
    }
}

/* Optimized Approch for Diagonal Sum */

class main {
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;

        for(int i=0; i <= matrix.length-1; i++) {
            sum += matrix[i][i];

            // for secondarySum => i+j = n-1; So, j = n-1-i; Here n = 4
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        
        System.out.print(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        diagonalSum(matrix);
    }
}

/* Search Given Key in Sorted 2D-Array (Stair Method) */

class main {
    public static boolean findEle(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;
        
        while(row <= matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("Found " + key + " at [" + row + "," + col + "]");
                return true;
            } else if(key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println(key + " Does not Exist in this matrix.");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        findEle(matrix, 25);
    }  
}