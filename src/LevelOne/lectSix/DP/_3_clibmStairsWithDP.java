package LevelOne.lectSix.DP;

public class _3_clibmStairsWithDP {
    public static void main(String[] args) {
        int jumpArr[] = new int[]{2, 4, 1, 0, 2, 3};
        int n = 6;
        System.out.println(countClimbStairsWays(n, jumpArr));
    }
    public static int countClimbStairsWays(int n, int [] jumpArr) {
        int[] dp = new int[n+1];
        dp[n] = 1;

        for (int i = n-1; i >= 0; i--) {
            int jumps = jumpArr[i];
            int totJumpsForI = 0;
            for (int j = 1; j <= jumps && j <= n; j++) {
                int temp = i+j;
                if (temp <= n) {
                    totJumpsForI += dp[temp];
                } else break;
            }
            dp[i] = totJumpsForI;
        }
        return dp[0];
    }
}
