package LevelOne.lectSeven;

public class _10_countSortStable {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        countSortStable(arr);
        displayArr(arr);
    }

    public static void countSortStable(int[] arr) {
        int minEle = Integer.MAX_VALUE, maxEle = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0 ; i < n; i++) {
            if (arr[i] < minEle) minEle = arr[i];
            if (arr[i] > maxEle) maxEle = arr[i];
        }
        int range = maxEle - minEle + 1;
        int[] freqArr = new int[range];
        // populate the freq array
        for (int i = 0; i < n; i++) {
            int index = arr[i] - minEle;
            freqArr[index]++;
        }
        // prefix array
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }
        int[] ans = new int[arr.length];
        for (int i = n-1; i >= 0; i--) {
            // get the element
            int ele = arr[i];
            // get the freq of the element
            int freqOfEle = freqArr[ele - minEle];
            // reduce it to populate in ans array (as its starts from 0)
            freqOfEle = freqOfEle - 1;
            // add it in ans
            ans[freqOfEle] = ele;
            // reduce its freq in the freq array for next appearance
            freqArr[ele - minEle]--;
        }
        // put ans to arr
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }
}
