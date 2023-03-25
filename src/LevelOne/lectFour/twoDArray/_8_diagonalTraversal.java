package LevelOne.lectFour.twoDArray;

public class _8_diagonalTraversal {
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
        System.out.println("");
        System.out.println("");

        int j = 0;
        while (j <= (m-1)) {
            int tempI = 0; int tempJ = j;
            while (tempI <= (n-1) && tempJ <= (m-1)) {
                System.out.print(A[tempI][tempJ]+"\t");
                tempI++;
                tempJ++;
            }
            System.out.println("");
            j++;
        }
        System.out.println("");
    }
}
