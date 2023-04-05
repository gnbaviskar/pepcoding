package LevelOne.lectNine.stacks;

import java.util.ArrayList;

public class _18_minimumStackConstantTimeConstantSpace {
    public static class DynamicStack {
        ArrayList<Integer> data;
        int tos;
        int minimumVal;

        public DynamicStack() {
            data = new ArrayList<>();
            tos = -1;
            minimumVal = Integer.MAX_VALUE;
        }

        int size() {
            return tos+1;
        }

        void push(int val) {
            tos++;
            if (minimumVal == Integer.MAX_VALUE) minimumVal = val;
            // if val less than minimum, handle minimum and use stack value
            if (val < minimumVal) {
                int tempVal = val;
                val = val + (val - minimumVal);
                minimumVal = tempVal;
            }
            data.add(tos, val);

        }

        int pop() {
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            }
            int ele = data.get(tos);
            // handle new minimum, if removed val is less than minimum
            if (ele < minimumVal) {
                int diff = minimumVal - ele;
                minimumVal = minimumVal + diff;
            }
            data.remove(tos);
            tos--;
            return ele;
        }

        int top() {
            if (tos == -1) {
                System.out.println("stack underflow");
                return -1;
            }
            int ele = data.get(tos);
            // if stored value is less than minimumVal, return it properly with adding diff
            if (ele < minimumVal) {
                int diff = minimumVal - ele;
                ele = ele + diff;
            }
            return ele;
        }

        void display() {
            for (int i = tos; i>=0; i--) {
                System.out.print(data.get(i)+"\t");
            }
            System.out.println();
        }

        int getMin() {
            return this.minimumVal;
        }
    }

    public static void main(String[] args) {
        DynamicStack st = new DynamicStack();

        st.push(8);
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.push(47);
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.push(17);
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.push(7);
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.push(30);
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.push(2);
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());

        // start popping
        System.out.println("popping");
        st.pop();
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.pop();
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.pop();
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.pop();
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.pop();
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
        st.pop();
        System.out.println("ele: "+st.top()+" | min:"+st.getMin());
    }
}
