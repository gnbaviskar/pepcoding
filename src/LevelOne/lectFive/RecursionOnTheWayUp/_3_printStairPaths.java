package LevelOne.lectFive.RecursionOnTheWayUp;

public class _3_printStairPaths {
    public static void main(String[] args) {
        printStairPaths(3, "");
    }

    public static void printStairPaths(int num, String ans) {
        if (num == 0) {
            System.out.print(ans+"\t");
            return;
        }
        if ((num - 1) >= 0) {
            printStairPaths(num - 1, ans + '1');
        }
        if ((num - 2) >= 0) {
            printStairPaths(num - 2, ans + '2');
        }
        if ((num - 3) >= 0) {
            printStairPaths(num - 3, ans + '3');
        }
    }
}
