package LevelOne.lectSeven;

public class ds {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(ds(arr, 10, 0, arr.length - 1));
    }

    public static int ds(int []arr, int toSearch, int low, int high) {
        if (low > high) return -1;

        int mid = (low+high)/2;
        int ele = arr[mid];
        if (toSearch > ele) {
            low = mid + 1;
        } else if (toSearch < ele) {
            high = mid - 1;
        } else {
            return ele;
        }
        return ds(arr, toSearch, low, high);
    }
}
