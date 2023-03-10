package LevelOne.lectTwoPatterns;

public class _3_patternThree1 {
    public static void main(String[] args) {
        int A = 10;

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (j <= (A-i)) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println("");
        }
    }
}
