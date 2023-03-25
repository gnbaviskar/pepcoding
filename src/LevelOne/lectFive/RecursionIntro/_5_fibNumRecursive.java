package LevelOne.lectFive.RecursionIntro;

public class _5_fibNumRecursive {
    public static void main(String[] args) {
        int val = fibNum(9);
        System.out.println(val);
    }

    public static int fibNum(int num) {
        if (num <= 2) return 1;

        return fibNum(num - 1) + fibNum(num - 2);
    }
}
