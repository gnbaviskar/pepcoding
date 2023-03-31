package LevelOne.lectSeven;

public class _6_partitioningArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 7, 9, 4, 8, 3, 6, 2, 1};
        partitionArray(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t "+arr[i]);
        }
    }

    public static int[] partitionArray(int [] arr, int pivotPoint) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= pivotPoint) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

}
