package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _1_findDuplicasy {
    public static void main(String[] args) {
        System.out.println(findBracketDuplicates("((a+b)+(p+d))"));
        System.out.println(findBracketDuplicates("(a+b)+((p+d))"));
    }

    public static boolean findBracketDuplicates(String str) {
        Stack<Character> st = new Stack<Character>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
             if (ch != ')') {
                 st.push(ch);
             } else {
                 char peeked = st.peek();
                 if (peeked == '(') return true;
                 char popped = '$';
                 while (popped != '(') {
                     popped = st.pop();
                 }
             }
        }

        return false;
    }
}
