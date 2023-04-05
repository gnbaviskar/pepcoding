package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _9_postFixEvaluation {

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
        String exp = "264*8/+3-";
        int n = exp.length();
        Stack<Integer> vs = new Stack<>();
        Stack<String> infixE = new Stack<>();
        Stack<String> pre = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = exp.charAt(i);
            if (ch >= '0' && ch <= '9') {
                vs.push(ch - '0');
                infixE.push(""+ch);
                pre.push(""+ch);
            } else {
                int v2vs = vs.pop();
                int v1vs = vs.pop();
                int ansvs = operation(ch, v1vs, v2vs);
                vs.push(ansvs);

                String v2 = infixE.pop();
                String v1 = infixE.pop();
                String ans = "("+v1+ch+v2+")";
                infixE.push(ans);

                v2 = pre.pop();
                v1 = pre.pop();
                ans = ch+v1+v2;
                pre.push(ans);



            }
        }
        System.out.println(vs.pop());
        System.out.println(infixE.pop());
        System.out.println(pre.pop());
    }

}
