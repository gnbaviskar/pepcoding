package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _8_infixConversions {
    public static void main(String[] args ) {
        String exp = "a*(b-c)/d+e";
        int n = exp.length();
        Stack<String> pre = new Stack<>();
        Stack<Character> operators = new Stack<>();
        Stack<String> post = new Stack<>();

        for (int i = 0; i<n; i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    process(operators, pre, post);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    process(operators, pre, post);
                }
                operators.push(ch);
            } else {
                pre.push(""+ch);
                post.push(""+ch);
            }
        }

        while (operators.size() > 0) {
            process(operators, pre, post);
        }
        System.out.println(pre.peek());
        System.out.println(post.peek());
    }

    public static void process(Stack<Character> operators, Stack<String> pre, Stack<String> post) {
        char operator = operators.pop();
        String  v2 = pre.pop();
        String v1 = pre.pop();
        String ans = operator+v1+v2;
        pre.push(ans);
        v2 = post.pop();
        v1 = post.pop();
        ans = v1+v2+operator;
        post.push(ans);
    }


    public static int precedence(Character ch) {
        if (ch == '+' || ch == '-') return 1;
        return 2;
    }

}
