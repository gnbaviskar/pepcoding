package LevelOne.lectTen.linkedList;

public class _8_oddEvenLL {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        ll.addLast(2);
        ll.addLast(9);
        ll.addLast(7);
        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(12);
        ll.addLast(3);
//        ll = getOddEven(ll);
//        ll.display();
//        System.out.println("head:"+ll.head.data);
//        System.out.println("tail:"+ll.tail.data);
        ll = getOddEvenOneLoop(ll);
        ll.display();
        System.out.println("head:"+ll.head.data);
        System.out.println("tail:"+ll.tail.data);
    }

    public static _1_ll.LinkedList getOddEven(_1_ll.LinkedList ll) {
        _1_ll.Node temp = ll.head;
        _1_ll.LinkedList res = new _1_ll.LinkedList();
        while (temp != null) {
            if (temp.data % 2 == 1) {
                res.addLast(temp.data);
            }
            temp = temp.next;
        }

        temp = ll.head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                res.addLast(temp.data);
            }
            temp = temp.next;
        }
        return res;
    }

    public static _1_ll.LinkedList getOddEvenOneLoop(_1_ll.LinkedList ll) {
        _1_ll.Node temp = ll.head;
        _1_ll.LinkedList odd = new _1_ll.LinkedList();
        _1_ll.LinkedList even = new _1_ll.LinkedList();
        while (temp != null) {
            if (temp.data % 2 == 1) {
                odd.addLast(temp.data);

            }else {
                even.addLast(temp.data);
            }
            temp = temp.next;
        }
        odd.tail.next = even.head;
        ll.head = odd.head;
        ll.tail = even.tail;
        return ll;
    }
}
