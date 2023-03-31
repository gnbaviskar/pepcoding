package LevelOne.lectSeven;

public class _16_pivotInSortedAndRotatedArr {
    public static void main(String[] args) {
//        int [] arr = new int[]{10, 20, 30, 40 ,50};
//        int [] arr = new int[]{30, 40 ,50, 10, 20};
//        int [] arr = new int[]{20, 30, 40, 50, 10};
        int [] arr = new int[]{50, 10, 20, 30, 40};
        System.out.println(dynamicSearch(arr, 0, (arr.length - 1)));
    }

    public static int dynamicSearch(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        };
        int mid = (low + high) / 2;
        int eleAtMid = arr[mid];
        int eleAtHigh = arr[high];
        if (eleAtMid < eleAtHigh) {
            high = mid;
        }
        else if (eleAtMid > eleAtHigh) {
            low = mid + 1;
        }
        else {
            return arr[low];
        }
       return dynamicSearch(arr, low, high);
    }
}
