package LevelOne.lectTwoPatterns;

public class _7_printDiagonals1 {
    public static void main(String[] args) {
        int A = 7;
        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                if (i != j) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
