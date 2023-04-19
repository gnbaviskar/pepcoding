package LevelOne.lectTen.linkedList;

public class _10_recursivePrint {
    public static void main(String[] args) {
//        printR(0);
        _1_ll.LinkedList ll = new _1_ll.LinkedList();
        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }
        printLL(ll.head);
    }

    public static void printR(int x) {
        if (x >= 10) return;
        printR(x+1);
        System.out.println(x);
    }

    public static void printLL(_1_ll.Node temp) {
        if (temp == null) return;
        printLL(temp.next);
        System.out.print(temp.data+"\t");
    }

}
