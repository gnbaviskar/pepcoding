package LevelOne.lectThirteen.BinaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _6_levelOrderPrinting {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);
//        levelOrder(root);
        levelOrder2(root);
    }

    public static void levelOrder(_1_.Node node) {
        Queue<_1_.Node> parentQ = new ArrayDeque<>();
        Queue<_1_.Node> childQ = new ArrayDeque<>();

        parentQ.add(node);
        while (parentQ.size() > 0) {
            _1_.Node top = parentQ.remove();
            System.out.print("\t"+top.data);

            if (top.left != null) {
                childQ.add(top.left);
            }

            if (top.right != null) {
                childQ.add(top.right);
            }

            if (parentQ.size() == 0) {
                if (childQ.size() > 0) {
                    parentQ = childQ;
                    childQ = new ArrayDeque<>();
                }
                System.out.println();
            }
        }
    }

    public static void levelOrder2(_1_.Node node) {
        Queue<_1_.Node> queue = new LinkedList<>();

        queue.add(node);
        queue.add(null);
        while (queue.size() > 0) {
            if (queue.peek() != null) {
                _1_.Node top = queue.remove();
                System.out.print("\t"+top.data);

                if (top.left != null) {
                    queue.add(top.left);
                }

                if (top.right != null) {
                    queue.add(top.right);
                }
            } else {
                queue.remove();
                System.out.println();
                if (queue.size() > 0) {
                    queue.add(null);
                }
            }
        }
    }
}
