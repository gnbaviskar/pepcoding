package LevelOne.lectThreeFunctionsArrays;

public class _1_digitfrequency {

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int r = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == d) {
                r++;
            }
            n = n / 10;
        }
        return r;
    }
    public static void main(String[] args) {
        int n = 994543234;
        int d = 4;
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
}
