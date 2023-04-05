package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _10_preFixEvaluation {

    public static int operation(char ch, int a, int b) {
        if (ch == '+') {
            return a+b;
        } else if (ch == '-') {
            return a-b;
        } else if (ch == '*') {
            return a*b;
        }
        return a/b;
    }
    public static void main(String[] args) {
        String exp = "-+2/*6483";
        int n = exp.length();
        Stack<Integer> vs = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postFix = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch >= '0' && ch <= '9') {
                vs.push(ch - '0');
                infix.push(ch+"");
                postFix.push(ch+"");
            } else {
                int v1vs = vs.pop();
                int v2vs = vs.pop();
                int ansvs = operation(ch, v1vs, v2vs);
                vs.push(ansvs);

                String v1 = infix.pop();
                String v2 = infix.pop();
                String ans = "("+v1+ch+v2+")";
                infix.push(ans);

                v1 = postFix.pop();
                v2 = postFix.pop();
                ans = v1+v2+ch;
                postFix.push(ans);
            }
        }
        System.out.println(vs.pop());
        System.out.println(infix.pop());
        System.out.println(postFix.pop());
    }

}
