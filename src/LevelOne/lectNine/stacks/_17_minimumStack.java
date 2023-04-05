package LevelOne.lectNine.stacks;

import java.util.ArrayList;

public class _17_minimumStack {
    public static class DynamicStackWithMin {
        ArrayList<Integer> data;
        ArrayList<Integer> minData;
        int tos;

        public DynamicStackWithMin() {
            data = new ArrayList<>();
            minData = new ArrayList<>();
            tos = -1;
        }

        int size() {
            return tos+1;
        }

        void push(int val) {
            tos++;
            data.add(tos, val);

            if (minData.size() > 0) {
                int peeked = minData.get(minData.size() - 1);
                if (val < peeked) {
                    minData.add(val);
                }
            } else {
                minData.add(val);
            }
        }

        int pop() {
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            }
            int ele = data.get(tos);
            data.remove(tos);
            tos--;

            if (minData.size() > 0) {
                int peeked = minData.get(minData.size() - 1);
                if (peeked == ele) {
                    minData.remove(minData.size() - 1);
                }
            }
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

        int getMinStack() {
            if (minData.size() == 0) return -1;
            return minData.get(minData.size() - 1);
        }
    }

    public static void main(String[] args) {
        DynamicStackWithMin st = new DynamicStackWithMin();

        st.push(4);
        st.push(44);
        st.push(2);
        System.out.println(st.getMinStack());
        st.push(66);
        st.pop();
        System.out.println(st.getMinStack());
        st.pop();
        System.out.println(st.getMinStack());
        st.pop();
        System.out.println(st.getMinStack());
        st.pop();
        System.out.println(st.getMinStack());
        st.pop();
        System.out.println(st.getMinStack());
        System.out.println("");
    }
}
