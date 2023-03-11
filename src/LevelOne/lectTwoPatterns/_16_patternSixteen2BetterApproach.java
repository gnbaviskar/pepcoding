package LevelOne.lectTwoPatterns;

public class _16_patternSixteen2BetterApproach {
    public static void main(String[] args) {
        int A = 4;
        int row = A;
        int col = (row * 2) - 1;
        int p1 = 1, p2 = col;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j<=p1 || j >= p2) {
                    if (j<=((col/2)+1)) {
                        System.out.print(j+"\t");
                    } else {
                        System.out.print(col-j+1+"\t");
                    }
                } else {
                    System.out.print("\t");
                }
            }
            p1++;
            p2--;
            System.out.println();
        }
    }
}
