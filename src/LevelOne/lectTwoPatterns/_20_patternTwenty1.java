package LevelOne.lectTwoPatterns;

public class _20_patternTwenty1 {
    public static void main(String[] args) {
        int A = 5;
        int p1 = 1, p2 = A;
        int mid = (A/2) + 1;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (j==1 || j==A) {
                    System.out.print("*\t");
                } else if (i>=mid && ((j == p1) || (j == p2))) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            p1++;
            p2--;
            System.out.println();
        }
    }
}
