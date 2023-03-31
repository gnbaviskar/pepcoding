package LevelOne.lectSix.DP;

public class _4_climbStairsMinMoves1 {
    public static void main(String[] args) {
        int[] jArr = new int[]{3, 2, 4, 2, 0, 2, 3, 1, 2, 2};
        int n = jArr.length;
        Integer[] dp = new Integer[n+1];
        dp[n] = 0;
        for (int i = n-1; i >= 0; i--) {
            if (jArr[i] == 0) {
                continue;
            }
            int minMoves = Integer.MAX_VALUE;
            int jumps = jArr[i];
            for (int j = 1; j <= jumps && i+j < dp.length; j++) {
                int tempIndex = i+j;
                if (dp[tempIndex] != null) {
                    minMoves = Math.min(minMoves, dp[tempIndex]);
                }
            }

            if (minMoves != Integer.MAX_VALUE) {
                dp[i] = minMoves+1;
            }
        }
        System.out.println(dp[0]);

    }
}
