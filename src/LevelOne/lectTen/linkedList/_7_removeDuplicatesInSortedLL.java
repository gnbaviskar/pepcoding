package LevelOne.lectTen.linkedList;

public class _7_removeDuplicatesInSortedLL {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();

        for (int i = 0 ; i <= 10; i++) {
            if ((i%2) == 0) {
                ll.addLast(i);
                continue;
            }
            // IF ODD TWICE TO PREPARE DUPLICATES
            ll.addLast(i);
            ll.addLast(i);
            ll.addLast(i);
            ll.addLast(i);
            ll.addLast(i);
            ll.addLast(i);

        }
        ll.display();
        removeDuplicatesFromLL(ll);
        ll.display();
    }

    public static void removeDuplicatesFromLL(_1_ll.LinkedList ll) {
        if (ll.size == 0 || ll.size == 1) return;

        _1_ll.Node prev = ll.head;
        _1_ll.Node curr = ll.head.next;

        while (curr != null) {
//            System.out.println("prev: "+prev.data+"\tcurr: "+curr.data);
            if (prev.data == curr.data) {
                prev.next = curr.next;
                curr = curr.next;
                continue;
            }
            prev = prev.next;
            curr = curr.next;
        }
    }


}
