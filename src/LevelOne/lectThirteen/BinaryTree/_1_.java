package LevelOne.lectThirteen.BinaryTree;

import java.util.Stack;

public class _1_ {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node (int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        int state;
        Node node;
        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] inputArr) {
        Stack<Pair> st = new Stack<>();
        int idx = 0;
        Node rootNode = new Node(inputArr[idx], null, null);
        Pair rtPair = new Pair(rootNode, 1);
        st.push(rtPair);
        idx+=1;
        while (st.size() > 0 && idx < inputArr.length) {
            Pair top = st.peek();
            int topState = top.state;

            // add left element to top node in the stack
            if (topState == 1) {
                top.state = 2;

                if (inputArr[idx] != null) {
                    int data = inputArr[idx];
                    Node leftNode = new Node(data, null, null);
                    top.node.left = leftNode;
                    Pair newPair = new Pair(leftNode, 1);
                    st.push(newPair);
                }
                idx += 1;
            } else if (topState == 2) {
               // add right most element from to top node from the stack
                top.state = 3;
                if (inputArr[idx] != null) {
                    int data = inputArr[idx];
                    Node rightNode = new Node(data, null, null);
                    top.node.right = rightNode;
                    Pair newPair = new Pair(rightNode, 1);
                    st.push(newPair);
                }
                idx += 1;
            } else {
                st.pop();
                // no need to increse the value for idx when popping element from the stack
            }
        }



        return rootNode;

    }

    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = construct(arr);
        System.out.println("");
    }
}
