package LevelOne.lectThreeFunctionsArrays.numberSystems;

public class _6_anyBaseSubtraction2 {
    public static void main(String[] args) {
//        int ans = subtract(8, 1, 100);
//        System.out.println(ans);
//
//        int ans2 = subtract(10, 1, 100);
//        System.out.println(ans2);

        int ans3 = subtract(4, 221, 203);
        System.out.println(ans3);

    }
    public static int subtract(int base, int num1, int num2) {
        int sign = 1;
        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
            sign = -1;
        }
        int ans = 0;
        int carry = 0;
        int power = 1;
        while (num1 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            digit1 = digit1 - carry;
            if (digit1 < digit2) {
                digit1 = digit1 + base;
                carry = 1;
            } else {
                // mistake, I did not set 0 in case if d1 < d2. then we should set carry to 0
                carry = 0;
            }
            int sub = digit1 - digit2;
//            System.out.println(sub);
            ans += sub * power;
            power = power * 10;
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return ans;
    }
}
