package LevelOne.lectTwoPatterns;

public class _9_twoDoagnolaCross {
    public static void main(String[] args) {
        int A = 7;
        int start = 1;
        int end = A;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= A; j++) {
                if (j == start || j == end) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }


            }
            start++;
            end--;
            System.out.println();
        }
    }
}
