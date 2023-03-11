package LevelOne.lectTwoPatterns;

public class _15_patternFifteen2 {
    public static void main(String[] args) {
        int A = 9;
        int blanks = A/2;
        int nums = 1;
        int numCounterI = 1;
        for (int i = 1; i <= A; i++) {

            // print blank spaces
            for (int j = 1; j <= blanks; j++) {
                System.out.print("\t");
            }

            int numCounterJ = numCounterI;
            // print nums
            for (int j = 1; j <= nums; j++) {



                System.out.print(numCounterJ+"\t");
                if (j <= numCounterJ/2) {
                    numCounterJ++;
                } else {
                    numCounterJ--;
                }

            }


            if (i <= A/2) {
                numCounterI = i+1;
                nums += 2;
                blanks--;
            } else {
                numCounterI = A - i ;
                nums -= 2;
                blanks++;
            }


            System.out.println();

        }
    }
}
