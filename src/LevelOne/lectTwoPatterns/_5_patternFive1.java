package LevelOne.lectTwoPatterns;

public class _5_patternFive1 {
    public static void main(String[] args) {
        int A = 7;

        int start = 1;
        int end = (A/2) + 1;
        int totStars = 1;
        for (int i = start; i <= end; i++) {
            int blanks = A - totStars;
            blanks = blanks / 2;
            int index = 0;
            while (index < blanks) {
                System.out.print("\t");
                index++;
            }
            index = 0;
            while (index < totStars) {
                System.out.print("*\t");
                index++;
            }
            index = 0;
            while (index < totStars) {
                System.out.print("\t");
                index++;
            }
            System.out.println("");


            totStars += 2;
        }

        while (totStars >= 1) {
            int blanks = A - totStars;
            blanks = blanks / 2;
            int index = 0;
            while (index < blanks) {
                System.out.print("\t");
                index++;
            }

            index = 0;
            while (index < totStars) {
                System.out.print("*\t");
                index++;
            }

            index = 0;
            while(index < blanks) {
                System.out.print("\t");
                index++;
            }

            totStars -= 2;
            System.out.println();
        }


        System.out.println("");

    }
}
