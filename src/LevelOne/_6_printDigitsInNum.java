package LevelOne;

public class _6_printDigitsInNum {

    // print all digits of num from left to right without using any array
    public static void main(String[] args) {
        int n = 100;
        int numCounts = 0;
        int temp = n;
        while (temp > 0) {
            numCounts++;
            temp = temp/ 10;
        }
        int t = numCounts - 1;
        boolean isEndZero = false;

        temp = n;

        // NOTE: it would fail if condn includes only temp > 0, as 100 can be zero with 100 % 100, but two zeroes to be printed, so need to check condition with t also
        while (t >= 0 || temp > 0) {
            int digit = temp / (int)Math.pow(10, t);
            System.out.println(digit);
            temp = temp % (int) Math.pow(10, t);
            t--;
        }
    }
}
