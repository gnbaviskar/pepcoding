package LevelOne.lectSeven;

public class _4_mergeTwoSortedArr {
    public static void main(String[] args) {
        int[] A = new int[]{2, 5, 12, 18, 20, 22, 25};
        int[] B = new int[]{7, 9, 11, 15, 25, 28, 30, 33, 35, 55, 56};

        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }

        displayArr(C);

    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
