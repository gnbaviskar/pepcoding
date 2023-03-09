package LevelOne.lectTwoPatterns;

public class _2_patternTwo1 {
    public static void main(String[] args) {
        int A = 10;
        for (int i = A; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
