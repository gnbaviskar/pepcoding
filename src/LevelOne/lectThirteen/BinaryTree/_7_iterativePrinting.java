package LevelOne.lectThirteen.BinaryTree;

import java.util.Stack;

public class _7_iterativePrinting {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);
        iterativePreorder(root);

    }

    public static void iterativePreorder(_1_.Node node) {
        Stack<_1_.Pair> st = new Stack<>();
        _1_.Pair rootPair = new _1_.Pair(node, 1);
        st.push(rootPair);
        String pre = "PRE  ORDER\t\t";
        String post = "IN   ORDER\t\t";
        String in = "POST ORDER\t\t";


        while (st.size() > 0) {
            _1_.Pair top = st.peek();
            int topState = top.state;
            // handle left
            if (topState == 1) {
                top.state += 1;
                if (top.node != null) {
                    pre += top.node.data + "\t";
                    _1_.Pair leftPair = new _1_.Pair(top.node.left, 1);
                    st.push(leftPair);
                }
            }
            // handle right
            else if (topState == 2) {
                top.state += 1;
                if (top.node != null) {
                    in += top.node.data + "\t";
                    _1_.Pair rightPair = new _1_.Pair(top.node.right, 1);
                    st.push(rightPair);
                }
            }
            // handle
            else {
                if (top.node != null) {
                    post += top.node.data + "\t";
                }
                st.pop();
            }
        }

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

}
