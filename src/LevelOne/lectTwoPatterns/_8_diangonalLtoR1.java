package LevelOne.lectTwoPatterns;

public class _8_diangonalLtoR1 {
    public static void main(String[] args) {
        int A  = 7;
        for (int i = 0; i < A; i++) {
            int end = A - i - 1;
            for (int j = 0; j <= end; j++) {
                if (j != end) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
