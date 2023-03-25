package LevelOne.lectFive.RecursionIntro;

public class _3_getFact {
    public static void main(String[] args) {
        int val = getFactorial(5);
        System.out.println(val);
    }

    public static int getFactorial(int num) {
        if (num == 0) return 1;
        return num * getFactorial(num - 1);
    }
}
