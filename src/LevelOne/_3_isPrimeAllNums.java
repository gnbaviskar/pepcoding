package LevelOne;
import java.util.Scanner;

public class _3_isPrimeAllNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start = scn.nextInt();
        int end = scn.nextInt();


        for (int i = start; i <= end; i++) {
            int j = 2;
            boolean isFound = false;
            while (j*j<=i) {
                if ((i%j) == 0) {
                    isFound = true;
                    break;
                }
                j++;
            }
            if (isFound) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }
        }
    }
}
