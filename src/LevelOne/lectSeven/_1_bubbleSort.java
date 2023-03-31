package LevelOne.lectSeven;

public class _1_bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 9, 8, 2 ,1};
        bubbleSort(arr);
        displayArr(arr);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int p1 = 0, p2 = 1; p2 <= n - i - 1; p2++, p1++) {
                int ele1 = arr[p1];
                int ele2 = arr[p2];
                if (ele1 > ele2) {
                    swapArrEle(arr, p1, p2);
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
