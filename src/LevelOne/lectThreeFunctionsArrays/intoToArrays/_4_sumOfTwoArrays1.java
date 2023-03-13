package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _4_sumOfTwoArrays1 {
    public static void main(String[] args) {

        int[] a1 = new int[]{ 3, 1, 0, 7, 5 };

        int[] a2 = new int[]{ 1, 1, 1, 1, 1, 1 };

        int ind1 = a1.length - 1;
        int ind2 = a2.length - 1;
        int power = 1;
        int ans = 0;
        int carry = 0;
        int base = 10;
        while (ind1 >= 0 || ind2 >= 0) {
            int digit1 = 0;
            int digit2 = 0;
            if (ind1 >= 0) {
                digit1 = a1[ind1];
            }
            if (ind2 >= 0) {
                digit2 = a2[ind2];
            }

            int add = digit1 + digit2 + carry;
            carry = add / base;
            add = add % base;
            int val = add * power;
            ans += val;
            power = power * 10;
            ind1--;
            ind2--;
        }
        System.out.println(ans);
    }
}
