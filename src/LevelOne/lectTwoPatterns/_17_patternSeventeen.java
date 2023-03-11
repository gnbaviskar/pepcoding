package LevelOne.lectTwoPatterns;

public class _17_patternSeventeen {
    public static void main(String[] args) {
        int A = 11;
        int spaces = A/2;
        int stars = 1;
        for (int i = 1; i <= A; i++) {

            //print spaces
            for (int j = 1; j <= spaces; j++) {
                if (i == ((A/2)+1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }

            // print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }


            stars = (i <= A/2) ? stars + 1 : stars - 1;
            System.out.println();
        }
    }
}
