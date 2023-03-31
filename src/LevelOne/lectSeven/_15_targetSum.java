package LevelOne.lectSeven;


import java.util.Arrays;

public class _15_targetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 15, 3, 18, 6, 4, 19, 2, 12, 11, 9};
        targetSum(arr, 15);

    }

    public static void targetSum(int[] arr, int targetSum) {
        int n = arr.length, p1 = 0, p2 = n -1;
        Arrays.sort(arr);
        while (p1 < p2) {
            int curSum = arr[p1] + arr[p2];
            if (curSum > targetSum) {
                p2--;
            } else if (curSum < targetSum) {
                p1++;
            } else {
                System.out.print("Pair: "+arr[p1]+" "+arr[p2]+"\t");
                p1++;
                p2--;
            }
        }
    }
}
