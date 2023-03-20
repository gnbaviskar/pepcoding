package LevelOne.lectSix.DP;

public class _1_fib {
    public static void main(String[] args) {
        int val = fib(10);
        System.out.println("withou memoized: "+ val);
        int n = 10;
        System.out.println();
        System.out.println();
        int val2 = getFibMemoised(n, new int[n+1]);
        System.out.println("memoized: "+val2);
    }

    public static int fib(int num) {
        if (num <= 2) return 1;
        System.out.println("happy: "+num);
        return fib(num - 1) + fib(num - 2);
    }

    public static int getFibMemoised(int num,int[] qb) {
        if (num <= 2) return 1;

        if (qb[num] != 0) {
            return qb[num];
        }


        System.out.println("happy: "+num);
        int fibNum = getFibMemoised(num - 1, qb) + getFibMemoised(num - 2, qb);
        qb[num] = fibNum;
        return fibNum;
    }


}
