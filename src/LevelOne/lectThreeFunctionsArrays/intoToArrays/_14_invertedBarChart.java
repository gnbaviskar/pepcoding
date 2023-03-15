package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _14_invertedBarChart {
    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 0, 7, 5};
        int n = A.length;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0 ; i < n; i++) {
            if (A[i] > maxEle) maxEle = A[i];
        }

        for (int i = 0; i < maxEle; i++) {
            for (int j = 0; j <= (n-1); j++) {
                if (i < A[j]) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
