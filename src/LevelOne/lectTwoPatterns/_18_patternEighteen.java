package LevelOne.lectTwoPatterns;

public class _18_patternEighteen {
    public static void main(String[] args) {
        int A = 7;
        int p1 = 1;
        int p2 = A;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (i == 1 || i == A) {
                    System.out.print("*\t");
                } else {
                    if ((j == p1) || (j == p2)) {
                        System.out.print("*\t");
                    } else {
                        if ((i > A/2) && (j>p2) && (j<p1)) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                }
            }
            p1++;
            p2--;
            System.out.println();
        }
    }
}
