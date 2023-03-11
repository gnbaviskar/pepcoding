package LevelOne.lectTwoPatterns;

public class _11_patternEleven {
    public static void main(String[] args) {
        int A = 4;
        int c = 1;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print(c+"\t");
                    c++;
                }
            }
            System.out.println();
        }
    }
}
