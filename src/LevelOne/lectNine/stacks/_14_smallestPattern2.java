package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _14_smallestPattern2 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String exp = "IIIDIDDD";
        String ans = "";
        int n = exp.length();
        int c = 0;

        for (int i = 0; i < n; i++) {
            char ch = exp.charAt(i);
            if (ch == 'I' || ch == 'i') {
                c += 1;
                st.push(c);
                while (st.size() > 0) {
                    ans += st.pop();
                }
            } else {
                c+=1;
                st.push(c);
            }
        }
        // last digit
        st.push(c+=1);
        while (st.size() > 0) {
            ans += st.pop();
        }
        System.out.println("");
    }
}
