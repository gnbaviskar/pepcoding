package LevelOne.lectThirteen.BinaryTree;

public class _4_sizeSumMaxHeight2 {
    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};

        _1_.Node root = _1_.construct(arr);

        int max = getMax(root);
        System.out.println(max);
        System.out.println("size: "+getSize(root));
        System.out.println("sum: "+getSum(root));

        System.out.println("height: "+getHeight(root));
    }

    public static int getSize(_1_.Node node) {
        if (node == null) return 0;


        int lSize = getSize(node.left);
        int rSize = getSize(node.right);
        return lSize+rSize+1;
    }

    public static int getSum (_1_.Node node) {
        if (node == null) return 0;

        int lSum = getSum(node.left);
        int rSum = getSum(node.right);

        return lSum+rSum+node.data;
    }

    public static int getMax(_1_.Node node) {
        if (node == null) return 0;

        int max = node.data;
        int lMax = Math.max(getMax(node.left), max);
        int rMax = Math.max(getMax(node.right), lMax);
        return rMax;
    }

    public static int getHeight(_1_.Node node) {
        if (node == null) {
            // return -1 if height needed in terms of edges
            // return 0 if height needed in terms of nodes
            return 0;
        }

        int lHeight = getHeight(node.left);
        int rHeight = getHeight(node.right);
        return Math.max(lHeight, rHeight) + 1;
    }
}
