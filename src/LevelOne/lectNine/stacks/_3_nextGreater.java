package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _3_nextGreater {
    public static void main(String[] args) {
        nextGreater(new int[]{2, 5, 9, 3, 1, 12, 6 , 8, 7});
    }

    public static void nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            int ele = arr[i];
            while (st.size() > 0) {
                int peeked = st.peek();
                if (peeked > ele) {
                    System.out.println("next greater for "+ele+" is "+peeked);
                    break;
                } else {
                    st.pop();
                }
            }
            if (st.size() == 0) System.out.println("next greater for "+ele+" is -1");
            st.push(ele);
        }
    }
}
