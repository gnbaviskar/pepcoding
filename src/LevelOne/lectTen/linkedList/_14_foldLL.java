package LevelOne.lectTen.linkedList;

import java.util.Stack;

public class _14_foldLL {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        // PREPARE DATA FOR PALINDROME
        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }
        ll.addLast(99);
        ll.display();
        ll = foldLL(ll);
        ll.display();
    }

    public static _1_ll.LinkedList foldLL(_1_ll.LinkedList ll) {
        _1_ll.LinkedList res = new _1_ll.LinkedList();
        // if source LL is having something
        while (ll.getSize() > 0) {
            int start = ll.head.data;
            // REMOVE THE DATA FROM SOURCE
            ll.removeFirst();
//            System.out.print("first: "+start+"\t");
            // ADD TO RES
            res.addLast(start);
            // LL SIZE MAY BE IN THE MIDDLE, TO AVOID NULL CHECK AND BREAK
            if (ll.getSize() == 0) break;
            int end = ll.tail.data;
            ll.removeLast();
//            System.out.print("last: "+end);
            res.addLast(end);
//            System.out.println();
        }
        return res;
    }
}
