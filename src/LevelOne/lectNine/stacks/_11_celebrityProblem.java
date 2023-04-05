package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _11_celebrityProblem {
    public static void main(String[] args) {
        System.out.println(isCelebrity(new int[][]{
                {0,1,1,1},
                {1,0,1,1},
                {0,0,0,0},
                {1,1,1,0}
        }));
        System.out.println(isCelebrity(new int[][]{
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        }));
    }

    public static int isCelebrity(int [][] maze) {
        Stack<Integer> st = new Stack<>();
        int n = maze.length;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 0) {
            if (st.size() == 1) break;
            int v1 = st.pop();
            int v2 = st.pop();
//            // v1 is not celebrity
//            if (maze[v1][v2] == 0) {
//                st.push(v1);
//            }
//            if (maze[v2][v1] == 0) {
//                st.push(v2);
//            }

            if (maze[v1][v2] == 1) {
                st.push(v2);
            } else {
                st.push(v1);
            }
        }
        if (st.size() == 1) {
            int celebrityEle = st.pop();
            boolean isCelebrityEle = true;
            for (int i = 0; i < n; i++) {
                if (i == celebrityEle) continue;
//                System.out.println(" \t"+maze[celebrityEle][i]+" \t"+maze[i][celebrityEle]);
                if (!(maze[celebrityEle][i] == 0 && maze[i][celebrityEle] == 1)) {
                    isCelebrityEle = false;
                }
            }
            if (isCelebrityEle == true) return celebrityEle;
        }
        return -1;
    }
}
