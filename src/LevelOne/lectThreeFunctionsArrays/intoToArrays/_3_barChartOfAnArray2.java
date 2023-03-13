package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _3_barChartOfAnArray2 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 0, 7, 5};
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxEle) maxEle = A[i];
            if (A[i] < minEle) minEle = A[i];
        }
        int n = A.length;

        for (int i = 0; i < maxEle; i++) {
            for (int j = 0; j < n; j++) {
                int limit = maxEle - A[j];
                if (i >= limit) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
