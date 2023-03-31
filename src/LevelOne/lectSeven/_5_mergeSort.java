package LevelOne.lectSeven;

public class _5_mergeSort {
    public static void main(String[] args) {
        int[] A = new int[] {7, 4, 1, 3, 6, 8, 2, 5};
        A = mergeSort(A, 0, A.length-1);
        displayArr(A);
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high)  return new int[] {arr[low]};
        int mid = (low + high) / 2;
        return mergeTwoSortedArrays(mergeSort(arr, low, mid), mergeSort(arr, mid+1, high));
    }
    public static int[] mergeTwoSortedArrays(int [] A, int [] B) {
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
        return C;
    }


    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
