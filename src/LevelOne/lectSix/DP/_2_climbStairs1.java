package LevelOne.lectSix.DP;

public class _2_climbStairs1 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countClimbStairs(n, new int[n+1]));
    }

    public static int countClimbStairs(int n, int[] mem) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (mem[n] != 0) return mem[n];

        System.out.println("hello world: "+n);
        int n1 = countClimbStairs(n-1, mem);
        int n2 = countClimbStairs(n-2, mem);
        int n3 = countClimbStairs(n-3, mem);
        int ans = n1+n2+n3;
        mem[n] = ans;
        return ans;
    }
}
