package LevelOne.lectTen.linkedList;

import java.util.Stack;

public class _9_k_reverse {
    public static void main(String[] args) {
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        for (int i = 0 ; i < 10; i++) {
            ll.addLast(i);
        }

        ll = kthReverse(ll, 4);
        ll.display();
    }

    public static _1_ll.LinkedList kthReverse(_1_ll.LinkedList ll, int k) {
        Stack<Integer> st = new Stack<>();
        _1_ll.Node temp = ll.head;
        _1_ll.LinkedList res = new _1_ll.LinkedList();
        while (temp != null) {
            int c = 0;
            while (c < k) {
                if (temp == null) break;
                _1_ll.Node tempHead = temp;
                ll.removeFirst();
                st.push(tempHead.data);
                temp= temp.next;
                c++;
            }
            while (st.size() > 0) {
                res.addLast(st.pop());
            }
        }
        return res;
    }
}
