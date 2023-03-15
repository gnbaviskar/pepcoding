package LevelOne.lectThreeFunctionsArrays.intoToArrays;

import java.util.Scanner;

public class _1_spanArray {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int noOfEle = scn.nextInt();

        int[] arr = new int[noOfEle];
        for (int i = 0; i < noOfEle; i++) {
            arr[i] = scn.nextInt();
            // System.out.println(arr[i]);
        }

        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < noOfEle; i++) {
            if (arr[i] < minEle) minEle = arr[i];
            if (arr[i] > maxEle) maxEle = arr[i];

        }

        System.out.print(maxEle-minEle);
    }
}
