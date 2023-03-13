package LevelOne.lectThreeFunctionsArrays.intoToArrays;

public class _3_barChartOfAnArray {
    // good question: failed to submit: something is going wrong
    public static void main(String[] args) {
        int[] A = new int[] {3, 1, 0, 7, 5};
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxEle) maxEle = A[i];
            if (A[i] < minEle) minEle = A[i];
        }

        for(int i = 0; i < maxEle; i++) {
            for (int j = 0; j < A.length; j++) {
                int limit = A.length - A[j];
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
