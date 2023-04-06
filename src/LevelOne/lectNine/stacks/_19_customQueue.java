package LevelOne.lectNine.stacks;

public class _19_customQueue {


    public static class CustomQueue {
        int[] data;
        int start;
        int size;
        int n;

        public CustomQueue(int len) {
            data = new int[len];
            start = 0;
            size = 0;
            n = data.length;
        }

        // add method
        void enqueue(int val) {
            if (size == n) {
                System.out.println("queue overflow");
                return;
            }
            // get end pos to add new ele
            int end = (start + size) % n;
            data [end] = val;
            size++;
        }

        int peek() {
            if (size == 0) {
                System.out.println("queue underflow");
                return -1;
            }
            return data[start];
        }

        int dequeque() {
            if (size == 0) {
                System.out.println("queue underflow");
                return -1;
            }
            int val = data[start];
            start = (start + 1) % n;
            size--;
            return val;
        }

        void display() {
            for (int i = 0; i < size; i++) {
                int idx = (start + i) % n;
                System.out.print(data[idx]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // queue overflow

        System.out.println(queue.dequeque()); // 10
        System.out.println(queue.dequeque()); // 20

        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80); // queue overflow
        System.out.println(queue.dequeque()); // 30
        System.out.println(queue.dequeque()); // 40
        System.out.println(queue.dequeque()); // 50
        System.out.println(queue.dequeque()); // 60
        System.out.println(queue.dequeque()); // 70
        System.out.println(queue.dequeque()); // queue underflow
    }
}
