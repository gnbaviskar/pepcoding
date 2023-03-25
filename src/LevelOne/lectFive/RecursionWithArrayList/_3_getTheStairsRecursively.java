package LevelOne.lectFive.RecursionWithArrayList;

import java.util.ArrayList;

public class _3_getTheStairsRecursively {
    public static void main(String[] args) {
        System.out.println(getStairPaths(4));
    }

    // calling
    // System.out.println(getStairPaths(8));
    public static ArrayList<String> getStairPaths (int num) {
        if (num == 0) {
            // when 0 we need to loop the list to attach the one ele,
            // if n = 1, it will call 1 , 2, 3. The 1 will have 0 should return "" list to get the value 1
            ArrayList<String> ret = new ArrayList<>();
            ret.add("");
            return  ret;
        } else if (num < 0) {
            // to avoid the loop, keep it empty when n < 0
            ArrayList<String> ret = new ArrayList<>();
            return  ret;
        }
        // three moves at every point
        ArrayList<String> list1 = getStairPaths(num - 1); // 1
        ArrayList<String> list2 = getStairPaths(num - 2); // 2
        ArrayList<String> list3 = getStairPaths(num - 3); // 3
        // our ans
        ArrayList<String> returnList = new ArrayList<String>();
        for (String path: list1) {
            returnList.add(1+path); // as first move is 1, attach 1 to the paths. 111 for 4. attach 1 => 1111
        }
        for (String path: list2) {
            returnList.add(2+path); // second move => 2
        }
        for (String path: list3) {
            returnList.add(3+path); // third move => 3
        }
        return returnList;
    }
}
