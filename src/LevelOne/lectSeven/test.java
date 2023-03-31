package LevelOne.lectSeven;

public class test {
    public static void main(String[] args) {
        int[] A = new int[]{2, 5, 12, 18, 20, 22, 25};
        int[] B = new int[]{7, 9, 11, 15, 25, 28, 30};
        int[] C = new int[] {2,354,46,5,7,7,878,3,3,2,2,546,23,34,5,67,7,7,4,21,3,45,56,7,7,89,56,56,4};

//        partitionArr(C, 45);
        partition(C, 45);
        displayArr(C);
        System.out.println();

        displayArr(mergedArr(A, B));
        System.out.println();
        displayArr(mergedSort(C, 0, C.length-1));
    }

    public static void partition(int[] arr, int pivot) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot)
            {
                i++;
            }
            else if (arr[i] <= pivot)
            {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void partitionArr(int [] arr, int pp) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= pp) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static int[] mergedSort(int [] arr, int low, int high) {
        if (low == high) return new int[]{arr[low]};
        return mergedArr(mergedSort(arr, low, (low+high)/2), mergedSort(arr, ((low+high)/2)+1, high));
    }

    public static int[] mergedArr (int[] A, int[] B) {
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
            k++;
            j++;
        }

        return C;
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
