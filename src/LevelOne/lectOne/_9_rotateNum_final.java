package LevelOne.lectOne;

public class _9_rotateNum_final {
    public static void main(String[] args) {
        int A = 12340056;
        int K = -2;
        int ans = 0;

        int digitCounts = 0;
        int temp = A;
        while (temp > 0) {
            digitCounts++;
            temp = temp / 10;
        }

        if (K < 0) {
            K = K * (-1);
            K = K % digitCounts;
            K = digitCounts - K;
        } else if (K == 0) {
            System.out.println(A);
//            return;
        } else {
            K = K % digitCounts;
        }

        int divisor = (int) Math.pow(10, K);

        int rightNum = A % divisor;
        int leftNum = A / divisor;
        rightNum = rightNum * (int) Math.pow(10, digitCounts - K);
        ans += rightNum;
        ans += leftNum;
        System.out.println(ans);

    }
}
