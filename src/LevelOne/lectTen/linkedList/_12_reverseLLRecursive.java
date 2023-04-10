package LevelOne.lectTen.linkedList;

public class _12_reverseLLRecursive {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        };
        _1_ll.LinkedList res = new _1_ll.LinkedList();
        reverseLL(ll.head, ll, res);
        res.display();
    }

    public static void reverseLL(_1_ll.Node temp, _1_ll.LinkedList ll, _1_ll.LinkedList res) {
        if (temp.next == null) return;

        reverseLL(temp.next, ll, res);
        _1_ll.Node removedNode = temp;
        ll.removeLast();
        res.addLast(removedNode.data);
    }
}
