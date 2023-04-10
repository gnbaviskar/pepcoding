package LevelOne.lectTen.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class _15_addLL {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        int[] ll1Arr = new int[]{9,9,9,9,9,9,9};
        for (int i = 0; i < ll1Arr.length; i++) {
            ll1.addLast(ll1Arr[i]);
        }


        LinkedList ll2 = new LinkedList();
        int[] ll2Arr = new int[]{9,9,9,9};
        for (int i = 0; i < ll2Arr.length; i++) {
            ll2.addLast(ll2Arr[i]);
        }
        Object test =  ll1.getFirst();


    }

//    public static ListNode
}
