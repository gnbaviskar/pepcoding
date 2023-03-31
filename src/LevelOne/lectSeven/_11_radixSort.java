package LevelOne.lectSeven;

public class _11_radixSort {
    public static void main(String[] args) {
        int[] arr = new int[] {213, 97, 718, 123, 37, 443, 982, 64, 375, 683};
        raddixSort(arr);
        displaySort(arr);
    }

    public static void raddixSort(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxEle) maxEle = arr[i];
        }

        int exp = 1;
        while (maxEle / exp >= 1) {
            countSort(arr, exp);
            exp = exp * 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int minEle = Integer.MAX_VALUE, maxEle = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int ele = (arr[i] / exp) % 10;
            if (ele < minEle) minEle = ele;
            if (ele > maxEle) maxEle = ele;
        }

        int range = maxEle - minEle + 1;
        int[] freqArr = new int[range];

        for (int i = 0; i < n; i++) {
            int index = (arr[i] / exp) % 10 - minEle;
            freqArr[index]++;
        }

        // prefix
        for (int i = 1; i < freqArr.length; i++) {
            freqArr[i] = freqArr[i] + freqArr[i-1];
        }

        int[] ans = new int[arr.length];

        for (int i = n-1; i >= 0; i--) {
            int ele = arr[i];
            int digitVal = (ele / exp) % 10;
            int freqKey = digitVal - minEle;
            int freqVal = freqArr[freqKey];
            freqVal -= 1;
            ans[freqVal] = ele;
            freqArr[freqKey]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void displaySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }
}
