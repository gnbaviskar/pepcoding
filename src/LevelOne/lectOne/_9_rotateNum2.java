package LevelOne.lectOne;

public class _9_rotateNum2 {
    public static void main(String[] args) {
        int A = 12340056;
        int K = -3;

        int digitCounts = 0;
        int temp = A;
        while (temp > 0) {
            digitCounts++;
            temp = temp / 10;
        }

        int ans = 0;
        // move from right to left
        if (K >= 0) {
            K = K % digitCounts;

            int leftNum = A % (int) Math.pow(10, K);
            ans = ans + (leftNum * (int) Math.pow(10, digitCounts - K));
            int right = A / (int) Math.pow(10, K);
            ans += right;
            System.out.println("ans: "+ans);
        } else {
            // move from left to right

            // make K positive
            K = K * (-1);
            K = K % digitCounts;
            if (K == 0) {
                System.out.println(A);
            } else {
                int leftNum = A % (int) Math.pow(10, (digitCounts - K));
                leftNum = leftNum * (int) Math.pow(10, K);
                ans += leftNum;
                int rightNum = A / (int) Math.pow(10, digitCounts - K);
                ans += rightNum;
                System.out.println("ans: "+ans);
            }


        }

    }
}
