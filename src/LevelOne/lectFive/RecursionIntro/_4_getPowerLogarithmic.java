package LevelOne.lectFive.RecursionIntro;

public class _4_getPowerLogarithmic {
    public static void main(String[] args) {
        int val = getPowerLog(2, 10);
        System.out.println(val);
    }

    public  static int getPowerLog(int num, int power) {
        if (power == 1) return num;
        if ((power&1) == 1) {
            return  getPowerLog(num, power/2) * getPowerLog(num,power/2) * num;
        } else {
            return getPowerLog(num, power/2) * getPowerLog(num, power/2);
        }
    }
}
