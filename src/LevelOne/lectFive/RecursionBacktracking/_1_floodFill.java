package LevelOne.lectFive.RecursionBacktracking;

public class _1_floodFill {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                {0, 1, 0,0,0,0,0},
                {0, 1, 0, 1,1,1,0},
                {0,0,0,0,0,0,0},
                {1, 0, 1, 1, 0, 1, 1},
                {1, 0, 1, 1, 0, 1, 1},
                {1,0,0,0,0,0,0}
        };

        boolean [][] visited = new boolean[mat.length][mat[0].length];
        floodFill(0, 0, "", mat, visited);
    }

    public static void floodFill( int row, int column, String ans, int[][] mat,  boolean[][] visited) {
        int n = mat.length;
        int m = mat[0].length;

        if (row < 0 || column < 0 || row >= n || column >= m || mat[row][column] == 1 || visited[row][column] == true) {
            return;
        }

        if (row == n-1 && column == m-1) {
            System.out.println(ans);
            return;
        }
        visited[row][column] = true;
        floodFill(row - 1, column, ans+"t", mat, visited);
        floodFill(row, column-1, ans+"l", mat, visited);
        floodFill(row+1, column, ans+"d", mat, visited);
        floodFill(row , column+1, ans+"r", mat, visited);
        visited[row][column] = false;
    }
}
