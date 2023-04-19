package LevelOne.lectThirteen.BinaryTree;

public class _3_sizeSumMaxHeight {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);
        multiSolver(root, 1);
        System.out.println("size: "+size);
        System.out.println("sum: "+sum);
        System.out.println("max: "+max);
        System.out.println("height: "+height);
    }

    public static int size = 0;
    public static int sum = 0;
    public static int max = Integer.MIN_VALUE;
    public static int height = 1;

    public static void multiSolver(_1_.Node node, int depth) {
        if (node != null) {
            size += 1;
            sum += node.data;
            max = (node.data > max) ? node.data : max;
            height = (depth > height) ? depth : height;

            if (node.left != null) multiSolver(node.left, depth + 1);
            if (node.right != null) multiSolver(node.right, depth + 1);
        }
    }

}
