package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _5_largestArHistogram {
    public static void main(String[] args) {
        System.out.println(histogramArea(new int[]{6, 2, 5, 4, 5, 1, 6}));
    }

    public static int histogramArea(int[] arr) {
        int n = arr.length;
        int[] rs = new int[n];
        int[] ls = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            while (st.size() > 0) {
                int peeked = st.peek();
                if (arr[peeked] < arr[i]) {
                    rs[i] = peeked;
                    break;
                }
                st.pop();
            }
            if (st.size() == 0) {
                rs[i] = n;
            }
            st.push(i);
        }

        st.clear();
        for (int i = 0; i < n; i++) {
            while (st.size() > 0) {
                int peeked = st.peek();
                if (arr[peeked] < arr[i]) {
                    ls[i] = peeked;
                    break;
                }
                st.pop();
            }
            if (st.size() == 0) {
                ls[i] = -1;
            }
            st.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int width = rs[i] - ls[i] - 1;
            int height = arr[i];
            int area = width * height;
            if (area > maxArea) maxArea = area;
        }

        return maxArea;
    }
}
