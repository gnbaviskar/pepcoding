package LevelOne.lectNine.stacks;

import java.util.Arrays;
import java.util.Stack;

public class _12_mergeIntervalPairs {
    public static void main(String[] args) {
        int[][] maze = new int[][]{
                {22, 28},
                {1, 8},
                {25, 27},
                {14, 19},
                {27, 30},
                {5, 12}
        };
        int n = maze.length;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(maze[i][0], maze[i][1]);
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        st.push(pairs[0]);
        for (int i = 1; i < pairs.length; i++) {
            Pair top = st.peek();

            if (pairs[i].start > top.end) {
                st.push(pairs[i]);
            } else {
                top.end = Math.max(top.end, pairs[i].end);
            }
        }
        Stack<Pair> rs = new Stack<>();
        while (st.size() > 0) {
            rs.push(st.pop());
        }
        while (rs.size() > 0) {
            Pair temp = rs.pop();
            System.out.println("start: "+temp.start+" \t"+"end: "+temp.end);
        }
    }

    public static class Pair implements Comparable<Pair> {
        int start;
        int end;
        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        // this > other return +ve
        // this = other return 0
        // this < other return -ve
        public int compareTo(Pair other) {
            if (this.start != other.start) {
                return this.start - other.start;
            } else {
                return this.end - other.end;
            }
        }
    }
}
