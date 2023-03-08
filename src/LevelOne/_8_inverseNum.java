package LevelOne;

public class _8_inverseNum {
    public static void main(String[] args) {
        int A = 28346751;
        int digitCounts = 0, temp = A, ans = 0, index = 1;

        while (temp > 0) {
            digitCounts++;
            temp = temp / 10;
        }

        temp = A;
        index = 1;
        while (index <= digitCounts) {
            int toInd = (temp%10) - 1;
            int toDig = index;

            ans = ans + (toDig * (int)Math.pow(10, toInd));



            index++;
            temp = temp / 10;
        }
        System.out.println("ans: "+ans);




    }
}
