package LevelOne.lectTwoPatterns;

public class _19_patternNineteen1 {
    public static void main(String[] args) {
        int A = 7;

        int mid = (A/2) + 1;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j<=A; j++) {
                if (i==1 && j <= mid) {
                    System.out.print("*\t");
                } else if (j == 1 && i >= mid) {
                    System.out.print("*\t");
                } else if (j == A && i <= mid) {
                    System.out.print("*\t");
                } else if (i == A && j >= mid) {
                    System.out.print("*\t");
                }
                else {
                    if (j==mid || i==mid) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
