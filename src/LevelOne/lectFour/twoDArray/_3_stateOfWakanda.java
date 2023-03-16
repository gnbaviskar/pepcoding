package LevelOne.lectFour.twoDArray;

public class _3_stateOfWakanda {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int[][] A = new int[n][m];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = counter;
                counter++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        // solution
        boolean dir = false;
        int i = 0, j = 0;

        while (j <= (m-1)) {
            if (!dir) {
                while ( i <= (n-1)) {
                    System.out.print(A[i][j]+"\t");
                    i++;
                }
                i--;
                j++;
                dir = true;
            } else {
                while (i >= 0) {
                    System.out.print(A[i][j]+"\t");
                    i--;
                }
                i++;
                j++;
                dir = false;
            }
        }

    }
}
