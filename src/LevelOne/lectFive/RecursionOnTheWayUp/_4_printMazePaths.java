package LevelOne.lectFive.RecursionOnTheWayUp;

public class _4_printMazePaths {
    public static void main(String[] args) {
        printMaze(1, 1, 3, 3, "");
    }

    public static void printMaze(int Sr, int Sc, int Dr, int Dc, String ans) {
        if (Sr == Dr && Dc == Sc) {
            System.out.print(ans+"\t");
            return;
        }

        if (Sr < Dr ) {
            printMaze(Sr+1, Sc, Dr, Dc, ans + 'v');
        }
        if (Sc < Dc){
            printMaze(Sr, Sc+ 1, Dr, Dc, ans + 'h');
        }
    }
}
