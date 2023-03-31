package LevelOne.lectSeven;

public class _9_countSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 3, 9};
        countSort(arr); displayArr(arr);
    }
    public static void countSort(int[] arr) {
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minEle) minEle = arr[i];
            if (arr[i] > maxEle) maxEle = arr[i];
        }
        int[] freqArr = new int[maxEle - minEle + 1];
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            ele = ele - minEle;
            freqArr[ele]++;
        }
        int k = 0;
        for (int i = 0; i < freqArr.length; i++) {
            int ele = i + minEle;
            int freqOfEle = freqArr[i];
            int j = 0;
            while (j < freqOfEle) {
                arr[k] = ele;
                j++;
                k++;
            }
        }
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
    }

}
