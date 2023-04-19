package LevelOne.lectThirteen.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class _8_nodeToRootPath {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);

        System.out.println(nodeToRootPath(root, 37));
        System.out.println(nodeToRootPath(root, 375));
        System.out.println(nodeToRootPath(root, 30));
        System.out.println(nodeToRootPath(root, 70));
        System.out.println(nodeToRootPath(root, 87));
    }

    public static class Pair {
        _1_.Node node;
        int state;
        Pair(_1_.Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static ArrayList<Integer> nodeToRootPath (_1_.Node node, int data) {
        Stack<Pair> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        Pair rootNode = new Pair(node, 1);
        st.push(rootNode);

        while (st.size() > 0) {
            Pair top = st.peek();

            int topState = top.state;
            if (topState == 1) {
                // handle left
                top.state += 1;
                if (top.node != null) {
                    Pair leftPair = new Pair(top.node.left, 1);
                    st.push(leftPair);

                    if (top.node.left != null && top.node.left.data == data) {
                        break;
                    }
                }
            }

            else if (topState == 2) {
                // handle right
                top.state += 1;
                if (top.node != null) {
                    Pair rightNode = new Pair(top.node.right, 1);
                    st.push(rightNode);

                    if (top.node.right != null && top.node.right.data == data) {
                        break;
                    }
                }
            }

            else {
                // remove it
                st.pop();
            }
        }


        while (st.size() > 0) {
            ans.add(st.pop().node.data);
        }

        return ans;
    }
}
