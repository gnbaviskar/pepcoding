package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _4_stockSpan {
    public static void main(String[] args) {
        stockSpan(new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7});
    }

    public static void stockSpan(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            while (st.size() > 0) {
                int peeked = st.peek();
                if (arr[peeked] > ele) {
                    int span = i - peeked;
                    System.out.print(ele+" "+span+" |\t");
                    break;
                }
                st.pop();
            }
            if (st.size() == 0) {
                int span = i + 1;
                System.out.print(ele+" "+span+" |\t");
            }
            st.push(i);
        }
    }
}
