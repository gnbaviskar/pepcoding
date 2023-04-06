package LevelOne.lectNine.stacks;

public class _21_queueToStackAdapter {
    public static class CustomQueueStackAdapter {
        int[] data;
        int start;
        int size;
        int n;

        public CustomQueueStackAdapter(int len) {
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

        void stackPush(int val) {
            if (size == n) {
                System.out.println("queue overflow");
                return;
            }
            this.enqueue(val);
        }

        int stackTop() {
            if (size == 0) {
                System.out.println("queue underflow");
                return -1;
            }
            int top = start + size - 1;
            System.out.println("");
            return  data[top];
        }

        int stackPop() {
            if (size == 0) {
                System.out.println("queue underflow");
                return -1;
            }
            int top = start + size - 1;
            int val = data[top];
            size--;
            return val;
        }
    }

    public static void main(String[] args) {
        CustomQueueStackAdapter queue = new CustomQueueStackAdapter(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.stackPush(40);
        queue.enqueue(50);
        queue.display(); // 10 20 30 40 50
        queue.enqueue(60); // queue overflow
        System.out.println(queue.stackTop()); // 50
        System.out.println(queue.stackPop()); // 50
        System.out.println(queue.stackPop()); // 40
        queue.display(); // 10 20 30
    }
}
