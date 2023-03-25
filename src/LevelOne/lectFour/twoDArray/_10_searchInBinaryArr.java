package LevelOne.lectFour.twoDArray;

public class _10_searchInBinaryArr {
    public static void main(String[] args) {
        int[][] A = new int[40][10];
        int counter = 1;
        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = counter; counter++;
            }
        }

        // code:
        int data = 21;
        int j = m - 1;
        int i = 0;
        int tempI = 0;
        while (i <= (n-1)) {
            if (A[i][j] == data) {
                // found
                System.out.println("found: at i: "+i+" j: "+j);
                return;
            } else if (A[i][j] < data) {
                // go deeper in rows
                i++;
            } else {
                // value is bigger than the data
                while (tempI <= (m-1)) {
                    if (A[i][tempI] == data) {
                        // found
                        System.out.println("found: at i: "+i+" j: "+tempI);
                        return;
                    }
                    tempI++;
                }
                System.out.println("not found");
                return;
            }
        }

        System.out.println("not found");


        System.out.println(A);
    }
}
