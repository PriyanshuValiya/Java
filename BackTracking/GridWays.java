package Java.BackTracking;

public class GridWays {
    public static int posibleWays(int i, int j, int n, int m) {
        if (i == n-1 && j == m-1) { // already at target cell
            return 1;
        } else if(i == n || j == m) { // at boundries
            return 0;
        }
        
        int w1 = posibleWays(i+1, j, n, m);
        int w2 = posibleWays(i, j+1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        int ans = posibleWays(0, 0, n, m);
        System.out.println("Total Possible Ways is : " + ans);
    }
}
