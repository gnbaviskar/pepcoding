package LevelOne.lectTwoPatterns;

public class _4_patternFour1 {
    public static void main(String[] args) {
        int A = 10;
        for (int i = 0; i < A; i++) {
            for (int j = 1; j <= A; j++) {
                if (j > i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }
}
