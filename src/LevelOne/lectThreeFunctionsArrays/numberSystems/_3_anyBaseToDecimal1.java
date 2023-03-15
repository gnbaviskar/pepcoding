package LevelOne.lectThreeFunctionsArrays.numberSystems;

public class _3_anyBaseToDecimal1 {
    public static int getValueInAnyBase (int n, int b) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int remainder = n % 10;
            ans += remainder * power;
            power = b * power;
            n = n / 10;
        }
        return ans;
    }
    public static void main(String[] args) {

        int ans = getValueInAnyBase(1172, 8);
        System.out.println(ans);
    }
}
