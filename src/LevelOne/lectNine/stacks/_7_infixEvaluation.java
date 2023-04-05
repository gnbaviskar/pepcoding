package LevelOne.lectNine.stacks;

import java.util.Stack;

public class _7_infixEvaluation {

    public static void main(String[] args) {
        String exp = "2+(5-3*6/2)";
        int n = exp.length();
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (ch>='0' && ch<='9') {
                operands.push(ch - '0');
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    processOperators(operators, operands);
                }
                operators.pop();

            } else if (isOperator(ch)) {
                while (operators.size() > 0 && operators.peek() != '(' &&  precedence(ch) <= precedence(operators.peek())){
                    processOperators(operators, operands);
                }
                operators.push(ch);
            }
        }

        while (operators.size() > 0) {
            processOperators(operators, operands);
        }

        System.out.println(operands.peek());
    }

    public static boolean isOperator(Character ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') return true;
        return false;
    }

    public static void processOperators(Stack<Character> operators, Stack<Integer> operands) {
        char operator = operators.pop();
        int v2 = operands.pop();
        int v1 = operands.pop();
        int result = operation(v1, v2, operator);
        operands.push(result);
    }

    public static int operation(int value1, int value2, char operation) {
        if (operation == '+') {
            return value1 + value2;
        } else if (operation == '-') {
            return value1 - value2;
        } else if (operation == '*') {
            return value1 * value2;
        }
        return value1/value2;
    }

    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        return 2;
    }
}
