package LevelOne.lectEleven.GenericTree;

import java.util.*;

public class _1_ {
    static public class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static void main(String[] args) {
        int[] input = new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1,
                -1, 90, -1, -1, 40, 100, -1, -1, -1};

        int[] input2 = new int[]{1,2,5, -1,6,-1, -1,3,7, -1,8,11, -1, 12, -1, -1, 9, -1, -1, 4, 10, -1, -1, -1};

        int[] input3 = new int[]{20,50,2,2,2,2,2,2,2,2,-1,60,2,2,2,2,2,2,2,2,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};

        Node root = new Node();
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == -1) {
                st.pop();
            } else {
                Node dummy = new Node();
                dummy.data = input[i];
                if (st.size() == 0) {
                    root = dummy;
                    st.push(root);
                    continue;
                }

                Node node = st.peek();
                node.children.add(dummy);
                st.push(dummy);
            }
        }

        Node root2 = new Node();
        Stack<Node> st2 = new Stack<>();
        for (int i = 0; i < input2.length; i++) {
            if (input2[i] == -1) {
                st2.pop();
            } else {
                Node dummy = new Node();
                dummy.data = input2[i];
                if (st2.size() == 0) {
                    root2 = dummy;
                    st2.push(root2);
                    continue;
                }

                Node node = st2.peek();
                node.children.add(dummy);
                st2.push(dummy);
            }
        }
        System.out.println("");



        Node root3 = new Node();
        Stack<Node> st3 = new Stack<>();
        for (int i = 0; i < input3.length; i++) {
            if (input3[i] == -1) {
                st3.pop();
            } else {
                Node dummy = new Node();
                dummy.data = input3[i];
                if (st3.size() == 0) {
                    root3 = dummy;
                    st3.push(root3);
                    continue;
                }

                Node node = st3.peek();
                node.children.add(dummy);
                st3.push(dummy);
            }
        }



        // display
//        display(root);

//        System.out.println("size: "+getSizeGTree(root));
        System.out.println("get max: "+getMax(root));

        System.out.println("get height: "+getHeight(root));

//        traversal(root);
//        levelTraversal(root);
//        zigzagPrint(root);

//        printLevelOneQueue(root);
//        printLevelOnSizeBases(root);
//        mirrorTree(root);
//        removeLeaves(root);
//        linearize(root);
//        System.out.println(findNode(root, 110));

//        System.out.println(nodeToRootPath(root, 110));

//        Node test = lowestCommonAncestor(root, 70, 110);
//        System.out.println(test.data);

//        int distance = getDistance(root, 70, 110);
//        System.out.println(distance);

//        boolean isSame = isSimilar(root, root2);
//        boolean isSame2 = isSimilar(root2, root3);
//        System.out.println(isSame);
//        System.out.println(isSame2);

//        callMultiSolver(root);
//        callPredAndScc(root, 90);

//        ceilFloor(root, 65);
//        ceilFloor(root, 90);
//        ceilFloor(root, 5);

//        kthLargest(root);


        int[] input4 = new int[]{10, 20, -50, -1, -60, -1, -1, 30, -70, -1, 80, -110, -1, 120, -1,
                -1, 90, -1, -1, 40, -100, -1, -1, -1};

        Node root4 = new Node();
        Stack<Node> st4 = new Stack<>();
        for (int i = 0; i < input4.length; i++) {
            if (input4[i] == -1) {
                st4.pop();
            } else {
                Node dummy = new Node();
                dummy.data = input4[i];
                if (st4.size() == 0) {
                    root4 = dummy;
                    st4.push(root4);
                    continue;
                }

                Node node = st4.peek();
                node.children.add(dummy);
                st4.push(dummy);
            }
        }

//        calSumHelper(root);
//        calSumHelper(root4);

        diaMeter(root3);
        System.out.println("max diameter: "+maxDia);


    }

    public static void diaMeter(Node root) {
        diaMeterHelper(root);
    }

    static int maxDia = 0;

    public static int diaMeterHelper(Node node) {
        if (node.children.size() == 0) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(0);
//            return temp;
            return 0;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Node child: node.children) {
            int tempRes = diaMeterHelper(child);
            result.add(tempRes+1);
        }

        result.sort(Comparator.naturalOrder());

        if (result.size() > 1) {
            int tempSize = result.get(result.size() - 1) + result.get(result.size() - 2);
            maxDia = (tempSize > maxSum) ? tempSize : maxDia;
        }

        System.out.println("node: "+node.data+" list: "+result+" max diameter: "+maxDia);
        return result.get(result.size() - 1);
    }


    static int maxSum = Integer.MIN_VALUE;
    public static int calcMaxSum(Node node) {
        int locSum = node.data;

        for (Node child: node.children) {
            locSum += calcMaxSum(child);
        }

        if (locSum > maxSum) {
            maxSum = locSum;
            System.out.println("loc sum: "+maxSum+" "+node.data);
        }
        return locSum;
    }

    public static void calSumHelper(Node root) {
        maxSum = Integer.MIN_VALUE;
        calcMaxSum(root);
        System.out.println(maxSum);
    }


    static int size = 0;
    static int height = 0;
    static int minVal = Integer.MAX_VALUE;
    static int maxVal = Integer.MIN_VALUE;

    public static void multiSolver(Node node, int locHeight) {
        size += 1;
        minVal = (node.data < minVal) ? node.data : minVal;
        maxVal = (node.data > maxVal) ? node.data : maxVal;
        if (node.data == 110) {
            System.out.println("");
        }
        height = (locHeight > height) ? locHeight : height;

        for (Node child: node.children) {
            multiSolver(child, locHeight+1);
        }
    }

    public static void callMultiSolver(Node root) {
        multiSolver(root, 0);
        System.out.println("size: "+size);
        System.out.println("min: "+minVal);
        System.out.println("max: "+maxVal);
        System.out.println("height: "+height);
    }
    static Node predessor = null;
    static Node successor = null;
    static int state = 0;

    public static void predAndSuccHelper(Node node, int data) {
        if (node.data != data) {
            if (state == 0) {
                predessor = node;
            } else if (state == 1) {
                state = 2;
                successor = node;
            }
        } else {
            state = 1;
        }

        for (Node child: node.children) {
            predAndSuccHelper(child,data);
        }
    }

    public static void callPredAndScc(Node root, int data) {
        predAndSuccHelper(root, data);
        System.out.println("predessor: "+predessor.data);
        System.out.println("successor: "+successor.data);
    }

    public static boolean isSimilar (Node node1, Node node2) {
        if (node1.children.size() != node2.children.size()) return false;

        for (int i = 0; i < node1.children.size() - 1; i++) {
            boolean isGood = isSimilar(node1.children.get(i), node2.children.get(i));
            if (isGood == false) return false;
        }
        return true;
    }

    static int floor = Integer.MIN_VALUE;
    static int ceil = Integer.MAX_VALUE;
    static int floorSelected = 0;
    public static void ceilFloorHelper(Node node, int data) {
        if (node.data > data) {
            if (node.data < ceil) {
                ceil = node.data;
            }
        }
        if (node.data < data) {
            if (node.data > floor) {
                floor = node.data;
            }
        }

        for (Node child: node.children) {
            ceilFloorHelper(child, data);
        }
    }

    public static void ceilFloor(Node root, int data) {
        floor = Integer.MIN_VALUE;
        ceil = Integer.MAX_VALUE;
        ceilFloorHelper(root, data);
        System.out.println("data: "+data+" floor: "+floor+" ceil: "+ceil);
    }

    public static void kthLargest(Node root) {
        ceilFloor(root, Integer.MAX_VALUE);
        System.out.println("floor: "+floor);
        ceilFloor(root, floor);
        System.out.println("floor: "+floor);
        ceilFloor(root, floor);
        System.out.println("floor: "+floor);
    }

    public static void display(Node node) {

        String str = "";
        str += node.data + " --> \t";
        for (Node child: node.children) {
            str += child.data + ",";
        }

        System.out.print(str);
        System.out.println();

        for (Node child: node.children)  {
            display(child);
        }
    }

    public static int getSizeGTree(Node node) {
        if (node.children.size() == 0) return 1;
        int count = 1;
        for (Node child: node.children) {
            count += getSizeGTree(child);
        }
        return count;
    }

    public static int getMax(Node node) {
//        if (node.children.size() == 0) return node.data;
        int maxEle = node.data;
        for (Node child: node.children) {
            int tempMax = getMax(child);
            maxEle = (tempMax > maxEle) ? tempMax : maxEle;
        }
        return maxEle;
    }

    public static int getHeight(Node node) {
        if (node.children.size() == 0) return 1;

        int maxHeight = 0;
        for (Node child: node.children) {
            int tempHeight = getHeight(child);
            maxHeight = (tempHeight > maxHeight) ? tempHeight : maxHeight;
        }
        maxHeight += 1;

        return maxHeight;
    }

    public static void traversal(Node node) {
        // Node pre area
        System.out.println("node pre area: "+node.data);

        for (Node child: node.children) {
            System.out.println("pre edge from "+node.data+" to "+child.data);
            traversal(child);
            System.out.println("post edge from "+child.data+" to "+node.data);
        }

        System.out.println("node post area "+node.data);
    }

    public static void levelTraversal(Node node) {
        Queue<Node> parentQ = new ArrayDeque();
        Queue<Node> childQ = new ArrayDeque();
        parentQ.add(node);
        while (parentQ.size() > 0) {
            node = parentQ.remove();

            System.out.print("\t"+node.data);

            for (Node child: node.children) {
                childQ.add(child);
            }

            if (parentQ.size() == 0) {
                parentQ = childQ;
                childQ = new ArrayDeque<>();
                System.out.println();
            }
        }

    }

    public static void zigzagPrint(Node node) {
        Stack<Node> parentStack = new Stack<>();
        Stack<Node> childStack = new Stack<>();
        parentStack.add(node);
        int level = 1;

        while (parentStack.size() > 0) {
            node = parentStack.pop();
            System.out.print("\t"+node.data);

            if ((level%2) == 1) {
                for (Node child: node.children) {
                    childStack.push(child);
                }
            } else {
                for (int i = (node.children.size() - 1); i >= 0; i--) {
                    childStack.push(node.children.get(i));
                }
            }

            if (parentStack.size() == 0) {
                parentStack = childStack;
                childStack = new Stack<>();
                System.out.println();
                // REMEMBER LEVEL IS UP ONLY IF PARENT STACK IS EMPTY,
                // ELSE ITS JUST ONE NODE PROCESSED FROM THE STACK
                level += 1;
            }
        }
    }

    public static void printLevelOneQueue(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while (queue.size() > 0) {
            node = queue.remove();
            if (node == null) {
                if (queue.size() > 0) {
                    System.out.println();
                    queue.add(null);
                }
                continue;
            }

            System.out.print("\t" + node.data);
            for (Node child: node.children) {
                queue.add(child);
            }
        }
    }

    public static void printLevelOnSizeBases(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (queue.size() > 0) {
            int mainSize = queue.size();
            for(int i = 0; i < mainSize; i++) {
                node = queue.remove();
                System.out.print("\t"+node.data);
                // add children
                for (Node child: node.children) {
                    queue.add(child);
                }
            }
            // ONE LEVEL DONE, AS LOOP ENDED
            if (queue.size() > 0) {
                System.out.println();
            }
        }
    }

    public static void mirrorTree(Node node) {
        // BASE CONDITION MAY NOT REQUIRED
        if (node.children.size() == 0) return;
        int start = 0;
        int end = node.children.size() - 1;
        // REVERSE LOGIC
        while (start < end) {
            Node temp = node.children.get(start);
            node.children.set(start, node.children.get(end));
            node.children.set(end, temp);
//            Collections.swap(node.children, start, end);
            start++;
            end--;
        }
        // RECURSION
        for (Node child: node.children) {
            mirrorTree(child);
        }

    }

    public static void removeLeaves(Node node) {
        // ALWAYS REMOVE IN REVERSE LOOP
        for (int i = node.children.size() - 1; i >= 0; i--) {
            // PRE ORDER REMOVAL
            Node child = node.children.get(i);
            if (child.children.size() == 0) {
                node.children.remove(child);
            }
        }

        // RECURSION
        for (Node child: node.children) {
            removeLeaves(child);
        }
    }

    public static void linearize(Node node) {
        for (Node child: node.children) {
            linearize(child);
        }

        if (node.children.size() > 1) {
            Node lastChild = node.children.remove(node.children.size() - 1);
            Node secondLastChild = node.children.get(node.children.size() - 1);
            Node secondLastTail = getTail(secondLastChild);
            secondLastTail.children.add(lastChild);
        }
    }

    public static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
    }



    public static boolean findNode(Node node, int data) {
        if (node.data == data) return true;
        for (Node child: node.children) {
            boolean ans = findNode(child, data);
            if (ans == true) {
                return true;
            }
        }

        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
        if (node.data == data) {
            ArrayList<Integer> ret = new ArrayList<>();
            ret.add(node.data);
            return ret;
        }

        for (Node child: node.children) {
            ArrayList<Integer> ret = nodeToRootPath(child,data);
            if (ret.size() > 0) {
                ret.add(node.data);
                return ret;
            }
        }

        ArrayList<Integer> blank = new ArrayList<>();
        return blank;
    }

    public static ArrayList<Node> nodeToRootPathNode(Node node, int data) {
        if (node.data == data) {
            ArrayList<Node> ret = new ArrayList<>();
            ret.add(node);
            return ret;
        }

        for (Node child: node.children) {
            ArrayList<Node> ret = nodeToRootPathNode(child,data);
            if (ret.size() > 0) {
                ret.add(node);
                return ret;
            }
        }

        return new ArrayList<>();
    }

    public static Node lowestCommonAncestor(Node node, int data1, int data2) {
        ArrayList<Node> data1Ancestors = nodeToRootPathNode(node, data1);
        ArrayList<Node> data2Ancestors = nodeToRootPathNode(node, data2);

        if (data2Ancestors.size() > data1Ancestors.size()) {
            ArrayList<Node> temp = data2Ancestors;
            data2Ancestors = data1Ancestors;
            data1Ancestors = temp;
        }

        int end1 = data1Ancestors.size() - 1;
        int end2 = data2Ancestors.size() - 1;


        Node lastCommonAncestor = new Node();
        while (end1 >= 0 && end2 >= 0) {
            if (data1Ancestors.get(end1).data != data2Ancestors.get(end2).data) {
                return lastCommonAncestor;
            }
            lastCommonAncestor = data1Ancestors.get(end1);
            end1-=1;
            end2-=1;
        }
        return lastCommonAncestor;
    }

    public static int getDistance (Node node, int data1, int data2) {
        ArrayList<Node> ancestors1 = nodeToRootPathNode(node, data1);
        ArrayList<Node> ancestors2 = nodeToRootPathNode(node, data2);

        int end1 = ancestors1.size() - 1;
        int end2 = ancestors2.size() - 1;

//        int incr = 0;
        while (end1 >= 0 && end2 >= 0) {
            if (ancestors1.get(end1).data != ancestors2.get(end2).data) break;
            end1-=1;
            end2-=1;
//            incr += 1;
        }
        end1+=1;
        end2+=1;


//        int distance = ancestors1.size() - incr;
//        distance += ancestors2.size() - incr;
//        return distance;

        int distance = end1 + end2;
        return distance;
    }




}
