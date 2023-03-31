package LevelOne.lectSeven;

public class _7_quickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 1, 3, 2, 6, 8, 7, 9};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int pivot = arr[end];
        int pi = partition(arr, pivot, start,end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static int partition(int arr[], int pi, int start, int end) {
        int i = start, j = start;
        while (i <= end) {
            if (arr[i] <= pi) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
}
