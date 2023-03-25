package LevelOne.lectFive.RecursionIntro;

public class _4_getPowerLinear {
    public static void main(String[] args) {
        int val = getPower(2, 10);
        System.out.println(val);
    }

    public static int getPower(int num, int power) {
        if (power == 1) return num;
        return num * getPower(num, power - 1);
    }
}
