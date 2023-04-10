package LevelOne.lectTen.linkedList;

public class _14_foldLLRecursive {
    static _1_ll.LinkedList ll = new _1_ll.LinkedList();
    static _1_ll.Node left;
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ll.addLast(i);
        }
        left = ll.head;
    }

    public static void foldIt(_1_ll.Node right) {
        if (right == null) return;

        foldIt(right.next);

    }
}
