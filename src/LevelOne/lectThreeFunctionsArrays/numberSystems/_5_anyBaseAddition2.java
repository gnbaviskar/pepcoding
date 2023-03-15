package LevelOne.lectThreeFunctionsArrays.numberSystems;

public class _5_anyBaseAddition2 {
    // optimized the power function using carry forward technique
    public static void main(String[] args) {
        int ans = anyBaseAddition(227, 904, 10);
        System.out.println(ans);
        int ans2 = anyBaseAddition(11101, 1101, 2);
        System.out.println(ans2);
        int ans3 = anyBaseAddition(346, 777, 8);
        System.out.println(ans3);
        int ans4 = anyBaseAddition(234, 343, 5);
        System.out.println(ans4);
    }

    public static int anyBaseAddition(int num1, int num2, int base) {
        int ans = 0;
        int power = 1;
        int carry = 0;
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int digitNum1 = num1 % 10;
            int digitNum2 = num2 % 10;
            int addition = digitNum1 + digitNum2;
            addition += carry;
            int remainder = addition % base;
            ans += remainder * power;
            power = power * 10;
            carry = addition / base;
            num1 = num1 / 10;
            num2 = num2 / 10;

        }
//        ans += carry * power;
        return ans;
    }
}
