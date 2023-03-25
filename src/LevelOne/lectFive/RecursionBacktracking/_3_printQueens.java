package LevelOne.lectFive.RecursionBacktracking;

public class _3_printQueens {
    public static void main(String[] args) {
        int [][] chess = new int[4][4];
        printQueens(chess, 0, "");
    }

    public static void printQueens(int[][] chess, int row, String ans) {
        if (row == chess.length) {
            System.out.println(ans);
            return;
        }


        for (int column = 0; column < chess[0].length; column++) {
            if (checkIfQueenSafe(row, column, chess)) {
                chess[row][column] = 1;
                printQueens(chess, row+1, ans+row+"-"+column+",");
                chess[row][column] = 0;
            }
        }
    }

    public static boolean checkIfQueenSafe(int row, int col, int[][] chess) {
        for (int i = row - 1,  j = col; i >= 0; i--) {
            if (chess[i][j] == 1) return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j <= chess[0].length - 1; i--, j++) {
            if (chess[i][j] == 1) return false;
        }

        return true;
    }
}
