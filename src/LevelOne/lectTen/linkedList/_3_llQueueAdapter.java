package LevelOne.lectTen.linkedList;

public class _3_llQueueAdapter {
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
            if (size == 0) return;
            if (size == 1) head = tail = null;

            Node temp = getAt(size - 2);
            temp.next = null;
            tail = temp;
            size--;
        }

        void enqueue(int val) {
            addLast(val);
        }

        int dequeue() {
            if (size == 0) {
                return -1;
            } else if (size == 1) {
                Node temp = head;
                head = tail = null;
                size--;
                return temp.data;
            }

            Node temp = head;
            head = head.next;
            size--;
            return temp.data;
        }

        int peek() {
            if (size == 0) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        for (int i = 10; i <= 50; i+=10) {
            queue.enqueue(i);
        }
        queue.display();
        System.out.println("size: "+queue.getSize());
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("size: "+queue.getSize());
        System.out.println("peek: "+queue.peek());
    }
}
