package LevelOne.lectTen.linkedList;

public class _11_reverseLLrecursive {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }
        recursiveReverse(ll.head, ll.tail);
        ll.head.next = null;
        _1_ll.Node temp = ll.head;
        ll.head = ll.tail;
        ll.tail = temp;
        ll.display();
    }

    public static void recursiveReverse (_1_ll.Node node, _1_ll.Node tail) {
        if (node == null) return;

        recursiveReverse(node.next, tail);
        if (node == tail) {
            // do nothing
        } else {
            node.next.next = node;
        }
    }
}
