package LevelOne.lectSeven;

public class _2_selectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 9, 8, 2 ,1};
        selectionSort(arr);
        displayArr(arr);
    }

    public static void selectionSort(int[] arr) {
        int minIndex = -1;
        int n = arr.length;
        for (int i = 0; i <  n-1; i++) {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            swapArrEle(arr, i, minIndex);
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
