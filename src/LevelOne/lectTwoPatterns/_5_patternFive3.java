package LevelOne.lectTwoPatterns;

public class _5_patternFive3 {
    public static void main(String[] args) {
        int A = 7;
        int blanks = 0;
        int stars = 1;
        int index = 1;
        boolean isMiddle = false;

        blanks = A / 2;

        while (index <= A) {
            for (int i = 0; i < blanks; i++) {
                System.out.print("\t");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*\t");
            }

            if (stars == A) {
                isMiddle = true;
            }

            if (!isMiddle) {
                stars += 2;
                blanks--;
            } else {
                blanks++;
                stars -= 2;
            }
            index++;
            System.out.println();
        }
    }
}
