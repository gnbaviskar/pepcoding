package LevelOne.lectTwoPatterns;

public class _12_patternTwelve {
    public static void main(String[] args) {
        int A = 7;
        int l1 = 0;
        int l2 = 1;

        for (int i = 0; i < A; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(l1+"\t");
                int temp = l2 + l1;
                l1 = l2;
                l2 = temp;
            }
            System.out.println();
        }
    }
}
