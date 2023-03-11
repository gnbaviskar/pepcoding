package LevelOne.lectThreeFunctionsArrays;

public class _2_decimalToAnyBase {
    public static int getValueInAnyBase (int n, int b) {
        int ans = 0;

        int carryPower = 1;
        while (n  > 0) {
            int rem = n % b;
            int val = rem * carryPower;
            ans += val;
            carryPower = carryPower * 10;
            n = n / b;

        }

        return ans;
    }
    public static void main(String[] args) {
        int n = 57;
        int b = 2;
        int ans = getValueInAnyBase(634, 8);
        System.out.println(ans);
    }
}
