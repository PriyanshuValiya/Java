public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int n) {
        //row
        for(int j=0; j<9; j++) {
            if(sudoku[row][j] == n) {
                return false;
            }
        }

        //col
        for(int i=0; i<9; i++) {
            if(sudoku[i][col] == n) {
                return false;
            }
        }

        //grid
        int startingRow = (row/3)*3;
        int startingCol = (col/3)*3;
        for(int i=startingRow; i<startingRow+3; i++) {
            for(int j=startingCol; j<startingCol+3; j++) {
                if(sudoku[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int sudoku[][], int i, int j) {
        if(i == 9) {
            return true;
        }
        int nextRow=i, nextCol=j+1;
        if(j+1 == 9) {
            nextRow = i+1;
            nextCol = 0;
        } 

        //already placed
        if(sudoku[i][j] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        for(int n=1; n<=9; n++) {
            if(isSafe(sudoku, i, j, n)) {
                sudoku[i][j] = n;
                if(solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[i][j] = 0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for(int i=0; i<sudoku.length; i++) {
            for(int j=0; j<sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        int sudoku[][] = { 
         {0, 0, 8, 0, 0, 0, 0, 0, 0}, 
         {4, 9, 0, 1, 5, 7, 0, 0, 2}, 
         {0, 0, 3, 0, 0, 4, 1, 9, 0}, 
         {1, 8, 5, 0, 6, 0, 0, 2, 0}, 
         {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
         {9, 6, 0, 4, 0, 5, 3, 0, 0}, 
         {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
         {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
         {8, 2, 7, 0, 0, 9, 0, 1, 3} 
        };

        if(solveSudoku(sudoku, 0, 0)) {
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Doesn't Exist");
        }
    }
}