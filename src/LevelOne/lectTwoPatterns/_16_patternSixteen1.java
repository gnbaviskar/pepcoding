package LevelOne.lectTwoPatterns;

public class _16_patternSixteen1 {
    public static void main(String[] args) {
        int A = 7;
        int stars = 1;
        int rows = A/2+1;

        // gimmick to solve issue when no of rows provided instead of no of column
//        A = 4;
//        A = (A*2) - 1;
//        rows = A/2+1;
        for (int i = 1; i <= rows; i++) {
            int spaces = A - (stars * 2);
            int inCounter = 1;


            // printing first half of stars
            for (int j = 1; j <= stars; j++) {

                System.out.print(inCounter+"\t");
                inCounter++;
            }

            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            // last line printing handling
            if (stars > (A/2)) {
                stars--;
                inCounter--;
            }

            // printing second half of stars
            for (int j = 1; j <= stars; j++) {
                inCounter--;
                System.out.print(inCounter+"\t");
            }


            stars += 1;
            System.out.println();
        }
    }
}
