package LevelOne.lectTwoPatterns;

public class _15_patternFifteen {
    public static void main(String[] args) {
        int A = 5;
        int numCouns = 1;
        int blanks = A/2;
        int counter = 1;
        for (int i = 1; i <= A; i++) {



            // print blanks
            for (int j = 1; j <= blanks; j++) {
                System.out.print("\t");
            }

            // print numCounts
            for (int j = 1; j <= numCouns; j++) {

                System.out.print(counter+"\t");
                if (j <= ((numCouns/2))) {
                    counter++;
                } else {
                    counter--;
                }
            }


            if (i <= (A/2)) {
                numCouns+= 2;
                blanks--;
                counter++;
            } else {
                numCouns -= 2;
                blanks++;
                counter--;
            }


            System.out.println();
        }
    }
}
