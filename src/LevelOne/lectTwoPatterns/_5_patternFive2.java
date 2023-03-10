package LevelOne.lectTwoPatterns;

public class _5_patternFive2 {
    public static void main(String[] args) {
        int A = 5;
        int totStars = 1;
        int index = 1;
        boolean isMiddle = false;
        while (index <= A) {
            int blanks = A - totStars;
            blanks = blanks / 2;
            int i = 0;
            while (i <= blanks) {
                System.out.print("\t");
                i++;
            }
            i = 0;
            while (i < totStars) {
                System.out.print("*\t");
                i++;
            }

            if (totStars == A) {
                isMiddle = true;
            }

            if (!isMiddle) {
                totStars += 2;
            } else {
                totStars -= 2;
            }
            index++;
            System.out.println();
        }
    }
}
