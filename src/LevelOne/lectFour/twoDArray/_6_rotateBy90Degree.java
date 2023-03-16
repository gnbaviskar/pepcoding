package LevelOne.lectFour.twoDArray;

public class _6_rotateBy90Degree {
    public static void main(String[] args) {
        int[][] A = new int[][] {
                {11, 12, 13},
                {21, 22, 23,},
                {31, 32, 33}
        };

        int[][] B = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            int l = A.length - 1 - i;
            for (int j = 0; j < A.length; j++) {
                B[j][l] = A[i][j];
            }
        }
        System.out.println("");

    }
}
