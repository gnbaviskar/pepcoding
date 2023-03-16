package LevelOne.lectFour.twoDArray;

public class _2_matMultiplication {
    public static void main(String[] args) {

        int[][] A = new int[2][3];
        int[][] B = new int[3][4];

        int aN = A.length;
        int aM = A[0].length;

        int bN = B.length;
        int bM = B[0].length;

        if (aM != bN) {
            System.out.println("col no of A must match with row no of B");
            return;
        }
        int counter = 1;
        for (int i = 0; i < aN; i++) {
            for (int j = 0; j < aM; j++) {
                A[i][j] = counter; counter++;
            }
        }
        counter = 1;
        for (int i = 0; i < bN; i++) {
            for (int j = 0; j < bM; j++) {
                B[i][j] = counter; counter++;
            }
        }

        int[][] ans = new int[aN][bM];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++){
                int val = 0;
                for (int k = 0; k < bN; k++) {
                    int temp = A[i][k] * B[k][j];
                    val = val + temp;
                }
                ans[i][j] = val;
            }
        }
        System.out.println("");
    }
}
