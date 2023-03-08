package LevelOne;

public class _7_reverseIntWoBitM2 {
    public static void main(String[] args) {
        int A = 65784383;
        int temp = A;
        int t = 0;

        while (temp > 0) {
            t++;
            temp = temp / 10;
        };
        t--;
        temp = A;
        int ans = 0;

        while (temp > 0 || t >= 0) {
            int lastDigit = temp % 10;
            ans = ans + (lastDigit * (int)(Math.pow(10, t)));



            t--;
            temp = temp / 10;
        }

        System.out.println(ans);

    }
}
