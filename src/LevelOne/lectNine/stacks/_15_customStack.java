package LevelOne.lectNine.stacks;

public class _15_customStack {
    public static class CustomStack {
        int[] data;
        int tos;

        public CustomStack(int cap) {
            data = new int[cap];
            tos = -1;
        }

        int size() {
            return tos + 1;
        }

        void display() {
            for (int i = this.tos; i >=0; i--) {
                System.out.print(data[i]+"\t");
            }
            System.out.println();
        }

        void push(int val) {
            if (tos == data.length - 1) {
                System.out.println("stack overflow");
                return;
            }
            tos++;
            data[tos] = val;
        }

        int pop() {
            if (tos == -1) {
                System.out.print("stack underflow");
                return -1;
            }
            int ele = data[tos];
            data[tos] = 0;
            tos--;
            return ele;
        }

        int top() {
            if (tos == -1) {
                System.out.print("stack underflow");
                return -1;
            }
            return data[tos];
        }
    }

    public static void main(String[] args) {
        CustomStack st = new CustomStack(5);
        st.push(1);
        st.push(2);
        st.push(22);
        System.out.println(st.top());
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        st.push(2);
        st.push(2);
        st.push(2);
        st.push(2);
        st.push(2);
        st.push(2);

    }
}
