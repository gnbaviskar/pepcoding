package LevelOne.lectSix.DP;

public class _3_climbStairsWithJumps1 {

    public static int jumpArr[] = new int[]{2, 4, 1, 0, 2, 3};
    static int n = 6;
    public static void main(String[] args) {
        climbStairs("", 0);
    }
    static int counter = 0;
    public static void climbStairs(String ans, int curS) {

        if (curS == n) {
            counter++;
            ans = ans + "stairs: "+curS+"|";
//            System.out.println(ans);
            System.out.println("counter: "+counter);
            return;
        }

        if (curS > n) {
            return;
        }

        int jumps = jumpArr[curS];
        for (int i = 1; i <= jumps; i++) {
            int newStair = curS+i;
            ans = ans + "stairs: "+curS+" jumpVal: "+i+ " go to: "+newStair+"|";
            System.out.println(ans);
            climbStairs(ans, newStair);
        }


    }

}
