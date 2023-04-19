package LevelOne.lectTen.linkedList;

public class _4_llMergeSortedLL {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            // if first node given
            if (size == 0) {
                head = tail = temp;
            } else {
                // other than first node
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void removeFirst() {
            if (size == 0) {
                return;
            } else if (size == 1) {
                head = tail = null;
                size--;
                return;
            }
            head = head.next;
            size--;
        }

        void display() {
            if (size == 0) {
                return;
            }
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }

        int getSize() {
            return size;
        }

        int getFirst() {
            if (size == 0) {
                return -1;
            }
            return head.data;
        }

        int getLast() {
            if (size == 0) {
                return -1;
            }
            return tail.data;
        }

        Node getAt(int index) {
            if (size == 0) return null;
            int counter = 0;
            Node temp = head;
            while(counter < index) {
                if (temp == null) {
                    return null;
                }
                temp = temp.next;
                counter++;
            }
            if (temp == null) {
                return null;
            }

            return temp;
        }

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            size++;
        }

        void addAt(int index, int val) {
            Node tempAt = getAt(index);
            if (tempAt == null) {
                return;
            }
            Node temp = new Node();
            temp.data = val;
            temp.next = tempAt.next;
            tempAt.next = temp;
            size++;
        }

        void removeLast() {
            if (size == 0) {
                return;
            } else if (size == 1) {
                head = tail = null;
                size--;
                return;
            }
            // index starts with 0, n-1 is last, n-2 is second last
            int secondLastIndex = size - 2;
            Node secondLast = getAt(secondLastIndex);
            if (secondLast == null) return;

            secondLast.next = null;
            tail = secondLast;
            size--;
        }



        Node getKthLast(int idx) {
            idx = size - idx;
            if (idx >= 0 && idx < size) {
                return getAt(idx);
            }
            return null;
        }

        Node getMid(){
            if (size == 0) return null;

            if ((size%2) == 0) {
                return getAt((size/2) - 1);
            }
            return getAt((size/2));
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        for (int i = 10; i <= 50; i+=10) {
            l1.addLast(i);
        }
        LinkedList l2 = new LinkedList();
        l2.addLast(7);
        l2.addLast(9);
        l2.addLast(12);
        l2.addLast(35);
        l2.addLast(45);
        l2.addLast(60);

        LinkedList l3 = new LinkedList();
        Node d1 = l1.head;
        Node d2 = l2.head;
        while (d1 != null && d2 != null) {
            if (d1.data < d2.data) {
                l3.addLast(d1.data);
                d1 = d1.next;
            } else {
                l3.addLast(d2.data);
                d2 = d2.next;
            }
        }

        while (d1 != null) {
            l3.addLast(d1.data);
            d1 = d1.next;
        }

        while (d2 != null) {
            l3.addLast(d2.data);
            d2 = d2.next;
        }
        l3.display();
    }
}
