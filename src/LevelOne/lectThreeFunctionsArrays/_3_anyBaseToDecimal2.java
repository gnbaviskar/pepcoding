package LevelOne.lectThreeFunctionsArrays;

public class _3_anyBaseToDecimal2 {
//    without carrying the power, using math
    public static int getValueInAnyBase (int n, int b) {
        int ans = 0;
        int carry = 0;
        while (n > 0) {
            int rem = n % 10;
            int power = (int)Math.pow(b, carry);
            ans += rem * power;
            carry++;
            n = n / 10;
        }
        return ans;
    }
    public static void main(String[] args) {

        int ans = getValueInAnyBase(1172, 8);
        System.out.println(ans);
    }
}
