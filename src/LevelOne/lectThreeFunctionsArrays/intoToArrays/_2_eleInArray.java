package LevelOne.lectThreeFunctionsArrays.intoToArrays;

import java.util.Scanner;

public class _2_eleInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfEle = scn.nextInt();

        int[] arr = new int[noOfEle];
        for (int i = 0; i < noOfEle; i++) {
            arr[i] = scn.nextInt();
        }
        int ele = scn.nextInt();
        int index = -1;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == ele) index = i;
        }

        System.out.println(index);
    }
}
