package LevelOne.lectThirteen.BinaryTree;

public class _2_display {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);

        display(root);
    }

    public static void display(_1_.Node node) {
        if (node == null) return;

        System.out.print(" "+node.data);
        display(node.left);
        display(node.right);
    }
}
