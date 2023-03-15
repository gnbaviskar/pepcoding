package LevelOne.lectThreeFunctionsArrays.numberSystems;

public class _3_anyBaseToDecimal2 {
//    without carrying the power, using math
    public static int getValueInAnyBase (int n, int b) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int remainder = n % 10;
            int val = remainder * power;
            ans += val;

            n = n / 10;
            power = power * b;
        }
        return  ans;
    }
    public static void main(String[] args) {

        int ans = getValueInAnyBase(1172, 8);
        System.out.println(ans);
    }
}
