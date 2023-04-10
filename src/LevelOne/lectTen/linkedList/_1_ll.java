package LevelOne.lectTen.linkedList;

public class _1_ll {
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

        void reverseList() {
            int start = 0;
            int last = size - 1;

            while (start < last) {
                Node eleAtStart = getAt(start);
                Node eleAtLast = getAt(last);
//                System.out.println("start: "+eleAtStart.data+" last: "+eleAtLast.data);
                int temp = eleAtStart.data;
                eleAtStart.data = eleAtLast.data;
                eleAtLast.data = temp;
                start++;
                last--;
            }
        }

        void reverseListPointerWay() {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
            }
            Node temp = head;
            head = tail;
            tail = temp;
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
            int mid = (0+(size-1))/2;
            return getAt(mid);
        }

        Node getMid2() {
            Node fast = head;
            Node slow = head;
            while (fast != tail && fast.next != tail) {
                System.out.println("slow: "+slow.data+" \t fast: "+fast.data);
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        Node removeNode(int index) {
            if (size == 0)return null;
            if (index > size || index < 0) return null;
            if (index == 0) {
                Node temp = head;
                removeFirst();
                return  temp;
            } else if (index == (size-1)) {
                Node temp = tail;
                removeLast();
                return temp;
            }

            Node prev = getAt(index - 1);
            Node curr = getAt(index);
            prev.next = curr.next;
            size--;
            return curr;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
        System.out.println(ll.getSize());
        ll.removeFirst();
        ll.removeFirst();
        ll.display();
        ll.removeFirst();
        ll.display();

        for (int i = 1; i < 11; i++) {
            ll.addLast(i);
        }

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        try {
            System.out.println("ele at: "+ll.getAt(8).data);
            System.out.println("ele at: "+ll.getAt(14).data);

        } catch (NullPointerException e) {
            System.out.println("null pointer exception, as null value received: "+e.getMessage());
        }


        System.out.println("size: "+ll.getSize());
        ll.addFirst(100);
        ll.display();

        ll.addAt(2, 22);
        ll.display();
        ll.addAt(0, 23);
        ll.display();

        ll.removeLast();
        ll.display();
        System.out.println("size: "+ll.getSize());

        System.out.println("head: "+ll.getFirst()+"\t last: "+ll.getLast());

        ll.reverseList();
        System.out.println("reversed using data changes");
        System.out.println("head: "+ll.getFirst()+"\t last: "+ll.getLast());
        ll.display();


        ll.reverseListPointerWay();
        System.out.println("reversed using pointer approach");
        System.out.println("head: "+ll.getFirst()+"\t last: "+ll.getLast());
        ll.display();

        try {
            System.out.println(ll.getKthLast(100).data);
        } catch (Exception e) {
            System.out.println("null pointer exception");
        }

        System.out.println("last index:\t"+ll.getKthLast(12).data);
        System.out.println("last index:\t"+ll.getKthLast(6).data);
        System.out.println("last index:\t"+ll.getKthLast(1).data);

        ll.display();
        System.out.println("size: "+ll.getSize());
        System.out.println("mid: "+ll.getMid().data);
        System.out.println("adding at last 98");
        ll.addLast(98);

        ll.display();
        System.out.println("size: "+ll.getSize());
        System.out.println("mid: "+ll.getMid().data);

    }
}
