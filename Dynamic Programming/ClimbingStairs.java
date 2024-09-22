import java.util.*;

public class ClimbingStairs {
    public static int countWaysMem(int n, int dp[]) {
        if(n == 0) {
            return 1;
        }

        if(n < 0) {
            return 0;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = countWaysMem(n - 1, dp) + countWaysMem(n - 2, dp);
        return dp[n];
    }

    public static int countWaysTab(int n) {
        int dp2[] = new int[n + 1];
        dp2[0] = 1;
        dp2[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp2[i] = dp2[i - 1] + dp2[i - 2];
        }

        return dp2[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];

        Arrays.fill(dp, -1);

        System.err.println(countWaysMem(n, dp));
        System.out.println(countWaysTab(n));
    }
}