package LevelOne.lectTwoPatterns;

public class _10_patternTen {
    public static void main(String[] args) {
        int A = 7;
        int mid = (A / 2) + 1;
        int start = mid, end = mid;

        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (j == start || j == end) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            if (i < mid) {
                start--;
                end++;
            } else {
                start++;
                end--;
            }
        }
    }
}
