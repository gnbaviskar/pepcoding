package LevelOne.lectThreeFunctionsArrays;

public class _4_anyBaseToAnyBase {
    public static void main(String[] args) {
        int num = 71;
        int base = 8;
        int decimalNum = anyBaseToDecimal(num, base);
        System.out.println("decimal num: "+decimalNum);
        int binaryNum = decimalToAnyBase(decimalNum, 2);
        System.out.println("binary num: "+binaryNum);
        int octalNum = decimalToAnyBase(decimalNum, 8);
        System.out.println("octal num: "+octalNum);

    }

    public static int anyBaseToDecimal(int num, int base) {
        int ans = 0;
        int power = 1;
        while (num > 0) {
            int remainder = num % 10;
            int val = remainder * power;
            ans = ans + val;
            power = power * base;
            num = num / 10;
        }

        return ans;
    }

    public static int decimalToAnyBase(int num, int base) {
        int ans = 0;
        int power = 1;
        while (num > 0) {
            int remainder = num % base;
            int val = remainder * power;
            ans = ans + val;
            power = power * 10;
            num = num / base;
        }
        return ans;
    }
}
