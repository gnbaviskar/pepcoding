package LevelOne.lectNine.stacks;


import java.util.Stack;

public class _2_isBalancedBrackes {
    public static void main(String[] args) {
        System.out.println(isBalanced("[(a + b) + {(c + d) * (e / f)}]"));
        System.out.println(isBalanced("[(a + b) + {(c + d) * (e / f)]}"));
        System.out.println(isBalanced("[(a + b) + {(c + d) * (e / f)}"));
        System.out.println(isBalanced("([(a + b) + {(c + d) * (e / f)}]"));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<Character>();
        int n = str.length();
        st.push(str.charAt(0));
        for (int i = 1; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
               char peeked = st.peek();
               if (ch == ')' && peeked == '(') {
                   st.pop();
               } else if (ch == ']' && peeked == '[') {
                   st.pop();
               } else if (ch == '}' && peeked == '{') {
                   st.pop();
               } else {
                   return false;
               }
            }
        }
        if (st.size() > 0) return false;
        return true;
    }
}
