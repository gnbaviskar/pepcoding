package LevelOne.lectTen.linkedList;

import java.util.Stack;

public class _14_foldStack {
    static _1_ll.LinkedList ll = new _1_ll.LinkedList();
    static int size;
    static  int counter;

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            ll.addLast(i);
        }
        _1_ll.Node temp = ll.head;
        while (temp != null) {
            size+=1;
            temp = temp.next;
        }
        System.out.println("size: "+size);

        foldIt(ll.head);
    }

    public static _1_ll.Node foldIt(_1_ll.Node tempLeft) {
        Stack<Integer> st = new Stack<>();
        _1_ll.Node temp = tempLeft;
        while (temp != null) {
            int ele = temp.data;
            st.push(ele);
            temp = temp.next;
        }
        _1_ll.Node tempHead = new _1_ll.Node();
        tempHead.data = tempLeft.data;
        tempHead.next = tempLeft.next;
        _1_ll.Node returnNode = tempHead;
        int counter = 1;
        while (st.size() > 0) {
            _1_ll.Node tempNode = tempHead.next;
            _1_ll.Node tempRight = new _1_ll.Node();
            tempRight.data = st.pop();
            tempHead.next = tempRight;
            counter+=1;
            if (counter >= size) {
                tempRight.next = null;
                break;
            };
            tempRight.next = tempNode;
            counter+=1;
            if (counter >= size) {
                tempHead = tempNode;
                tempHead.next = null;
                break;
            }
            tempHead = tempNode;
        }
        return returnNode;
    }

}
