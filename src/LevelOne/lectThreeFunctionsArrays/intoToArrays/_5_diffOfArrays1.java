package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _5_diffOfArrays1 {
    public static void main(String[] args) {
        int[] a1 = new int[]{3,1,0,7,5};
        int[] a2 = new int[]{1,1,1,1,1,1};
        int i1 = a1.length - 1;
        int i2 = a2.length - 1;
        int borrow = 0;
        int ans = 0;
        int power = 1;
        while (i2 > 0) {
            int d2 = a2[i2];
            int d1 = 0;
            if (i1 >= 0) {
                d1 = a1[i1];
            }

            d2 = d2 - borrow;
            if (d2 < d1) {
                d2 = d2 + 10;  // mostly making mistakes here
                borrow = 1;
            } else {
                borrow = 0;
            }

            int sub = d2 - d1;
            ans += sub * power;
            power = power * 10;
            i1--;
            i2--;

        }
        System.out.println(ans);
    }
}
