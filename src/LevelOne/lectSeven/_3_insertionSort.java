package LevelOne.lectSeven;

public class _3_insertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 9, 8, 2 ,1};
        insertionSort(arr);
        displayArr(arr);
    }
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1, tempI = i; j >= 1 && tempI >= 0; j--, tempI--) {
                if (arr[j] < arr[tempI]) {
                    swapArrEle(arr, tempI, j);
                }
            }
        }
    }

    public static void displayArr(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("\t"+arr[i]);
        }
    }


    public static void swapArrEle(int [] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
