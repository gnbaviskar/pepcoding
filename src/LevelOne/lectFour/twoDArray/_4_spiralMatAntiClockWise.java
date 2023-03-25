package LevelOne.lectFour.twoDArray;

public class _4_spiralMatAntiClockWise {
    public static void main(String[] args) {
        int n = 6;
        int[][] A = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = counter;
                counter++;
            }
        }

        System.out.println("");
        int m = A[0].length;
        int top = 0, bottom = n-1, left = 0, right = m-1;

        while(top < bottom && left < right) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(A[i][left]+"\t");
            }
            left++;

            for (int i = left; i <= right; i++) {
                System.out.print(A[bottom][i]+"\t");
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                System.out.print(A[i][right]+"\t");
            }
            right--;

            for (int i = right; i >= left; i--) {
                System.out.print(A[top][i]+"\t");
            }
            top++;
            System.out.println("");
        }

    }
}
