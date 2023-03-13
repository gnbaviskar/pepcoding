package LevelOne.lectThreeFunctionsArrays.numberSystems;

public class _7_anyBaseMultiplication1 {
    public static void main(String[] args) {
        int ans = anyBaseMultiplication(234, 76, 8);
        System.out.println(ans);
    }

    public static int anyBaseMultiplication(int num1, int num2, int base) {
        int finalAns = 0;
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int finalPower = 1;
        while (num2 > 0) {
            int mulDigit = num2 % 10;
            num2 = num2 / 10;
            int ans = 0; int power = 1; int carry = 0;
            int tempNum1 = num1;

            while (tempNum1 > 0) {
                int digit1 = tempNum1 % 10;
                tempNum1 = tempNum1 / 10;


                int mult = digit1 * mulDigit;
                mult += carry;
                int val = mult % base;

                ans += val * power;
                carry = mult / base;
                power = power * 10;
            }

            if (carry> 0) ans += carry * power;
            ans = ans * finalPower;
            finalAns = anyBaseAddition(finalAns, ans, base);

            finalPower = 10 * finalPower;
        }
        return finalAns;
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
        return ans;
    }
}
