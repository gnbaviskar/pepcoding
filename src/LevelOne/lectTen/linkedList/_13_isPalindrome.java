package LevelOne.lectTen.linkedList;

import java.util.Stack;

public class _13_isPalindrome {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        // PREPARE DATA FOR PALINDROME
        for (int i = 0; i < 5; i++) {
            ll.addLast(i);
        }
//        ll.addLast(0);
        ll.addLast(343);
        ll.addLast(3433);
        for (int i = 4; i >= 0; i--) {
            ll.addLast(i);
        }
        System.out.println("size: \t"+ll.size);
        ll.display();
        boolean check = checkIfPalindrome(ll);
        System.out.println(check);
    }

    public static boolean checkIfPalindrome(_1_ll.LinkedList ll) {

        Stack<Integer> st = new Stack();
        int size = ll.size;
        // GET THE MID
        int mid = (0+(size - 1)) / 2;
        int counter = 0;
        _1_ll.Node temp = ll.head;
        //
        while (counter <= mid) {
            // IF ODD SIZE OF LL
            if ((size%2) == 1) {
                // IGNORE THE MID ELE, IF ODD SIZE
                // DO NOT ADD TO STACK
                // JUST INCREMENT THE COUNTER AND TEMP
                if (counter == mid) {
                    counter+=1;
                    temp = temp.next;

                    ll.removeFirst();
                    continue;
                }
            }
//            System.out.print("ele: "+temp.data+"\t");
            // ADD TO STACK
            st.push(temp.data);
            // MOVE TEMP
            temp = temp.next;
            // INCR COUNTER
            counter += 1;
            // REMOVE THE ELE FROM LL
            ll.removeFirst();
        }


        // HALF ELE AT THE STACK
        while (st.size() > 0) {
            if (temp == null) return false;
            // ELE FROM STACK
            int ele = st.pop();
            // DATA FROM REMAING LL
            int data = temp.data;
            // SHOULD MATCH IF PALINDROME
            if (ele != data) return false;
            temp = temp.next;
            ll.removeFirst();
        }



        return true;
    }
}
