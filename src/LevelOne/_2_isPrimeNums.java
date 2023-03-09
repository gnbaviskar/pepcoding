package LevelOne;

import java.util.Scanner;
public class _2_isPrimeNums {
    // Be careful with division by zero, fails when div by 0, other cases passed
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int totNums = scn.nextInt();

        for (int i = 0; i < totNums; i++) {
            int A = scn.nextInt();
            boolean isFound = false;
            for (int j = 2; j * j <= A; j++) {
                if ((A%j) == 0) {
                    isFound = true;
                     break;
                }
            }
            if (isFound) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }

        }
    }
}
