package LevelOne.lectThreeFunctionsArrays;

public class _6_anyBaseSubtraction1 {
    // working testing locally: failed while submission
    public static void main(String[] args) {
//        int ans2 = anyBaseSub(227, 904, 10);
//        System.out.println(ans2);
//
//        int ans = anyBaseSub(6213, 1789, 10);
//        System.out.println(ans);

        int ans3 = anyBaseSub(1000,111,2);
        System.out.println(ans3);

        int ans4 = anyBaseSub(1212,256,8);
        System.out.println(ans4);

        int ans5 = anyBaseSub(202,21,7);
        System.out.println(ans5);


    }

    public  static  int anyBaseSub(int num1, int num2, int base) {
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
        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            digit1 = digit1 - carry;
            if (digit1 < digit2) {
                digit1 = digit1 + base;
                carry = 1;
            }
            int subtraction = digit1 - digit2;
            ans += subtraction * power;
            power = power * 10;
            num1 = num1/ 10;
            num2 = num2 / 10;
        }
        return ans*sign;
    }
}
