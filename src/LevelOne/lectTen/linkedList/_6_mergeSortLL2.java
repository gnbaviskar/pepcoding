package LevelOne.lectTen.linkedList;

public class _6_mergeSortLL2 {
    public static void main(String[] args) {
        _1_ll.LinkedList ll  = new _1_ll.LinkedList();
        ll.addLast(7);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(2);
        ll.addLast(5);
        ll = mergeSort(ll.head, ll.tail);
        ll.display();

    }

    public static _1_ll.LinkedList mergeSort(_1_ll.Node head, _1_ll.Node tail) {
        if (head == tail) {
            _1_ll.LinkedList llTemp = new _1_ll.LinkedList();
            llTemp.addLast(head.data);
            return llTemp;
        }


        _1_ll.Node mid = getMid(head, tail);
        _1_ll.LinkedList ll1 = mergeSort(head, mid);
        _1_ll.LinkedList ll2 = mergeSort(mid.next, tail);
        _1_ll.LinkedList res = _6_mergeSortLL.mergeSortedLL(ll1, ll2);
        return res;
    }

    public static _1_ll.Node getMid(_1_ll.Node head, _1_ll.Node tail) {
        _1_ll.Node fast = head;
        _1_ll.Node slow = head;

        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


}
