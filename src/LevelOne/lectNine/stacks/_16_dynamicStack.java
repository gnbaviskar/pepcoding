package LevelOne.lectNine.stacks;

import java.util.ArrayList;

public class _16_dynamicStack {

    public static void main(String[] args) {
        DynamicStack dst = new DynamicStack();
        dst.push(1);
        dst.push(1);
        dst.push(1);
        dst.push(1);
        dst.push(16);
        dst.push(1);
        dst.push(1);
        dst.push(1);
        dst.push(1);
        dst.push(18);
        dst.display();
        while (dst.size() > 0) {
            dst.top();
            System.out.println(dst.pop());
        }
        dst.pop();
        dst.top();

    }

    public static class DynamicStack {
        ArrayList<Integer> data;
        int tos;

        public DynamicStack() {
            data = new ArrayList<>();
            tos = -1;
        }

        int size() {
            return tos+1;
        }

        void push(int val) {
            tos++;
            data.add(tos, val);
        }

        int pop() {
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            }
            int ele = data.get(tos);
            data.remove(tos);
            tos--;
            return ele;
        }

        int top() {
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            }
            return data.get(tos);
        }

        void display() {
            for (int i = tos; i>=0; i--) {
                System.out.print(data.get(i)+"\t");
            }
            System.out.println();
        }
    }
}
