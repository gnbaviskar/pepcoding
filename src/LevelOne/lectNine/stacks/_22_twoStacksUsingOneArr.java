package LevelOne.lectNine.stacks;

public class _22_twoStacksUsingOneArr {
    public static class TwoStacks {
        int[] arr;
        int start;
        int end;
        public TwoStacks(int n) {
            arr = new int[n];
            start = -1;
            end = n;
        }

        void push1(int val) {
            int newStart = start + 1;
            if (newStart >= end) {
                System.out.println("stack overflow");
                return;
            }

            arr[newStart] = val;
            start = newStart;
        }

        void push2(int val) {
            int newEnd = end - 1;
            if (end <= start) {
                System.out.println("stack overflow");
                return;
            }

            arr[newEnd] = val;
            end = newEnd;
        }

        int pop1() {
            if (start < 0) {
                System.out.println("stack underflow");
                return -1;
            }
            int val =  arr[start];
            start--;
            return val;
        }

        int pop2() {
            if (end >= arr.length) {
                System.out.println("stack underflow");
                return -1;
            }
            int val = arr[end];
            end++;
            return val;
        }
    }

    public static void main(String[] args) {
        TwoStacks st = new TwoStacks(50);
        for (int i = 1; i <= 30; i++) {
            st.push1(i);
        } // fill from 0 to 29
        for (int i = 100; i > 80; i--) {
            st.push2(i);
        } // fill starting from 49 upto 30
        // all st is filled
        st.push1(12); // stack overflow
        st.pop1();
        st.push2(1000); // added without error
    }
}
