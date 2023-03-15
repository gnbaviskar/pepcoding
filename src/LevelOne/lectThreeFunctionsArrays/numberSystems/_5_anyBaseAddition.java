package LevelOne.lectThreeFunctionsArrays.numberSystems;

public class _5_anyBaseAddition {
    public static void main(String[] args) {
        int ans = anyBaseAddition(227, 904, 10);
        System.out.println(ans);
        int ans2 = anyBaseAddition(11101, 1101, 2);
        System.out.println(ans2);
    }

    public static int anyBaseAddition(int num1, int num2, int base) {
        int ans = 0;
        int power = 0;
        int carry = 0;
        while (num1 > 0 || num2 > 0) {
            int digitNum1 = num1 % 10;
            int digitNum2 = num2 % 10;
            int addition = digitNum1 + digitNum2;
            addition += carry;
            int remainder = addition % base;
            ans += remainder * Math.pow(10, power);
            power++;
            carry = addition / base;
            num1 = num1 / 10;
            num2 = num2 / 10;

        }
        ans += carry * Math.pow(10, power);
        return ans;
    }
}
