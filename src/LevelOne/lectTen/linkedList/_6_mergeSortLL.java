package LevelOne.lectTen.linkedList;

import java.util.LinkedList;

public class _6_mergeSortLL {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        ll.addLast(7);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(2);
        ll.addLast(5);
        ll = mergeSortLL(ll, 0, ll.getSize() - 1);
        ll.display();

        LinkedList<Integer> llTest = new LinkedList<>();
    }


    public static _1_ll.LinkedList mergeSortLL(_1_ll.LinkedList ll, int low, int high) {
        if (low == high) {
            // CREATE A TEMP LL
            _1_ll.LinkedList temp = new _1_ll.LinkedList();
            // CREATE A TEMP NODE TO BE ADDED DATA FROM
            _1_ll.Node tempNode = ll.getAt(low);
            // ADD THE DATA TO THE TEMP LL
            temp.addLast(tempNode.data);
            // RETURN LL, HAVE TO RETURN LL AS METHOD RETURN IS LL
            return temp;
        }
        // GET THE MID
        int mid = (low+high) / 2;
        // FIRST HALF
        _1_ll.LinkedList ll1 = mergeSortLL(ll, low, mid);
        // SECOND HALF
        _1_ll.LinkedList ll2 = mergeSortLL(ll, mid+1, high);
        // MERGE THEM TOGETHER
        return mergeSortedLL(ll1, ll2);
    }

    // MERGE TWO LL
    public static _1_ll.LinkedList mergeSortedLL(_1_ll.LinkedList l1, _1_ll.LinkedList l2) {
        // RESULT LL
        _1_ll.LinkedList l3 = new _1_ll.LinkedList();
        // TEMP POINTERS
        _1_ll.Node d1 = l1.head;
        _1_ll.Node d2 = l2.head;
        // KEEP GOING UNTIL ONE POINTER HITS NULL
        while (d1 != null && d2 != null) {
            if (d1.data < d2.data) {
                l3.addLast(d1.data);
                d1 = d1.next;
            } else {
                l3.addLast(d2.data);
                d2 = d2.next;
            }
        }

        // IN CASE SOMETHING REMAINING IN LL1
        while (d1 != null) {
            l3.addLast(d1.data);
            d1 = d1.next;
        }

        // IN CASE SOMETHING REMAINING IN LL2
        while (d2 != null) {
            l3.addLast(d2.data);
            d2 = d2.next;
        }
        // RETURN RESULT
        return l3;
    }
}
