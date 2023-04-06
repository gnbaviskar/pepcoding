package LevelOne.lectNine.stacks;

import java.util.Queue;

public class _20_dynamicQueue {
    public static class DynamicQueue {
        int[] data;
        int start;
        int size;
        int n;

        public DynamicQueue(int len) {
            data = new int[len];
            start = 0;
            size = 0;
            n = data.length;
        }

        // add method
        void enqueue(int val) {
            if (size == n) {
                int[] newData = new int[n*2];
                for (int i = 0; i < size; i++) {
                    int idx = (start + i) % n;
                    newData[i] = data[idx];
                }
                data = newData;
                n = newData.length;
                // reset the start to 0 for new data
                start = 0;
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
        DynamicQueue queue = new DynamicQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("");
        queue.enqueue(60);
        System.out.println("");
    }
}
