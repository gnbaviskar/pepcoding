package LevelOne.lectFour.twoDArray;

public class _5_exitPointOfMat {

    public  static  void  printEle (int i, int j, int[][] A) {
        System.out.print(A[i][j]+"\t");
        System.out.print("i: "+i+" j:"+j);
    }
    public static void main(String[] args) {
//        int n = 4;
//        int m = 4;

        int[][] A = new int[][]{
            {0,0,1,0},
            {1,0,0,1},
            {0,0,0,0},
            {1,0,1,0}
        };
        int n = A.length;
        int m = A[0].length;
        int dir = 1;
        int i = 0, j = 0;
        while (i <= (n-1) && j <= (m-1) && i >= 0 && j >= 0) {
            if (dir == 1) {
                while (j <= (m-1)) {
                    printEle(i,j,A);
                    if (A[i][j] == 1) {
                        break;
                    }
                    j++;
                }
                i++;
                dir = 2;
            } else  if (dir == 2) {
                while (i <= (n-1)) {
                    printEle(i, j, A);
                    if (A[i][j] == 1) break;
                    i++;
                }
                j--;
                dir = 3;
            }
            else if (dir == 3) {
                while (j >= 0) {
                    printEle(i, j, A);
                    if (A[i][j] == 1) break;
                    j--;
                }
                i--;
                dir = 4;
            } else if (dir == 4) {
                while (i >= 0) {
                    printEle(i, j, A);
                    if (A[i][j] == 1) break;
                    i--;
                }
                j++;
                dir = 1;
            }
        }

    }
}
