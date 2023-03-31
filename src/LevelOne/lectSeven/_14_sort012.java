package LevelOne.lectSeven;

public class _14_sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 0, 1, 2, 2, 1, 0, 1, 2, 0, 2, 1};
        sort012(arr);
        displayArr(arr);
    }

    public static void sort012(int[] arr) {
        int i = 0, j = 0, n = arr.length;
        int k = n - 1;
        while (arr[k] == 2) { k--; };
        while (i < n && i < k) {
            if (arr[i] == 2) {
                swapArrEle(arr, i, k);
                while (arr[k] == 2) { k--; };
            }
            if (arr[i] == 0) {
                swapArrEle(arr, i , j);
                j++;
            }
            i++;
        }
    }

    public static void swapArrEle(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void displayArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }


}
