package LevelOne.lectTen.linkedList;

public class _6_mergeSortLL2GetMid {
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
        ll.display();
        _1_ll.Node midNode = ll.getMid2();
        System.out.println("data at even "+midNode.data);

        System.out.println("making it odd");
        ll.addLast(9);
        ll.display();
        midNode = ll.getMid2();
        System.out.println("data at odd "+midNode.data);
    }
}
