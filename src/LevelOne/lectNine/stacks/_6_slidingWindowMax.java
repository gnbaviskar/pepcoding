package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _6_slidingWindowMax {
    public static void main(String[] args) {
        slidingWindowMax(new int[]{2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6}, 4);

    }

    public static void slidingWindowMax(int[] arr, int k) {
        int n = arr.length;
        int[] ul = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            while (st.size() > 0) {
                int peekedIndex = st.peek();
                int elePeeked = arr[peekedIndex];
                if (elePeeked > arr[i]) {
                    ul[i] = peekedIndex;
                    break;
                }
                st.pop();
            }
            if (st.size() == 0) {
                ul[i] = n;
            }
            st.push(i);
        }

        int start = 0; int end = k - 1;
        while (end < n) {
            int j = start;
            while (ul[j] <= end) {
                j = ul[j];
            }
            start++;
            end++;
            System.out.print(arr[j]+"\t");
        }
    }
}
