package LevelOne.lectOne;

public class _7_reverseIntWoBitM {
    // DID NOT WORK, WRONG SOLUTION. THIS IDEA WORK WITH STRING REVERSE ONLY
    public static void main(String[] args) {
        int A = 9743;

        int digitCounts = 0;
        int temp = A;
        while (temp > 0) {
            digitCounts++;
            temp = temp / 10;
        }

        int start = digitCounts - 1;
        int end = 0;
        long ans = 0;
        int temp2 = A;
        while (start > end) {
            int startDigit = A / (int) Math.pow(10, start);
            temp2 = temp2 % 10;
             ans = ans + ((int)Math.pow(10, start) * temp2) ;
             ans = ans + ((int) Math.pow(10, end) * startDigit);

             start--;
             end++;

        }
        System.out.println(ans);
    }
}
