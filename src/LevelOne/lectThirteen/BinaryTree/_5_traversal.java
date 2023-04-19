package LevelOne.lectThirteen.BinaryTree;

public class _5_traversal {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);
        System.out.println("pre order");
        preOrder(root);

        System.out.println();
        System.out.println();
        System.out.println("in order");
        inOrder(root);

        System.out.println();
        System.out.println();
        System.out.println("post order");
        postOrder(root);
    }

    public static void inOrder(_1_.Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print("\t"+node.data);
        inOrder(node.right);
    }

    public static void preOrder(_1_.Node node) {
        if (node == null) return;

        System.out.print("\t"+node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(_1_.Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print("\t"+node.data);
    }
}
