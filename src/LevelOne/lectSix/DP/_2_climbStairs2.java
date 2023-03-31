package LevelOne.lectSix.DP;

public class _2_climbStairs2 {
    public static void main(String[] args) {
        System.out.println(countClimbStairsWays(6));
    }
    public static int countClimbStairsWays(int n) {
        int [] storage = new int[n+1];

        storage[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                storage[i] = storage[i-1];
            } else if (i==2) {
                storage[i] = storage[i-1] + storage[i-2];
            } else {
                storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
            }
        }

        return storage[n];
    }
}
