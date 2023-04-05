package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _14_smallestPattern {
    public static void main(String[] args) {
//        String exp = "dddiiddi";
//        String exp = "ddiididd";
        Stack<Integer> st = new Stack<>();
        String exp = "IIIDIDDD";
        String ans = "";
        int n = exp.length();
        int c = 1;
        for (int i = 0; i < n; i++) {
            char ch = exp.charAt(i);
            if (ch == 'I') {
                st.push(c);
                while (st.size() > 0) {
                    ans += st.pop();
                }
                c+=1;
            } else {
                st.push(c);
                c+= 1;
            }

        }
        st.push(c);
        while (st.size() > 0) {
            ans += st.pop();
        }
        System.out.println(ans);


    }
}
