package LevelOne.lectSeven;

public class _8_quickSelect {
    public static void main(String[] args) {
        int[] arr = new int[] {8, 3, 5, 7, 6, 1, 4, 2};
        System.out.println(quickSelect(arr, 1));
        System.out.println("");

    }

    public static int quickSelect(int[] arr, int k) {
        int n = arr.length;
        int pi = n-1;
        for (int i = 0; i < n; i++) {
            int pivot = arr[pi];
            pi = partition(arr, pivot);
            if (pivot == arr[k-1]) return arr[pi];

            if ((k-1) < pi) {
                pi--;
            } else {
                pi = n - 1;
            }
        }
        return -1;
    }
    public static int partition (int[] arr, int pi) {
        int n = arr.length;
        int i = 0, j = 0;
        while (i < n) {
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
