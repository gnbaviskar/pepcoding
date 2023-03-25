package LevelOne.lectFive.RecursionBacktracking;

import java.util.ArrayList;

public class _2_targetSumSubset {

    static  int[] arr = new int[]{10, 20, 30, 40, 50, 60, 10, 10, 10, 10 };
    static  int n = arr.length;
    static int targetSum = 50;
    public static void main(String[] args) {
        pTargetSum(0,0, "");
    }

    public static void pTargetSum(int currIndex, int sum, String ans) {

        if (currIndex == n) {
            if (sum == targetSum) {
                System.out.println(ans);
            }
            return;
        }

        pTargetSum(currIndex+1,sum+arr[currIndex], ans+arr[currIndex]+",");
        pTargetSum(currIndex+1, sum, ans);

    }
}
